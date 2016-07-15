package mypkg.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Board;
import mypkg.model.BoardDao;
public class BoardDetailViewController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		int no = Integer.parseInt(request.getParameter("no")) ;
		
		BoardDao bdao = new BoardDao() ;
		Board bean = bdao.SelectDataByPk(no) ;
				
		request.setAttribute("bean", bean);
		
		String url = "/board/boDetailView.jsp";  
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}
}