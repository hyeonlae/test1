package mypkg.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Member;
import mypkg.model.MemberDao;
import mypkg.utility.Paging;
public class MemberListController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		MemberDao mdao = new MemberDao();
		String _pageNumber = request.getParameter("pageNumber") ;
		String _pageSize = request.getParameter("pageSize") ;
		/*int totalCount = 304 ;*/
		
		int totalCount = mdao.SelectTotalCount() ; // 304
		System.out.println("ÅäÅ» Ä«¿îÅÍ : " + totalCount);
		
		String contextPath = request.getContextPath() ;
		String myurl  = contextPath + "/MiniShopCtrl?command=meList" ;
		String mode = null ;
		String keyword = null ;
		
		Paging pagingInfo = new Paging(_pageNumber, _pageSize, totalCount, myurl, mode, keyword) ;
		
		
		
		List<Member> lists = mdao.SelectDataList(pagingInfo.getBeginRow(), pagingInfo.getEndRow()) ;
		
		request.setAttribute("lists", lists);
		request.setAttribute("pagingHtml", pagingInfo.getPagingHtml());
		request.setAttribute("pagingStatus", pagingInfo.getPagingStatus());
		
		String url = "/member/meList.jsp" ;
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}