package mypkg.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.compiler.Keywords;

import mypkg.model.Product;
import mypkg.model.ProductDao;
import mypkg.utility.Paging;
public class ProductListController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		ProductDao pdao = new ProductDao() ;
		String mode = request.getParameter("mode");
		if( mode == null || mode.equals("null") || mode.equals("") ){
			mode = "all" ;
		}
		String keyword = request.getParameter("keyword") ;
		if( keyword == null || keyword.equals("null")  ){
			keyword = "" ;
		}
		 keyword  += "%" ;
		 
		String _pageNumber = request.getParameter("pageNumber");
		String _pageSize = request.getParameter("pageSize");
		/*int totalCount = 306 ;*/
		
		int totalCount = pdao.SelectTotalCount( mode, keyword ) ; //306
		System.out.println("ÅäÅ» Ä«¿îÅÍ : " + totalCount);
		
		String contextPath = request.getContextPath() ;
		String myurl = contextPath + "/MiniShopCtrl?command=prList";
		
		
		
		Paging pagingInfo = new Paging(_pageNumber, _pageSize, totalCount, myurl, mode, keyword) ;
		
		List<Product> lists = pdao.SelectDataList(pagingInfo.getBeginRow(), pagingInfo.getEndRow(), mode, keyword) ;

		request.setAttribute("lists", lists);
		request.setAttribute("pagingHtml", pagingInfo.getPagingHtml());
		request.setAttribute("pagingStatus", pagingInfo.getPagingStatus());
		
		String url = "/product/prList.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url) ;
		dispatcher.forward(request, response);
	}
}