package mypkg.main;

import mypkg.model.Product;
import mypkg.model.ProductDao;

public class ProductUpdate {
	public static void main(String[] args) {
		System.out.println("수정하기");
		Product bean = new Product();
		
		//정보 설정하기(setter)
		bean.setNum( 4 );
		bean.setCategory("과일");
		bean.setCompany("삼립");
		bean.setContents("너무너무 맛없어요 ㅜㅜㅜ");
		bean.setImage("a.jpg");
		bean.setInputdate("2016/05/08");
		bean.setName("허허허");
		bean.setPoint( 50 );
		bean.setPrice( 12345 );
		bean.setStock( 67890 ); 			
		
		ProductDao dao = new ProductDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}