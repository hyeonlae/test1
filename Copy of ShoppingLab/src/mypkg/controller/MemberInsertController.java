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
		
		//선택된 갯수 만큼이 배열로 만들어 지는 데 이것을 멤버 변수에 대입한다.
		String[] hobby = request.getParameterValues("hobby") ;
		bean.setHobby( hobby );
		
		String url = "";
		if ( this.validate() == false ) {
			url = "/member/meInsertForm.jsp";  
			this.request.setAttribute("bean", bean);  // <- 회원가입중에 오류가 떳을때 초기화 되는것을 방지.  바인딩을 한다 (다음것도 있음)
		}else{
			url = "/member/meLoginForm.jsp";
			//DAO 객체를 생성한다.
			MemberDao mdao = new MemberDao();			
			int cnt = -99999 ; 			
			//Bean 객체를 이용하여 해당 게시물을 추가한다.
			cnt = mdao.InsertData(bean) ;
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(this.request, response);		
	}
	@Override
	public boolean validate() {		
		boolean isCheck = true ; //기본 값으로 true이고, 유효성 검사에 문제가 생기면 false으로 변경
		if( bean.getId().length() < 4 || bean.getId().length() > 10 ){
			System.out.println("호호호");
			this.request.setAttribute("errid", "아이디는 4자리 이상 10자리 이하이어야 합니다.");
			isCheck = false  ;
		}
		//최소 salary 는 100원
		int salary = 100 ;
		if(bean.getSalary() < 100){
			this.request.setAttribute("errsalary", "최소 급여는 100원 이상 이여야합니다.");
			isCheck = false ;
		}
		//성별 은 반드시 체크가 되어야 합니다.
		if(bean.getGender() == null){
			this.request.setAttribute("errgender", "성별은 반드시 체크해야 합니다.");
			isCheck = false ;
		}
		String[] hobby = bean.getHobby().split(",");
		//취미는 최소 2개 이상이어야 합니다.
		if(hobby.length < 2){
			this.request.setAttribute("errhobby", "취미는 2개 이상 선택해주세요");
			isCheck = false ;
		}
		
		//직업은 반드시 선택 하셔야 합니다.
		if(bean.getJob().equals("-") ){
				this.request.setAttribute("errjob", "직업을 선택해 주세요");
				isCheck = false ;
		}
		//우편 번호는 필수 사항 입니다.
		if(bean.getZipcode().equals("")){
			this.request.setAttribute("errzipcode", "우편 번호는 필수 사항 입니다");
			isCheck = false ;
		}
		//주소는 필수 사항입니다.
		if(bean.getAddress2().equals("")){
			this.request.setAttribute("erraddress2", "세부 주소를 입력하셔야 합니다.");
			isCheck = false ;
		}
		return isCheck ;
	}
}