package mypkg.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DatabaseDao extends SuperDao {
	public int SaleItem(String id, Map<Integer, Integer> shoplists) {
		//���̵� id�� ���� ��ٱ��� ��� shoplists�� �̿��Ͽ� �����Ѵ�.
		//1. ��ǰ�� ��� ������ �����Ѵ�. ( update )
		//2. �ֹ� ���̺� �μ�Ʈ�Ѵ�. ( insert )
		//3. �ֹ� �� ���̺� �� ������ �μ�Ʈ�Ѵ�. ( insert )
		//4. �ش� ���� ���� ���ϸ����� �������ش�. ( update )
		
		//�����ؾ� �� ������
		//1. ���� ���� ���ϸ��� ������ Ȯ��
		//2. ��ǰ���� ���� ��� ���� Ȯ��
		//3. ���� �߻��ߴ°� Ȯ��
		//4. ���� ���ϸ��� ������ ���� ���� Ȯ��
		//5. ��ǰ���� ����� ��� ���� Ȯ��
		
		//�������� �������� ���̱� ���Ͽ� pstmt1 ~ pstmt4���� ���� 
		PreparedStatement pstmt1 = null, pstmt2 = null, pstmt3 = null, pstmt4 = null ;		 
		
		int cnt = -99999 ; //������ �ǹ�
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }
			conn.setAutoCommit( false ); 
			
			//1. ��ǰ�� ��� ������ �����Ѵ�. ( update )
			String sql1 = "update products set stock = stock - ? where num = ? " ;
			pstmt1 = this.conn.prepareStatement( sql1 ) ;			
			Set<Integer> keylist = shoplists.keySet() ;
			for( Integer pnum  : keylist ){
				int count = shoplists.get( pnum ) ;
				//System.out.println( pnum + "/"  + count ); 
				pstmt1.setInt(1, count);
				pstmt1.setInt(2, pnum);				
				cnt = pstmt1.executeUpdate() ;
			}
			
			//2. �ֹ� ���̺� �μ�Ʈ�Ѵ�. ( insert )
			String sql2 = "insert into orders(oid, mid, orderdate) " ; 
			sql2 += " values(seqoid.nextval, ?, sysdate )  " ;			
			pstmt2 = this.conn.prepareStatement( sql2 ) ;	
			pstmt2.setString(1, id); 
			cnt = pstmt2.executeUpdate() ;
			
			//2-1 : ���� �ֱ��� ���� ��ȣ�� ���Ѵ�.
			String sql21 = "select max(oid) as oid from orders " ;
			PreparedStatement pstmt21 = this.conn.prepareStatement( sql21 ) ;
			ResultSet rs21 = pstmt21.executeQuery() ;
			int invoice = 0 ; //���� ��ȣ
			if ( rs21.next() ) {
				invoice = rs21.getInt( "oid") ;
			}
			try {
				if( rs21 != null ){ rs21.close(); }
				if( pstmt21 != null ){ pstmt21.close(); } 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//3. �ֹ� �� ���̺� �� ������ �μ�Ʈ�Ѵ�. ( insert )
			String sql3 = "insert into orderdetails(odid, oid, pnum, qty) " ;
			sql3 += " values(seqodid.nextval, ?, ?, ?) " ;
			
			pstmt3 = this.conn.prepareStatement( sql3 ) ;			
			//Set<Integer> keylist = shoplists.keySet() ;
			for( Integer pnum  : keylist ){
				int count = shoplists.get( pnum ) ; 
				pstmt3.setInt(1, invoice);
				pstmt3.setInt(2, pnum);	
				pstmt3.setInt(3, count);
				cnt = pstmt3.executeUpdate() ;
			}
			
			//4. �ش� ���� ���� ���ϸ����� �������ش�. ( update )
			String sql4 = " update members set mpoint = mpoint + 100 where id = ?  " ;
			pstmt4 = this.conn.prepareStatement( sql4 ) ;
			pstmt4.setString(1,  id ); 
			cnt = pstmt4.executeUpdate() ;
			
			conn.commit(); 
		} catch (Exception e) {
			//����Ŭ���� ������ ���� ������� �����Ѵ�.
			//SQLException Ŭ������ getErrorCode() �޼ҵ带 �̿��Ͽ� ���� �� �ִ�.
			//���� ī������ �ǹ̿� �ٸ��� �����Ͽ��� �ϹǷ� ���̳ʽ��� �ٿ� �����ϵ��� �Ѵ�.
			
			SQLException sqlErr = (SQLException)e  ;
			cnt = - sqlErr.getErrorCode() ;			
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally{
			try {
				if( pstmt1 != null ){ pstmt1.close(); }
				if( pstmt2 != null ){ pstmt2.close(); }
				if( pstmt3 != null ){ pstmt3.close(); }
				if( pstmt4 != null ){ pstmt4.close(); }
				
				this.closeConnection();
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return cnt ;
	}

	public List<Order> SelectSaleInfoByPk(int oid) {
		return null;
	}
}