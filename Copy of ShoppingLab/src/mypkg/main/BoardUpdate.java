package mypkg.main;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardUpdate {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		Board bean = new Board();
		
		//���� �����ϱ�(setter)
		bean.setNo( 1 ); //1�� �� �����ϱ�				
		bean.setSubject( "ȣȣȣ" );
		bean.setWriter( "hong" );
		bean.setPassword( "5555" );
		bean.setContent( "�Խù��� �����մϴ�." );
		bean.setReadhit( 10 );		
		bean.setRegdate( "2016/08/15" );
		bean.setGroupno( 1 );
		bean.setOrderno(  0 );
		bean.setDepth( 0 );		
		
		BoardDao dao = new BoardDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}

