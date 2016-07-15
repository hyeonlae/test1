package mypkg.controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypkg.model.Product;
import mypkg.model.ProductDao;

import com.oreilly.servlet.MultipartRequest;
public class ProductInsertController implements SuperController{
	@Override
	public void doProcess(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println( this.getClass() );
		//request ������ �ִ� ���ε带 ���� ��ü multi ������ �о� ���δ�.
		MultipartRequest multi =  (MultipartRequest)request.getAttribute("multi") ;
		
		Product bean = new Product() ;
		//��ǰ ��ȣ�� �������̹Ƿ� ���� �� ����.
		// int num = Integer.parseInt(multi.getParameter("num")) ;
		String name = multi.getParameter("name") ;
		String company = multi.getParameter("company") ;
		String image  = multi.getFilesystemName("image") ;
		int stock = Integer.parseInt(multi.getParameter("stock")) ;
		 int price  = Integer.parseInt(multi.getParameter("price")) ;
		String category = multi.getParameter("category") ;
		String contents = multi.getParameter("contents") ;
		int point= Integer.parseInt(multi.getParameter("point")) ;
		String inputdate = multi.getParameter("inputdate") ;

		bean.setName(name);
		bean.setCompany(company);
		bean.setImage(image);
		bean.setStock(stock);
		bean.setPrice(price);
		bean.setCategory(category);
		bean.setContents(contents);
		bean.setPoint(point);
		bean.setInputdate(inputdate);
		
		//DAO ��ü�� �����Ѵ�.
		
		ProductDao pdao = new ProductDao() ;
		int cnt = -99999 ;
		
		//bean ��ü�� �̿��Ͽ� �ش� �Խù��� �߰��Ѵ�.
		
		cnt = pdao.InsertData(bean) ;
		
		//��� ����� �����̷��ǽ�Ų��.
		new ProductListController().doProcess(request, response);
	}
}