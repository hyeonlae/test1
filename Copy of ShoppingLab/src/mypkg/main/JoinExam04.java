package mypkg.main;

import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam04 {
	public static void main(String[] args) {
		System.out.println( "������ Ư�� �ݾ� �̻��� ��ǰ���� ���� �Ѿ� ���ϱ�");
		System.out.println( "��� ���\n============================");
		JoinDao dao = new JoinDao() ;
		int amount = 120000 ;
		List<Join02> lists = dao.SelectJoin04( amount ) ;
		
		for( Join02 join : lists ){
			String imsi = join.getPname() + "\t"  + join.getAmount() ;
			System.out.println( imsi );
		}	
		/* 

		-- ��ǰ���� �� ���� �Ѿ��� ���ϵ� 12000 �̻��� ��ǰ�鸸 ��ȸ�ϼ���.
		select p.name pname, sum(p.price * od.qty) as amount
		from orderdetails od inner join products p
		on od.pnum=p.num
		group by p.name 
		having sum(p.price * od.qty) >= 12000 ; */
		
	}
}