package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardUpdate {
	public static void main(String[] args) {
		System.out.println("수정하기");
		Board bean = new Board();
		
		//정보 설정하기(setter)
		bean.setNo( 1 ); //1번 글 수정하기				
		bean.setSubject( "호호호" );
		bean.setWriter( "hong" );
		bean.setPassword( "5555" );
		bean.setContent( "게시물을 수정합니다." );
		bean.setReadhit( 10 );		
		bean.setRegdate( "2016/08/15" );
		bean.setGroupno( 1 );
		bean.setOrderno(  0 );
		bean.setDepth( 0 );		
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}

