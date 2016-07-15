package mypkg.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Board;
import mypkg.model.BoardDao;
import mypkg.utility.FlowParameters;
import mypkg.utility.Paging;
public class BoardListController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		BoardDao bdao = new BoardDao() ;
		
		String mode = request.getParameter("mode") ;
		if( mode == null || mode.equals("null") || mode.equals("")){
			mode = "all" ;
		}
		
		//keyword는 메소드 호출 시점에 %를 붙이도록 하자 
		String keyword = request.getParameter("keyword") ; 
		if(keyword == null || keyword.equals("null")){
			keyword = "" ;
		}
		
		
		String pageNumber = request.getParameter("pageNumber") ;
		String pageSize = request.getParameter("pageSize") ;
		
		FlowParameters parameters = new FlowParameters() ;
		parameters.setKeyword(keyword);
		parameters.setMode(mode);
		parameters.setPageNumber(pageNumber);
		parameters.setPageSize(pageSize);
		
		/*int totalCount = 1006 ;*/
		int totalCount = bdao.SelectTotalCount( mode, keyword + "%") ; // 1006 
		System.out.println("토탈 카운터 : " + totalCount);
		
		String contextPath = request.getContextPath() ; 
		String myurl = contextPath  + "/MiniShopCtrl?command=boList" ;
		
		Paging pageInfo = new Paging(pageNumber, pageSize, totalCount, myurl, mode, keyword) ;  //이해못함
		
		List<Board> lists = bdao.SelectDataList(pageInfo.getBeginRow(), pageInfo.getEndRow(), mode, keyword + "%") ;
		
		request.setAttribute("lists", lists);  //표로 보여지는 컬렉션
		
		request.setAttribute("pagingHtml", pageInfo.getPagingHtml());
		request.setAttribute("pagingStatus", pageInfo.getPagingStatus());
		
		request.setAttribute("", arg1);
		
		
		String url = "/board/boList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url) ;
		dispatcher.forward(request, response);
	}
}

/*
 
 테스트용 sql 구문
 
  update boards set writer = 'hong' where no between 10 and 30 ;
  
  update boards set subject = '자바' where no between 20 and 50 ;
  
  update boards set content = '호호호호' where no between 30and 60 ;    
 
 commit ;
*/