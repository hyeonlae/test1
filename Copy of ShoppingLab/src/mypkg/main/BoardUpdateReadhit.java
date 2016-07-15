package mypkg.main;

import mypkg.model.BoardDao;

public class BoardUpdateReadhit {
	public static void main(String[] args) {
		System.out.println("수정하기");
		int no = 5 ; //조회수 1증가
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.UpdateReadhit( no ) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}