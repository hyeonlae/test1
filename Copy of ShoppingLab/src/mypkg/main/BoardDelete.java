package mypkg.main;

import mypkg.model.BoardDao;

public class BoardDelete {
	public static void main(String[] args) {
		System.out.println("삭제하기");
		int no = 11 ;
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.DeleteData( no ) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}