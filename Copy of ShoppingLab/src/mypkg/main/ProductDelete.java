package mypkg.main;

import mypkg.model.ProductDao;

public class ProductDelete {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		int num = 8 ;
		
		ProductDao dao = new ProductDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.DeleteData( num ) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}