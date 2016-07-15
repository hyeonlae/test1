package mypkg.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JoinDao extends SuperDao{
	public List<Join01> SelectJoin01() {
		PreparedStatement pstmt = null ;
		
		String sql = "select members.id, members.name, boards.subject, boards.content " ; 
		sql += " from members inner join  boards " ;
		sql += " 	on members.id = boards.writer " ;
		
		ResultSet rs = null ;
		//개발자 처리 영역 1 : 리스트 컬렉션의 Join01는 바뀔 수 있다
		List<Join01> lists = new ArrayList<Join01>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			//개발자 처리 영역 2 : 물음표가 있으면 여기서 치환하세요
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				//개발자 처리 영역 3 : bean 객체에 값을 설정한다.(setter)
				Member member = new Member();
				member.setId( rs.getString("id") ) ;
				member.setName( rs.getString("name")) ;
				//////////////////////////////////////////////////////////////////////////////////
				Board board = new Board();
				board.setSubject( rs.getString("subject") );
				board.setContent( rs.getString("content") );
				//////////////////////////////////////////////////////////////////////////////////
				Join01 bean = new Join01();
				bean.setBoard(board);
				bean.setMember(member);
				//////////////////////////////////////////////////////////////////////////////////
				lists.add( bean ) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
	}

	public List<Join02> SelectJoin02() {
		PreparedStatement pstmt = null ;
		String sql = "select m.name mname, p.name pname, od.qty, p.price, p.price * od.qty as amount   " ; 
		sql += " from (( members m inner join orders o " ;
		sql += " on m.id=o.mid ) inner join orderdetails od " ;
		sql += " on o.oid=od.oid ) inner join products p" ;
		sql += " on od.pnum = p.num " ;
		sql += " order by m.name desc " ; 
		ResultSet rs = null ;
		List<Join02> lists = new ArrayList<Join02>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				Join02 join = new Join02();
				join.setAmount( rs.getInt("amount") );  
				join.setMname( rs.getString("mname") ); 
				join.setPname( rs.getString("pname") ); 
				join.setPrice( rs.getInt("price") ); 
				join.setQty( rs.getInt("qty") );  
				lists.add( join ) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
	}

	public List<Join02> SelectJoin03() {
		PreparedStatement pstmt = null ;
		String sql = "select p.name pname, sum(p.price * od.qty) as amount " ;
		sql += " from orderdetails od inner join products p " ;
		sql += " 	on od.pnum=p.num  " ;
		sql += " group by p.name " ;
		ResultSet rs = null ;
		List<Join02> lists = new ArrayList<Join02>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				Join02 join = new Join02() ;
				join.setAmount( rs.getInt("amount") );  
				join.setPname( rs.getString("pname") );  				
				lists.add( join ) ; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
	}

	public List<Join02> SelectJoin04( int amount ) {
		PreparedStatement pstmt = null ;
		String sql = "select p.name pname, sum(p.price * od.qty) as amount " ;
		sql += " from orderdetails od inner join products p " ;
		sql += " on od.pnum=p.num " ;
		sql += " group by p.name  " ;
		sql += " having sum(p.price * od.qty) >= ? " ;
		ResultSet rs = null ;
		List<Join02> lists = new ArrayList<Join02>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			pstmt.setInt(1, amount);
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				Join02 join = new Join02() ;
				join.setAmount( rs.getInt("amount") );  
				join.setPname( rs.getString("pname") );  				
				lists.add( join ) ; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
	}

	public List<Join02> SelectJoin05(int amount, String item) {
		PreparedStatement pstmt = null ;
		String sql = "select p.name pname, sum(p.price * od.qty) as amount " ;
		sql += " from orderdetails od inner join products p " ;
		sql += " on od.pnum=p.num " ;
		sql += " and p.name <> ? " ; 
		sql += " group by p.name  " ;
		sql += " having sum(p.price * od.qty) >= ? " ;
		ResultSet rs = null ;
		List<Join02> lists = new ArrayList<Join02>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			pstmt.setString(1, item);
			pstmt.setInt(2, amount);
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				Join02 join = new Join02() ;
				join.setAmount( rs.getInt("amount") );  
				join.setPname( rs.getString("pname") );  				
				lists.add( join ) ; 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
	}
}

/*  조인을 위한 탬플릿
		PreparedStatement pstmt = null ;
		String sql = "바꿔야죠" ;
		ResultSet rs = null ;
		//개발자 처리 영역 1 : 리스트 컬렉션의 Join02는 바뀔 수 있다
		List<Join02> lists = new ArrayList<Join02>();
		try {			
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = conn.prepareStatement( sql ) ;
			//개발자 처리 영역 2 : 물음표가 있으면 여기서 치환하세요
			rs = pstmt.executeQuery() ;
			while( rs.next() ){
				Join02 bean = new Join02();
				//개발자 처리 영역 3 : bean 객체에 값을 설정한다.(setter) 
				lists.add( bean ) ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if( rs != null ){ rs.close(); }
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}		
		return lists ;
*/