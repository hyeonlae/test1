package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberInsert {
	public static void main(String[] args) {
		System.out.println("추가하기");
		Member bean = new Member();
		
		//정보 설정하기(setter)
		bean.setAddress1("강남 역삼");
		bean.setAddress2("111번지");
		bean.setGender("남자");
		bean.setHiredate("2016/06/21");
		bean.setHobby("당구");
		bean.setId("sim"); 
		//bean.setId("hong");  
		bean.setJob("학생");
		bean.setMpoint(10);
		bean.setName("심형래");
		bean.setPassword("1234");
		bean.setSalary(5000);
		bean.setZipcode("123-456");
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.InsertData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else if ( cnt == -1400) {
			System.out.println("not null 제약 조건 위배");
		} else if ( cnt == -1) {
			System.out.println("primary key 제약 조건 위배");

		} else{
			System.out.println("성공");
		}
	}
}