package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardInsert {
	public static void main(String[] args) {
		System.out.println("추가하기");
		Board bean = new Board();
		
		//정보 설정하기(setter)
		//bean.setNo( 0 ); //글번호는 시퀀스가 처리해 줌				
		bean.setSubject( "jdbc" );
		bean.setWriter( "hong" );
		bean.setPassword( "1234" );
		bean.setContent( "넘 어려워요" );
		bean.setReadhit( 0 );		
		bean.setRegdate( "2016/07/17" );
		bean.setGroupno( 0 );
		bean.setOrderno(  0 );
		bean.setDepth( 0 );		
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.InsertData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}