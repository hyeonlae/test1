package mypkg.main;

import mypkg.model.MemberDao;

public class MemberDelete {
	public static void main(String[] args) {
		System.out.println("삭제하기");
		String id = "sim" ;
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.DeleteData( id ) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}