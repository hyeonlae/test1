package mypkg.main;
import java.util.HashMap;
import java.util.Map;
import mypkg.model.DatabaseDao; 
/* 
홍길동(id='hong')이가 주문(2번 상품 10개, 3번 상품 20개) 합니다.
이 주문 내역이 실제 데이터베이스에 어떻게 적용이 되는 지를 처리하세요.
*/
public class SalesExam01 {
	public static void main(String[] args) {
		System.out.println("출력 결과\n===========================");
		DatabaseDao dao = new DatabaseDao();
		
		String id = "hong"; //홍길동이가		
		
		//추가 실습 : 상품 테이블에는 check 제약 조건이 있다.
		//2번 상품의 재고 수량을 마이너스가 되게 한 다음 예외 처리를 수행하시오. 
		
		int pnum1 = 2 ; //상품 번호
		int count1 = 1000 ; //판매 수량
		int pnum2 = 3 ; //상품 번호
		int count2 = 20 ; //판매 수량
		
		//쇼핑몰에서는 고객이 상품을 여러 개 구입한다. 예시에서는 2개의 아이템을 구입했다. 
		Map<Integer, Integer> shoplists = new HashMap<Integer, Integer>() ;
		
		shoplists.put( pnum1, count1) ;
		shoplists.put( pnum2, count2) ;
		
		int cnt = -99999; 
		cnt = dao.SaleItem( id, shoplists ) ; 
		if ( cnt == -2290 ) {
			System.out.println("체크 제약 조건에 위배되었습니다");  
		}else if( cnt != -99999 ) {
			System.out.println("성공"); 
		}else{
			System.out.println("실패");
		}
	}
}