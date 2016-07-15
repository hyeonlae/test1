package mypkg.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Product;
import mypkg.model.ProductDao;





public class ProductDetailViewController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		
		int num = Integer.parseInt(request.getParameter("num") ) ;
		ProductDao pdao = new ProductDao() ;
		Product bean = pdao.SelectDataByPk(num) ;
		
		request.setAttribute("bean", bean);
		
		String url = "/product/prDetailView.jsp" ;
		RequestDispatcher dispatcher = request.getRequestDispatcher(url) ;
		dispatcher.forward(request, response);
		
	}
}
