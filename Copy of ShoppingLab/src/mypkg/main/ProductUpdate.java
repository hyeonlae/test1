package mypkg.main;

import mypkg.model.Product;
import mypkg.model.ProductDao;

public class ProductUpdate {
	public static void main(String[] args) {
		System.out.println("�����ϱ�");
		Product bean = new Product();
		
		//���� �����ϱ�(setter)
		bean.setNum( 4 );
		bean.setCategory("����");
		bean.setCompany("�︳");
		bean.setContents("�ʹ��ʹ� ������� �̤̤�");
		bean.setImage("a.jpg");
		bean.setInputdate("2016/05/08");
		bean.setName("������");
		bean.setPoint( 50 );
		bean.setPrice( 12345 );
		bean.setStock( 67890 ); 			
		
		ProductDao dao = new ProductDao(); 
		int cnt = -99999 ; //����, false�� ����
		cnt = dao.UpdateData(bean) ;
		
		if ( cnt == -99999) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}