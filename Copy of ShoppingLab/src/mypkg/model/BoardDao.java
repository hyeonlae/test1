package mypkg.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao extends SuperDao {
	
	public int InsertData( Board bean ){
		System.out.println( bean.toString() ); 
		String sql = " insert into boards(no,subject,writer,password,content,readhit,regdate,groupno,orderno,depth) " ;
		sql += " values(myboard.nextval,?,?,?,?,?,to_date(?, 'yyyy/MM/dd'),? ,? ,? ) " ;

		PreparedStatement pstmt = null ;
		int cnt = -99999 ;
		try {
			if( conn == null ){ super.conn = super.getConnection() ; }
			conn.setAutoCommit( false );
			pstmt = super.conn.prepareStatement(sql) ;
			
			pstmt.setString(1, bean.getSubject()) ;
			pstmt.setString(2, bean.getWriter()) ;
			pstmt.setString(3, bean.getPassword()) ;
			pstmt.setString(4, bean.getContent()) ;
			pstmt.setInt(5, bean.getReadhit()) ;
			pstmt.setString(6, bean.getRegdate()) ; 
			pstmt.setInt(7, bean.getGroupno()) ;
			pstmt.setInt(8, bean.getOrderno()) ;
			pstmt.setInt(9, bean.getDepth()) ;
			
			cnt = pstmt.executeUpdate() ; 
			conn.commit(); 
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			cnt = - err.getErrorCode() ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally{
			try {
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}
	public int UpdateData( Board bean ){
		System.out.println( bean.toString() ); 
		String sql = " update boards set subject=?,writer=?,password=?,content=?, " ;
		sql += " readhit=?,regdate=to_date(?, 'yyyy/MM/dd'),groupno=?,orderno=?,depth=? " ;
		sql += " where no=? " ;
		PreparedStatement pstmt = null ;
		int cnt = -99999 ;
		try {
			if( conn == null ){ super.conn = super.getConnection() ; }
			conn.setAutoCommit( false );
			pstmt = super.conn.prepareStatement(sql) ;

			pstmt.setString(1, bean.getSubject()) ;
			pstmt.setString(2, bean.getWriter()) ;
			pstmt.setString(3, bean.getPassword()) ;
			pstmt.setString(4, bean.getContent()) ;
			pstmt.setInt(5, bean.getReadhit()) ;
			pstmt.setString(6, bean.getRegdate()) ; 
			pstmt.setInt(7, bean.getGroupno()) ;
			pstmt.setInt(8, bean.getOrderno()) ;
			pstmt.setInt(9, bean.getDepth()) ;
			pstmt.setInt(10, bean.getNo()) ; //글 번호
			
			cnt = pstmt.executeUpdate() ; 
			conn.commit(); 
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			cnt = - err.getErrorCode() ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally{
			try {
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}
	public int DeleteData( int pmkey ){
		String sql = " delete from boards where no = ? " ;
		PreparedStatement pstmt = null ;
		int cnt = -99999 ;
		try {
			if( conn == null ){ super.conn = super.getConnection() ; }
			conn.setAutoCommit( false );
			pstmt = super.conn.prepareStatement(sql) ;
			pstmt.setInt(1, pmkey);
			
			cnt = pstmt.executeUpdate() ; 
			conn.commit(); 
		} catch (Exception e) {
			SQLException err = (SQLException)e ;			
			cnt = - err.getErrorCode() ;			
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally{
			try {
				if( pstmt != null ){ pstmt.close(); }
				super.closeConnection(); 
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return cnt ;
	}	
	
	public BoardDao() {
	
	}
	public List<Board> SelectDataList() {
		//모든 데이터를 조회한다.
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select * from boards order by no " ;
		List<Board> lists = new ArrayList<Board>();
		try {
			if( conn == null ){ super.conn = super.getConnection() ; }
			pstmt = super.conn.prepareStatement(sql) ;			
			rs = pstmt.executeQuery() ;			
			while( rs.next() ){
				Board bean = new Board();
				bean.setNo( rs.getInt("no") );				
				bean.setSubject( rs.getString("subject") );
				bean.setWriter( rs.getString("writer") );
				bean.setPassword( rs.getString("password") );
				bean.setContent( rs.getString("content") );
				bean.setReadhit( rs.getInt("readhit") );				
				
				//날짜는 String.valueOf( rs.getDate() ) 의 형식
				bean.setRegdate( String.valueOf( rs.getDate("regdate"))) ;
				
				bean.setGroupno( rs.getInt("groupno") );
				bean.setOrderno( rs.getInt("orderno") );
				bean.setDepth( rs.getInt("depth") );
							 				 
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
	//특정한 게시물에 대한 정보를 조회한다.
	public Board SelectDataByPk( int no ){
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;				
		String sql = "select * " ;
		sql += " from boards " ; 
		sql += " where no = ? " ;
		Board bean = null ;
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }			
			pstmt = this.conn.prepareStatement(sql) ;			
			pstmt.setInt( 1, no   ); 
			rs = pstmt.executeQuery() ; 
			
			if ( rs.next() ) { 
				bean = new Board() ;
				bean.setNo( rs.getInt("no") );				
				bean.setSubject( rs.getString("subject") );
				bean.setWriter( rs.getString("writer") );
				bean.setPassword( rs.getString("password") );
				bean.setContent( rs.getString("content") );
				bean.setReadhit( rs.getInt("readhit") );				
				bean.setRegdate( String.valueOf( rs.getDate("regdate"))) ;
				bean.setGroupno( rs.getInt("groupno") );
				bean.setOrderno( rs.getInt("orderno") );
				bean.setDepth( rs.getInt("depth") );
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
		return bean  ;
	}
	
	public List<Board> SelectDataList(int beginRow, int endRow, String mode, String keyword) {
		//랭킹을 이용하여 조회하되 writer이 작성한 항목만 조회한다.
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		String sql = "select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, ranking "; 
		sql += " from " ; 
		sql += " ( " ;
		sql += " select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, rank() over( order by no desc ) as ranking " ;
		sql += " from boards  " ;
		if( mode.equals("all") ==  false ){
			sql += " where " + mode + " like '"+ keyword + "' " ; //작성자 필터링 조건
		}
		sql += " ) " ;
		sql += " where ranking between ? and ? " ; 

		List<Board> lists = new ArrayList<Board>() ;
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }			
			pstmt = this.conn.prepareStatement(sql) ;			
			pstmt.setInt(1, beginRow);
			pstmt.setInt(2, endRow); 
			
			rs = pstmt.executeQuery() ; 
			while ( rs.next() ) {
				Board bean = new Board() ; 
				bean.setNo( rs.getInt("no") );				
				bean.setSubject( rs.getString("subject") );
				bean.setWriter( rs.getString("writer") );
				bean.setPassword( rs.getString("password") );
				bean.setContent( rs.getString("content") );
				bean.setReadhit( rs.getInt("readhit") );				
				bean.setRegdate( String.valueOf( rs.getDate("regdate"))) ;
				bean.setGroupno( rs.getInt("groupno") );
				bean.setOrderno( rs.getInt("orderno") );
				bean.setDepth( rs.getInt("depth") );			
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
	
	public List<Board> SelectDataList(int beginRow, int endRow) {
		//랭킹을 이용하여 모든 데이터를 조회한다.
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		
		String sql = "select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, ranking "; 
		sql += " from " ; 
		sql += " ( " ;
		sql += " select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, rank() over( order by no desc ) as ranking " ;
		sql += " from boards  " ;
		sql += " ) " ;
		sql += " where ranking between ? and ? " ; 

		List<Board> lists = new ArrayList<Board>() ;
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }			
			pstmt = this.conn.prepareStatement(sql) ;
			pstmt.setInt(1, beginRow);
			pstmt.setInt(2, endRow); 
			
			rs = pstmt.executeQuery() ; 
			while ( rs.next() ) {
				Board bean = new Board() ; 
				bean.setNo( rs.getInt("no") );				
				bean.setSubject( rs.getString("subject") );
				bean.setWriter( rs.getString("writer") );
				bean.setPassword( rs.getString("password") );
				bean.setContent( rs.getString("content") );
				bean.setReadhit( rs.getInt("readhit") );				
				bean.setRegdate( String.valueOf( rs.getDate("regdate"))) ;
				bean.setGroupno( rs.getInt("groupno") );
				bean.setOrderno( rs.getInt("orderno") );
				bean.setDepth( rs.getInt("depth") );			
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
	public int UpdateReadhit(int no) {
		PreparedStatement pstmt = null ;
		String sql = " update boards set readhit = readhit + 1 " ;
		sql += " where no=? " ;
		
		int cnt = -99999 ; //부정의 의미
		try {
			if( this.conn == null ){ this.conn = this.getConnection() ; }
			conn.setAutoCommit( false ); 
			pstmt = this.conn.prepareStatement( sql ) ;
			
			pstmt.setInt(1, no) ; 
			
			cnt = pstmt.executeUpdate() ;
			conn.commit(); 
		} catch (Exception e) {
			e.printStackTrace();
			cnt = -99999 ;
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally{
			try {
				if( pstmt != null ){ pstmt.close(); }
				this.closeConnection();
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return cnt ; 
	}
	public int SelectTotalCount(String mode , String keyword) {
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select count(*) as cnt from boards" ;
		
		if (mode.equals("all") == false) {  //전체 모드가 아니면 이 문장을 실행
			sql += " where " + mode + " like '" + keyword + "' " ;
		} 
		
		int cnt = 0 ; //없는 경우의 기본 값
		try {
			if( this.conn == null ){this.conn = this.getConnection() ;}
			pstmt = this.conn.prepareStatement(sql) ;
			rs = pstmt.executeQuery() ;
			
			if (rs.next()){
				cnt = rs.getInt("cnt") ;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try{
				if(rs != null){rs.close() ;}
				if(pstmt != null){pstmt.close();}
			}catch (Exception e2) {
				e2.printStackTrace() ;
			}
		}
		return cnt;
	}
}











