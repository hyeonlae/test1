package mypkg.main;

import java.util.List;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardRankingFilter {
	public static void main(String[] args) {
		System.out.println("��� ���\n===========================");
		BoardDao dao = new BoardDao();
		
		int beginRow = 1 ; 
		int endRow = 15 ;
		
		String mode = "writer" ;		
		String keyword = "hong" ;
		
		//String mode = "subject" ;
		//String keyword = "����" ;
		List<Board> lists = dao.SelectDataList( beginRow, endRow, mode, keyword ) ;
		if ( lists.size() != 0  ) { 
			for( Board bean : lists ){
				System.out.println( bean.toString()  ); 
			}
		}else{
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
		}
	}
}
/*-- 6������ 10������ ��ȸ�ϱ�
select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, ranking
from 
(
	select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, rank() over( order by no desc ) as ranking
	from boards 
)
where ranking between 6 and 10   ; 
*/




