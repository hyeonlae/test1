package mypkg.main;
import java.util.List;
import mypkg.model.Member;
import mypkg.model.MemberDao;
public class MemberSelectList {
	public static void main(String[] args) {
		System.out.println("������ ��� ��ȸ"); 
		MemberDao dao = new MemberDao();
		List<Member> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
		}else{
			for( Member member :  lists ){
				System.out.println( member.toString() ); 
			}
		}
	}
}