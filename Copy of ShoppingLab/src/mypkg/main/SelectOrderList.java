package mypkg.main;

import java.util.List;

import mypkg.model.Order;
import mypkg.model.OrderDao;

public class SelectOrderList {
	public static void main(String[] args) {
		//��� ���� �ֹ� ������ ��ȸ�ϼ���. 
		System.out.println( "��� ���\n============================");
		OrderDao dao = new OrderDao() ;		
		List<Order> lists = dao.SelectOrderList( ) ;
		if ( lists.size() != 0  ) { 
			for( Order bean : lists ){
				System.out.println( bean.toString()  ); 
			}
		}else{
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
		}		 
	}
}