package mypkg.main;

import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam05 {
	public static void main(String[] args) {
		System.out.println("상품들의 각 매출 총액 중 12000 이상인 상품들만 조회하시되, 사과는 제외하세요");
		System.out.println( "출력 결과\n============================");
		JoinDao dao = new JoinDao() ;
		int amount = 1200 ;
		String item = "사과" ;
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
		and p.name <> '사과'
		group by p.name 
		having sum(p.price * od.qty) >= 12000 ;*/
		
	}
}