package shop;

import java.util.List;
/**
 * 제품을 관리하기 위한 창고의 기능을 선언한 인터페이스
 * @author PC38208
 *
 */
public interface GeneralWarehouse {
	public void add (Product product);
	public Product get (Product product);
	public void set (Product product);
	public void remove(Product product);
	public List<Product> getAllProducts();
}
