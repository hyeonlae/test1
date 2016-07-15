package mypkg.main;

import java.util.List;

import mypkg.model.DatabaseDao;
import mypkg.model.Order;

public class SelectSaleInfoByPk {
	//해당 송장 번호의 상세 매출 정보를 조회하시오.
	public static void main(String[] args) {
		DatabaseDao dao = new DatabaseDao() ;		
		int oid = 3 ; 		
		List<Order> lists = dao.SelectSaleInfoByPk( oid ) ;
	}
}