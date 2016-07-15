package mypkg.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Board;
import mypkg.model.BoardDao;

import com.oreilly.servlet.MultipartRequest;
public class BoardInsertController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		MultipartRequest multi = (MultipartRequest)request.getAttribute("multi") ;
		
		Board bean = new Board() ;
		
		
		String subject = multi.getParameter("subject") ;
		String writer= multi.getParameter("writer") ; 
		String password = multi.getParameter("password") ;
		String content= multi.getParameter("content") ; 
		
		String regdate= multi.getParameter("regdate") ; 
		
		
		bean.setSubject(subject);
		bean.setWriter(writer);
		bean.setPassword(password);
		bean.setContent(content);
		bean.setRegdate(regdate);;
		
		
		BoardDao bdao = new BoardDao() ;
		
		int cnt = -99999 ;
		
		cnt = bdao.InsertData(bean);
		
		new BoardListController().doProcess(request, response);
		
		
	}
}