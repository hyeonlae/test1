package mypkg.main;

import mypkg.model.BoardDao;

public class BoardUpdateReadhit {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		int no = 5 ; //��ȸ�� 1����
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.UpdateReadhit( no ) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}