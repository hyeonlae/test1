package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberSelectByPk {
	public static void main(String[] args) {
		System.out.println("1�� ���� ����");
		System.out.println("��� ���\n=====================");
		MemberDao dao = new MemberDao() ;		
		String id = "hong" ;		
		Member bean = dao.SelectDataByPk(id) ;
		if ( bean == null ) {
			System.out.println( "ã���ô� �����Ͱ� �����ϴ�." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}