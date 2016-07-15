package mypkg.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Member;
import mypkg.model.MemberDao;
public class MemberDetailViewController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		String id = request.getParameter("id") ;
		
		MemberDao mdao = new MemberDao() ;
		Member bean = mdao.SelectDataByPk(id) ;       //pk�� �����̸Ӹ�Ű    bean �� �� �����ϳĸ�  �̸� �ǳ� �ٲ��ֱⰡ �����Ƽ�
		
		request.setAttribute("bean", bean);
		
		String url = "/member/meDetailView.jsp";  
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
}