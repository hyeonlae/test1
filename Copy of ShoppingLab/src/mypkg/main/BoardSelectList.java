package mypkg.main;
import java.util.List;
import mypkg.model.Board;
import mypkg.model.BoardDao;
public class BoardSelectList {
	public static void main(String[] args) {
		System.out.println("������ ��� ��ȸ"); 
		BoardDao dao = new BoardDao();
		List<Board> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
		}else{
			for( Board board :  lists ){
				System.out.println( board.toString() ); 
			}
		}
	}
}