package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardInsert {
	public static void main(String[] args) {
		System.out.println("�߰��ϱ�");
		Board bean = new Board();
		
		//���� �����ϱ�(setter)
		//bean.setNo( 0 ); //�۹�ȣ�� �������� ó���� ��				
		bean.setSubject( "jdbc" );
		bean.setWriter( "hong" );
		bean.setPassword( "1234" );
		bean.setContent( "�� �������" );
		bean.setReadhit( 0 );		
		bean.setRegdate( "2016/07/17" );
		bean.setGroupno( 0 );
		bean.setOrderno(  0 );
		bean.setDepth( 0 );		
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.InsertData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}