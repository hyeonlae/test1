package mypkg.main;

import mypkg.model.Product;
import mypkg.model.ProductDao;

public class ProductSelectByPk {
	public static void main(String[] args) {
		System.out.println("1�� ���� ����");
		System.out.println("��� ���\n=====================");
		ProductDao dao = new ProductDao() ;		
		int num = 3 ; 		
		Product bean = dao.SelectDataByPk( num ) ;
		if ( bean == null ) {
			System.out.println( "ã���ô� �����Ͱ� �����ϴ�." );	
		} else {
			System.out.println( bean.toString() );
		}
		 
	}
}