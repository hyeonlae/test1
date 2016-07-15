package mypkg.main;
import java.util.List;
import mypkg.model.Member;
import mypkg.model.MemberDao;
public class MemberSelectList {
	public static void main(String[] args) {
		System.out.println("데이터 모두 조회"); 
		MemberDao dao = new MemberDao();
		List<Member> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("찾으시는 데이터가 없습니다.");
		}else{
			for( Member member :  lists ){
				System.out.println( member.toString() ); 
			}
		}
	}
}