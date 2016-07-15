package mypkg.main;

import java.util.List;

import mypkg.model.Board;
import mypkg.model.BoardDao;

public class BoardRanking {
	public static void main(String[] args) {
		System.out.println("출력 결과\n===========================");
		BoardDao dao = new BoardDao();
		
		int beginRow = 6 ; 
		int endRow = 10 ; 
		List<Board> lists = dao.SelectDataList( beginRow, endRow ) ;
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




