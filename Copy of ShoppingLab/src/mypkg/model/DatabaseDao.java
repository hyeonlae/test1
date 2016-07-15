package mypkg.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DatabaseDao extends SuperDao {
	public int SaleItem(String id, Map<Integer, Integer> shoplists) {
		//아이디가 id인 고객이 장바구니 목록 shoplists을 이용하여 구매한다.
		//1. 상품의 재고 수량은 감산한다. ( update )
		//2. 주문 테이블에 인서트한다. ( insert )
		//3. 주문 상세 테이블에 상세 내역을 인서트한다. ( insert )
		//4. 해당 고객에 대한 마일리지를 적립해준다. ( update )
		
		//검증해야 할 데이터
		//1. 현재 고객의 마일리지 적립급 확인
		//2. 상품들의 현재 재고 수량 확인
		//3. 매출 발생했는가 확인
		//4. 고객의 마일리지 적립급 갱신 여부 확인
		//5. 상품들의 변경된 재고 수량 확인
		
		//개발자의 가독성을 높이기 위하여 pstmt1 ~ pstmt4으로 구현 
		PreparedStatement pstmt1 = null, pstmt2 = null, pstmt3 = null, pstmt4 = null ;		 
		
		int cnt = -99999 ; //부정의 의미
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }
			conn.setAutoCommit( false ); 
			
			//1. 상품의 재고 수량은 감산한다. ( update )
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
			
			//2. 주문 테이블에 인서트한다. ( insert )
			String sql2 = "insert into orders(oid, mid, orderdate) " ; 
			sql2 += " values(seqoid.nextval, ?, sysdate )  " ;			
			pstmt2 = this.conn.prepareStatement( sql2 ) ;	
			pstmt2.setString(1, id); 
			cnt = pstmt2.executeUpdate() ;
			
			//2-1 : 가장 최근의 송장 번호를 구한다.
			String sql21 = "select max(oid) as oid from orders " ;
			PreparedStatement pstmt21 = this.conn.prepareStatement( sql21 ) ;
			ResultSet rs21 = pstmt21.executeQuery() ;
			int invoice = 0 ; //송장 번호
			if ( rs21.next() ) {
				invoice = rs21.getInt( "oid") ;
			}
			try {
				if( rs21 != null ){ rs21.close(); }
				if( pstmt21 != null ){ pstmt21.close(); } 
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			//3. 주문 상세 테이블에 상세 내역을 인서트한다. ( insert )
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
			
			//4. 해당 고객에 대한 마일리지를 적립해준다. ( update )
			String sql4 = " update members set mpoint = mpoint + 100 where id = ?  " ;
			pstmt4 = this.conn.prepareStatement( sql4 ) ;
			pstmt4.setString(1,  id ); 
			cnt = pstmt4.executeUpdate() ;
			
			conn.commit(); 
		} catch (Exception e) {
			//오라클에는 고유한 에러 상수들이 존재한다.
			//SQLException 클래스의 getErrorCode() 메소드를 이용하여 구할 수 있다.
			//실제 카운터의 의미와 다르게 구분하여야 하므로 마이너스를 붙여 구분하도록 한다.
			
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