package mypkg.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDao extends SuperDao{

	public List<Order> SelectOrderList() {
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;				
		String sql = "select * from orders " ;
		List<Order> lists = new ArrayList<Order>() ;
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }			
			pstmt = this.conn.prepareStatement(sql) ;			
			rs = pstmt.executeQuery() ; 
			while ( rs.next() ) {
				Order bean = new Order() ; 
				bean.setMid( rs.getString("mid") );				
				bean.setOid( rs.getInt("oid") );				
				bean.setOrderdate( String.valueOf( rs.getDate("orderdate") ));			
				lists.add( bean ) ; 
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally{
			try {
				if( rs != null){ rs.close(); } 
				if( pstmt != null){ pstmt.close(); } 
				this.closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		} 		
		return lists  ;
	}

}