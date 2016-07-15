package mypkg.main;

import java.util.List;

import mypkg.model.Order;
import mypkg.model.OrderDao;

public class SelectOrderList {
	public static void main(String[] args) {
		//모든 고객의 주문 정보를 조회하세요. 
		System.out.println( "출력 결과\n============================");
		OrderDao dao = new OrderDao() ;		
		List<Order> lists = dao.SelectOrderList( ) ;
		if ( lists.size() != 0  ) { 
			for( Order bean : lists ){
				System.out.println( bean.toString()  ); 
			}
		}else{
			System.out.println("찾으시는 데이터가 업습니다.");
		}		 
	}
}