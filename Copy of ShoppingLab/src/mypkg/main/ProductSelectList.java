package mypkg.main;
import java.util.List;
import mypkg.model.Product;
import mypkg.model.ProductDao;
public class ProductSelectList {
	public static void main(String[] args) {
		System.out.println("������ ��� ��ȸ"); 
		ProductDao dao = new ProductDao();
		List<Product> lists = dao.SelectDataList();
		if( lists.size() == 0){
			System.out.println("ã���ô� �����Ͱ� �����ϴ�.");
		}else{
			for( Product product :  lists ){
				System.out.println( product.toString() ); 
			}
		}
	}
}