package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberUpdate {
	public static void main(String[] args) {
		System.out.println("수정하기");
		Member bean = new Member();
		
		//정보 설정하기(setter)
		bean.setAddress1("마포 공덕");
		bean.setAddress2("222번지");
		bean.setGender("여자");
		bean.setHiredate("2016/06/21");
		bean.setHobby("당구");
		bean.setId("sim"); 
		//bean.setId("hong");  
		bean.setJob("학생");
		bean.setMpoint(9999);
		bean.setName("심영구");
		bean.setPassword("56784");
		bean.setSalary(5000);
		bean.setZipcode("123-456");		
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}

