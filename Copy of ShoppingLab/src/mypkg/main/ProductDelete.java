package mypkg.main;

import mypkg.model.ProductDao;

public class ProductDelete {
	public static void main(String[] args) {
		System.out.println("삭제하기");
		int num = 8 ;
		
		ProductDao dao = new ProductDao(); 
		int cnt = -99999 ; //부정, false의 개념
		cnt = dao.DeleteData( num ) ;
		
		if ( cnt == -99999) {
			System.out.println("실패");
		} else {
			System.out.println("성공");
		}
	}
}