package mypkg.main;

import mypkg.model.BoardDao;

public class BoardDelete {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		int no = 11 ;
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.DeleteData( no ) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}