package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;


public class BoardSelectByPk {
	public static void main(String[] args) {
		System.out.println("1�� ���� ����");
		System.out.println("��� ���\n=====================");
		BoardDao dao = new BoardDao() ;		
		int no = 3 ; 		
		Board bean = dao.SelectDataByPk( no ) ;
		if ( bean == null ) {
			System.out.println( "ã���ô� �����Ͱ� �����ϴ�." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}