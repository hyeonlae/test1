package mypkg.main;

import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam04 {
	public static void main(String[] args) {
		System.out.println( "매출이 특정 금액 이상인 상품들의 매출 총액 구하기");
		System.out.println( "출력 결과\n============================");
		JoinDao dao = new JoinDao() ;
		int amount = 120000 ;
		List<Join02> lists = dao.SelectJoin04( amount ) ;
		
		for( Join02 join : lists ){
			String imsi = join.getPname() + "\t"  + join.getAmount() ;
			System.out.println( imsi );
		}	
		/* 

		-- 상품들의 각 매출 총액을 구하되 12000 이상인 상품들만 조회하세요.
		select p.name pname, sum(p.price * od.qty) as amount
		from orderdetails od inner join products p
		on od.pnum=p.num
		group by p.name 
		having sum(p.price * od.qty) >= 12000 ; */
		
	}
}