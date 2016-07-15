package mypkg.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Member;
import mypkg.model.MemberDao;
import mypkg.utility.Validator;
public class MemberInsertController implements SuperController, Validator{
	private HttpServletRequest request ;
	private Member bean = null ;
	
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.request = request ; 
		
		bean  = new Member();
		bean.setAddress1( request.getParameter("address1") );	
		bean.setAddress2( request.getParameter("address2") );
		bean.setGender( request.getParameter("gender") );
		bean.setHiredate( request.getParameter("hiredate") );		
		bean.setId( request.getParameter("id") );
		bean.setJob( request.getParameter("job") );
		bean.setMpoint( Integer.parseInt(request.getParameter("mpoint") ));
		bean.setName( request.getParameter("name") );
		bean.setPassword( request.getParameter("password") );
		bean.setSalary( Integer.parseInt(request.getParameter("salary") ));
		bean.setZipcode( request.getParameter("zipcode") );
		
		//���õ� ���� ��ŭ�� �迭�� ����� ���� �� �̰��� ��� ������ �����Ѵ�.
		String[] hobby = request.getParameterValues("hobby") ;
		bean.setHobby( hobby );
		
		String url = "";
		if ( this.validate() == false ) {
			url = "/member/meInsertForm.jsp";  
			this.request.setAttribute("bean", bean);  // <- ȸ�������߿� ������ ������ �ʱ�ȭ �Ǵ°��� ����.  ���ε��� �Ѵ� (�����͵� ����)
		}else{
			url = "/member/meLoginForm.jsp";
			//DAO ��ü�� �����Ѵ�.
			MemberDao mdao = new MemberDao();			
			int cnt = -99999 ; 			
			//Bean ��ü�� �̿��Ͽ� �ش� �Խù��� �߰��Ѵ�.
			cnt = mdao.InsertData(bean) ;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(this.request, response);		
	}
	@Override
	public boolean validate() {		
		boolean isCheck = true ; //�⺻ ������ true�̰�, ��ȿ�� �˻翡 ������ ����� false���� ����
		if( bean.getId().length() < 4 || bean.getId().length() > 10 ){
			System.out.println("ȣȣȣ");
			this.request.setAttribute("errid", "���̵�� 4�ڸ� �̻� 10�ڸ� �����̾�� �մϴ�.");
			isCheck = false  ;
		}
		//�ּ� salary �� 100��
		int salary = 100 ;
		if(bean.getSalary() < 100){
			this.request.setAttribute("errsalary", "�ּ� �޿��� 100�� �̻� �̿����մϴ�.");
			isCheck = false ;
		}
		//���� �� �ݵ�� üũ�� �Ǿ�� �մϴ�.
		if(bean.getGender() == null){
			this.request.setAttribute("errgender", "������ �ݵ�� üũ�ؾ� �մϴ�.");
			isCheck = false ;
		}
		String[] hobby = bean.getHobby().split(",");
		//��̴� �ּ� 2�� �̻��̾�� �մϴ�.
		if(hobby.length < 2){
			this.request.setAttribute("errhobby", "��̴� 2�� �̻� �������ּ���");
			isCheck = false ;
		}
		
		//������ �ݵ�� ���� �ϼž� �մϴ�.
		if(bean.getJob().equals("-") ){
				this.request.setAttribute("errjob", "������ ������ �ּ���");
				isCheck = false ;
		}
		//���� ��ȣ�� �ʼ� ���� �Դϴ�.
		if(bean.getZipcode().equals("")){
			this.request.setAttribute("errzipcode", "���� ��ȣ�� �ʼ� ���� �Դϴ�");
			isCheck = false ;
		}
		//�ּҴ� �ʼ� �����Դϴ�.
		if(bean.getAddress2().equals("")){
			this.request.setAttribute("erraddress2", "���� �ּҸ� �Է��ϼž� �մϴ�.");
			isCheck = false ;
		}
		return isCheck ;
	}
}