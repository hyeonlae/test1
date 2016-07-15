package mypkg.main;

import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam02 {
	public static void main(String[] args) {
		System.out.println("상품들의 매출 수량과 금액을 구하세요");
		System.out.println("출력 결과\n=====================");
		JoinDao dao = new JoinDao() ;
		List<Join02> lists = dao.SelectJoin02() ;
		
		System.out.println( "출력 결과\n============================");  
		for( Join02 join : lists ){
			//System.out.println( join );
			String imsi = join.getMname() + "\t"
					+ join.getPname() + "\t" 
					+ join.getQty() + "\t"
					+ join.getPrice() + "\t"
					+ join.getAmount() ;
			System.out.println( imsi );
		}	
	}
}
/*String sql = "select m.name mname, p.name pname, od.qty, p.price, p.price * od.qty as amount   " ; 
sql += " from (( members m inner join orders o " ;
sql += " on m.id=o.mid ) inner join orderdetails od " ;
sql += " on o.oid=od.oid ) inner join products p" ;
sql += " on od.pnum = p.num " ;
sql += " order by m.name desc " ; 	*/