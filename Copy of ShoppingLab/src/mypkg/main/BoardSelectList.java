package mypkg.main;
import java.util.List;
import mypkg.model.Board;
import mypkg.model.BoardDao;
public class BoardSelectList {
	public static void main(String[] args) {
		System.out.println("데이터 모두 조회"); 
		BoardDao dao = new BoardDao();
		List<Board> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("찾으시는 데이터가 없습니다.");
		}else{
			for( Board board :  lists ){
				System.out.println( board.toString() ); 
			}
		}
	}
}