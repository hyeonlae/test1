package mypkg.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mypkg.model.Member;
import mypkg.model.MemberDao;
public class MemberLoginController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		String id = request.getParameter("id") ;
		String password = request.getParameter("password") ;
		String url = null ;
		String message = "" ;
		
		MemberDao mdao = new MemberDao() ;
		
		Member bean = mdao.SelectDataByPk(id) ;
		
		
		if ( bean == null ) { //�������� �ʴ� ���̵�
				url = "/member/meLoginForm.jsp";
				message = "���̵� ����� �߸� �Ǿ����ϴ�." ;
				request.setAttribute("errmsg", message);
		} else {
				if ( password.equals(bean.getPassword()) ) { //������ ����
					url = "/main.jsp";
					message = "�α��� ����" ;
					HttpSession session = request.getSession() ;
					session.setAttribute("loginfo", bean);
				} else { //��� Ʋ��
					url = "/member/meLoginForm.jsp";
					message = "���̵� ����� �߸� �Ǿ����ϴ�." ;
					request.setAttribute("errmsg", message);
				}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}