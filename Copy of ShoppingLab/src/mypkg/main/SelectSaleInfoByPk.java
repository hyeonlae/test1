package mypkg.main;

import java.util.List;

import mypkg.model.DatabaseDao;
import mypkg.model.Order;

public class SelectSaleInfoByPk {
	//�ش� ���� ��ȣ�� �� ���� ������ ��ȸ�Ͻÿ�.
	public static void main(String[] args) {
		DatabaseDao dao = new DatabaseDao() ;		
		int oid = 3 ; 		
		List<Order> lists = dao.SelectSaleInfoByPk( oid ) ;
	}
}