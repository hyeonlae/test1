package mypkg.main;

import java.util.List;

import mypkg.model.Join01;
import mypkg.model.JoinDao;

public class JoinExam01 {
	public static void main(String[] args) {
		System.out.println("�Խù� �ۼ��� ����� id, �̸�, ����, �۳��� ��ȸ");
		System.out.println("��� ���\n=====================");
		JoinDao dao = new JoinDao();
		
		List<Join01> lists = dao.SelectJoin01() ;
		System.out.println("���̵�\t�̸�\t����\t�� ����");
		for( Join01 join : lists ){
			String imsi = join.getMember().getId() + "\t" ;
			imsi += join.getMember().getName() + "\t" ;
			imsi += join.getBoard().getSubject() + "\t" ;
			imsi += join.getBoard().getContent() ;
			System.out.println( imsi );
		}
	}
}