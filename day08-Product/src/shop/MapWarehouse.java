package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapWarehouse implements GeneralWarehouse {

	// 1. 멤버 변수 선언부
	private Map<String, Product> products;
	
	// 2. 생성자 선언부
	public MapWarehouse () {
		
	}
	public MapWarehouse (Map<String, Product> products) {
		this.products = products;
	}
	
	
	
	@Override
	public int add(Product product) {
		int addIdx = 0;
		if (products.put(product.getProdCode(), product) == null) {
			addIdx++;
		}
		return addIdx;
	}

	@Override
	public Product get(Product product) {
		int getIdx = findProductIdx(product);
		Product found = null;
		if (getIdx > -1) {
			// 찾아올 제품이 존재
			found = products.get(getIdx);
		}
		return found;
	}

	@Override
	public int set(Product product) {
		int setIdx = findProductIdx(product);

		if (setIdx > -1) {
			products.put(String.valueOf(setIdx), product);
		}
		return setIdx;
	}

	@Override
	public int remove(Product product) {
		int rmIdx = findProductIdx(product);
		
		if (rmIdx > -1) {
			products.put(String.valueOf(rmIdx), product);
		}
		return rmIdx;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<Product>(products.values());
		
		return list;
	}
	
	
	
	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findProductIdx(Product product) {
		int found = -1;

		for (int idx = 0; idx < products.size(); idx++) {
			if (products.get(idx) == product) {
				found = idx;
				break;
			}
		}
		return found;
	}

}
