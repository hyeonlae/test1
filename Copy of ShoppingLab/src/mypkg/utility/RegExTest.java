package mypkg.utility;
import java.util.regex.Pattern;
//�ڹ� ���� ǥ���� ����
public class RegExTest {
	public static void main(String[] args) {
		//���� ����Ʈ : http://blog.naver.com/mals93/220724448894
		String regex = null ;
		boolean result = false ;
		
		// (02|010) : 02�� 010�߿��� �ϳ� ����
		regex = "(02|010)-\\d{3,4}-\\d{4}" ;     //JSP����. ǥ����   \d -> ���� �ּ�3�� �ִ�4�� 
		String phone = "01012345678";
		//String phone = "010-34-5678";
		//String phone = "010-1234-5678";
		
		result = Pattern.matches(regex, phone);          //<- �ڹ��� ����ǥ����  Pattern.matches(ǥ����,�˻��Ұ�) ;
		if (result == true ) {
			System.out.println("�޴��� ��ȣ ����");
		} else {
			System.out.println("�޴��� ��ȣ �ƴ�");
		}
		
		regex = "\\d{4}" ; //4�ڸ� ���� ����
		//String su = "1234" ;
		String su = "6666" ;
		result = Pattern.matches(regex, su);
		if (result == true ) {
			if( Integer.parseInt(su) == 6666 ){
				System.out.println( "6666�� �����Ҳ���" );
			}else{
				System.out.println("���� ���� ����");	
			}
		} else {
			System.out.println("���� ���� �ƴ�");
		}
		
		regex = "^\\d{3}-?\\d{3}$" ;   //���� �����ȣ
		//String zipcode = "a123456b" ;
		String zipcode = "123456" ;
		//String zipcode = "123-456" ;
		result = Pattern.matches(regex, zipcode);
		if (result == true ) {
			System.out.println("���� ��ȣ ����");
		} else {
			System.out.println("���� ��ȣ �ƴ�");
		}
		
		regex = "\\d{4}[-/]\\d{2}[-/]\\d{2}" ;       //��¥ ������         html ���� 5 ���ʹ� date �� �־ 4�ڸ� �ϰ�- ���ڸ� �ϰ� -  �� ���� ��
		String hiredate = "2016.05.19";
		//String hiredate = "2016/05/19";
		//String hiredate = "2016-05-19";
		result = Pattern.matches(regex, hiredate);
		if (result == true ) {
			System.out.println("��¥ ���� ����");
		} else {
			System.out.println("��¥ ���� �ƴ�");
		}
		
		// \w : ���� ĳ����(���ڿ�)
		// + : 1�� �̻�
		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //���� ǥ����
		//String email = "ab@ca@bc.abc"; //�˻��� ����
		//String email = "abcabc.abc"; //�˻��� ����
		String email = "abc@abc.abc.ad";//�˻��� ����
		//String email = "abc@abc.abc";//�˻��� ����
		result = Pattern.matches(regex, email);

		if (result == true ) {
			System.out.println("�̸��� �ּ� ����");
		} else {
			System.out.println("�̸��� �ּ� �ƴ�");
		}		
	}
} 