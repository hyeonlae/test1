package mypkg.main;
import java.util.List;

import mypkg.model.Join02;
import mypkg.model.JoinDao;

public class JoinExam03 {
	public static void main(String[] args) {
		System.out.println( "�� ��ǰ���� ���� �Ѿ� ���ϱ�");
		System.out.println( "��� ���\n============================");
		JoinDao dao = new JoinDao() ;
		List<Join02> lists = dao.SelectJoin03() ;
		
		for( Join02 join : lists ){
			String imsi = join.getPname() + "\t"  + join.getAmount() ;
			System.out.println( imsi );
		}	
		
		/*String sql = "select p.name pname, sum(p.price * od.qty) as amount " ;
		sql += " from orderdetails od inner join products p " ;
		sql += " 	on od.pnum=p.num  " ;
		sql += " group by p.name " ;	*/		
	}
}