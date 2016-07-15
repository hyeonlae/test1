package mypkg.utility;
import java.util.regex.Pattern;
//자바 정규 표현식 예시
public class RegExTest {
	public static void main(String[] args) {
		//참조 사이트 : http://blog.naver.com/mals93/220724448894
		String regex = null ;
		boolean result = false ;
		
		// (02|010) : 02나 010중에서 하나 골라라
		regex = "(02|010)-\\d{3,4}-\\d{4}" ;     //JSP교안. 표현식   \d -> 숫자 최소3개 최대4개 
		String phone = "01012345678";
		//String phone = "010-34-5678";
		//String phone = "010-1234-5678";
		
		result = Pattern.matches(regex, phone);          //<- 자바의 정규표현식  Pattern.matches(표현식,검사할것) ;
		if (result == true ) {
			System.out.println("휴대폰 번호 맞음");
		} else {
			System.out.println("휴대폰 번호 아님");
		}
		
		regex = "\\d{4}" ; //4자리 숫자 형식
		//String su = "1234" ;
		String su = "6666" ;
		result = Pattern.matches(regex, su);
		if (result == true ) {
			if( Integer.parseInt(su) == 6666 ){
				System.out.println( "6666은 배제할께요" );
			}else{
				System.out.println("숫자 형식 맞음");	
			}
		} else {
			System.out.println("숫자 형식 아님");
		}
		
		regex = "^\\d{3}-?\\d{3}$" ;   //옛날 우편번호
		//String zipcode = "a123456b" ;
		String zipcode = "123456" ;
		//String zipcode = "123-456" ;
		result = Pattern.matches(regex, zipcode);
		if (result == true ) {
			System.out.println("우편 번호 맞음");
		} else {
			System.out.println("우편 번호 아님");
		}
		
		regex = "\\d{4}[-/]\\d{2}[-/]\\d{2}" ;       //날짜 넣을때         html 버전 5 부터는 date 가 있어서 4자리 하고- 두자리 하고 -  이 들어가긴 함
		String hiredate = "2016.05.19";
		//String hiredate = "2016/05/19";
		//String hiredate = "2016-05-19";
		result = Pattern.matches(regex, hiredate);
		if (result == true ) {
			System.out.println("날짜 형식 맞음");
		} else {
			System.out.println("날짜 형식 아님");
		}
		
		// \w : 워드 캐릭터(문자열)
		// + : 1번 이상
		regex = "\\w+@\\w+\\.\\w+(\\.\\w+)?"; //정규 표현식
		//String email = "ab@ca@bc.abc"; //검사할 내용
		//String email = "abcabc.abc"; //검사할 내용
		String email = "abc@abc.abc.ad";//검사할 내용
		//String email = "abc@abc.abc";//검사할 내용
		result = Pattern.matches(regex, email);

		if (result == true ) {
			System.out.println("이메일 주소 맞음");
		} else {
			System.out.println("이메일 주소 아님");
		}		
	}
} 