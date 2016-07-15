package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;


public class BoardSelectByPk {
	public static void main(String[] args) {
		System.out.println("1건 정보 보기");
		System.out.println("출력 결과\n=====================");
		BoardDao dao = new BoardDao() ;		
		int no = 3 ; 		
		Board bean = dao.SelectDataByPk( no ) ;
		if ( bean == null ) {
			System.out.println( "찾으시는 데이터가 없습니다." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}