package mypkg.main;

import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam05 {
	public static void main(String[] args) {
		System.out.println("��ǰ���� �� ���� �Ѿ� �� 12000 �̻��� ��ǰ�鸸 ��ȸ�Ͻõ�, ����� �����ϼ���");
		System.out.println( "��� ���\n============================");
		JoinDao dao = new JoinDao() ;
		int amount = 1200 ;
		String item = "���" ;
		List<Join02> lists = dao.SelectJoin05( amount, item ) ;
		
		for( Join02 join : lists ){
			String imsi = join.getPname() + "\t"  + join.getAmount() ;
			System.out.println( imsi );
		}	
		/* 		
		-- 
		select p.name, sum(p.price * od.qty) as sumtotal
		from orderdetails od inner join products p
		on od.pnum=p.num
		and p.name <> '���'
		group by p.name 
		having sum(p.price * od.qty) >= 12000 ;*/
		
	}
}