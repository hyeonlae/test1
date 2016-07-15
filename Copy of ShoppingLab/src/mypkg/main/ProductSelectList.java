package mypkg.main;
import java.util.List;
import mypkg.model.Product;
import mypkg.model.ProductDao;
public class ProductSelectList {
	public static void main(String[] args) {
		System.out.println("데이터 모두 조회"); 
		ProductDao dao = new ProductDao();
		List<Product> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("찾으시는 데이터가 없습니다.");
		}else{
			for( Product product :  lists ){
				System.out.println( product.toString() ); 
			}
		}
	}
}