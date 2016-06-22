import java.util.Map;
import java.util.Set;

import com.my.dao.CartDAOInterface;
import com.my.dao.CartDAOList;
import com.my.dto.Product;

public class CartTest {
	public static void main(String[] args) {
		CartDAOInterface dao;
		dao = new CartDAOList();
		dao.add(new Product("p1", "n1", 100, null, null));
		dao.add(new Product("p2", "n2", 100, null, null));
		dao.add(new Product("p1", "n1", 100, null, null));
		Map<Product, Integer>list = dao.selectAll();
		Set<Product> keys =list.keySet();
		for(Product p: keys){
			Integer quantity = list.get(p);
			System.out.println(p.getProd_no() + ":" + quantity);
		}
	}
}
