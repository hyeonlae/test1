package mypkg.main;

import java.util.List;

import mypkg.model.Join01;
import mypkg.model.JoinDao;

public class JoinExam01 {
	public static void main(String[] args) {
		System.out.println("게시물 작성한 사람의 id, 이름, 제목, 글내용 조회");
		System.out.println("출력 결과\n=====================");
		JoinDao dao = new JoinDao();
		
		List<Join01> lists = dao.SelectJoin01() ;
		System.out.println("아이디\t이름\t제목\t글 내용");
		for( Join01 join : lists ){
			String imsi = join.getMember().getId() + "\t" ;
			imsi += join.getMember().getName() + "\t" ;
			imsi += join.getBoard().getSubject() + "\t" ;
			imsi += join.getBoard().getContent() ;
			System.out.println( imsi );
		}
	}
}