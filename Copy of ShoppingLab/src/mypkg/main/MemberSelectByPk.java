package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberSelectByPk {
	public static void main(String[] args) {
		System.out.println("1건 정보 보기");
		System.out.println("출력 결과\n=====================");
		MemberDao dao = new MemberDao() ;		
		String id = "hong" ;		
		Member bean = dao.SelectDataByPk(id) ;
		if ( bean == null ) {
			System.out.println( "찾으시는 데이터가 없습니다." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}