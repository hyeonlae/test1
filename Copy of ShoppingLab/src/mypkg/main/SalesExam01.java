package mypkg.main;
import java.util.HashMap;
import java.util.Map;
import mypkg.model.DatabaseDao; 
/* 
ȫ�浿(id='hong')�̰� �ֹ�(2�� ��ǰ 10��, 3�� ��ǰ 20��) �մϴ�.
�� �ֹ� ������ ���� �����ͺ��̽��� ��� ������ �Ǵ� ���� ó���ϼ���.
*/
public class SalesExam01 {
	public static void main(String[] args) {
		System.out.println("��� ���\n===========================");
		DatabaseDao dao = new DatabaseDao();
		
		String id = "hong"; //ȫ�浿�̰�		
		
		//�߰� �ǽ� : ��ǰ ���̺��� check ���� ������ �ִ�.
		//2�� ��ǰ�� ��� ������ ���̳ʽ��� �ǰ� �� ���� ���� ó���� �����Ͻÿ�. 
		
		int pnum1 = 2 ; //��ǰ ��ȣ
		int count1 = 1000 ; //�Ǹ� ����
		int pnum2 = 3 ; //��ǰ ��ȣ
		int count2 = 20 ; //�Ǹ� ����
		
		//���θ������� ���� ��ǰ�� ���� �� �����Ѵ�. ���ÿ����� 2���� �������� �����ߴ�. 
		Map<Integer, Integer> shoplists = new HashMap<Integer, Integer>() ;
		
		shoplists.put( pnum1, count1) ;
		shoplists.put( pnum2, count2) ;
		
		int cnt = -99999; 
		cnt = dao.SaleItem( id, shoplists ) ; 
		if ( cnt == -2290 ) {
			System.out.println("üũ ���� ���ǿ� ����Ǿ����ϴ�");  
		}else if( cnt != -99999 ) {
			System.out.println("����"); 
		}else{
			System.out.println("����");
		}
	}
}