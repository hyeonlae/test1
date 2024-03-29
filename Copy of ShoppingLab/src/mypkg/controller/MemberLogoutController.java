package mypkg.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class MemberLogoutController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		HttpSession session = request.getSession() ;
		session.invalidate();    // 세션안에 정보 다 지우기
		response.sendRedirect( request.getContextPath() + "/member/meLoginForm.jsp");
	}
}