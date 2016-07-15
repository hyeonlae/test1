package mypkg.main;

import mypkg.model.Product;
import mypkg.model.ProductDao;

public class ProductSelectByPk {
	public static void main(String[] args) {
		System.out.println("1건 정보 보기");
		System.out.println("출력 결과\n=====================");
		ProductDao dao = new ProductDao() ;		
		int num = 3 ; 		
		Product bean = dao.SelectDataByPk( num ) ;
		if ( bean == null ) {
			System.out.println( "찾으시는 데이터가 없습니다." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}