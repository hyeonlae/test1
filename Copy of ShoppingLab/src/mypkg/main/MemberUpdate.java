package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberUpdate {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		Member bean = new Member();
		
		//���� �����ϱ�(setter)
		bean.setAddress1("���� ����");
		bean.setAddress2("222����");
		bean.setGender("����");
		bean.setHiredate("2016/06/21");
		bean.setHobby("�籸");
		bean.setId("sim"); 
		//bean.setId("hong");  
		bean.setJob("�л�");
		bean.setMpoint(9999);
		bean.setName("�ɿ���");
		bean.setPassword("56784");
		bean.setSalary(5000);
		bean.setZipcode("123-456");		
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}

