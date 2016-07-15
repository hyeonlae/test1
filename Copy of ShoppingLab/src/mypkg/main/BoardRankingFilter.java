package mypkg.main;

import java.util.List;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardRankingFilter {
	public static void main(String[] args) {
		System.out.println("출력 결과\n===========================");
		BoardDao dao = new BoardDao();
		
		int beginRow = 1 ; 
		int endRow = 15 ;
		
		String mode = "writer" ;		
		String keyword = "hong" ;
		
		//String mode = "subject" ;
		//String keyword = "공합" ;
		List<Board> lists = dao.SelectDataList( beginRow, endRow, mode, keyword ) ;
		if ( lists.size() != 0  ) { 
			for( Board bean : lists ){
				System.out.println( bean.toString()  ); 
			}
		}else{
			System.out.println("찾으시는 데이터가 업습니다.");
		}
	}
}
/*-- 6위부터 10위까지 조회하기
select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, ranking
from 
(
	select no, subject, writer, password, content, readhit, regdate, groupno, orderno, depth, rank() over( order by no desc ) as ranking
	from boards 
)
where ranking between 6 and 10   ; 
*/




