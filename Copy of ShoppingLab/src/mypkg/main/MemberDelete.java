package mypkg.main;

import mypkg.model.MemberDao;

public class MemberDelete {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		String id = "sim" ;
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.DeleteData( id ) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}