package mypkg.main;

import mypkg.model.Member;
import mypkg.model.MemberDao;

public class MemberInsert {
	public static void main(String[] args) {
		System.out.println("�߰��ϱ�");
		Member bean = new Member();
		
		//���� �����ϱ�(setter)
		bean.setAddress1("���� ����");
		bean.setAddress2("111����");
		bean.setGender("����");
		bean.setHiredate("2016/06/21");
		bean.setHobby("�籸");
		bean.setId("sim"); 
		//bean.setId("hong");  
		bean.setJob("�л�");
		bean.setMpoint(10);
		bean.setName("������");
		bean.setPassword("1234");
		bean.setSalary(5000);
		bean.setZipcode("123-456");
		
		MemberDao dao = new MemberDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.InsertData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else if ( cnt == -1400) {
			System.out.println("not null ���� ���� ����");
		} else if ( cnt == -1) {
			System.out.println("primary key ���� ���� ����");

		} else{
			System.out.println("����");
		}
	}
}