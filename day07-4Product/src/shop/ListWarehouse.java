package shop;

import java.util.List;
/**
 * 제품정보를 저장할 자료구조를 리스트로 관리하는 창고 클래스
 * @author PC38208
 *
 */
public class ListWarehouse implements GeneralWarehouse {

	// 1. 멤버 변수 선언부
	private List<Product> products;
	
	// 2. 생성자 선언부
	// (1) 기본 생성자

	public ListWarehouse() {
		
	}
	
	public ListWarehouse(List<Product> products) {
		this.products = products;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public Product get(Product product) {
		int getIdx = findProductIdx(product);
		return products.set(getIdx, product);
	}

	@Override
	public void set(Product product) {
		int setIdx = findProductIdx(product);
		
		if (setIdx > -1) {
			products.set(setIdx, product);
		}

	}

	@Override
	public void remove(Product product) {
		int rmIdx = findProductIdx(product);
		
		if (rmIdx > -1) {
			products.set(rmIdx, product);
		}
	}

	@Override
	public List<Product> getAllProducts() {
		return this.products;
	}

	// 리스트 안에 찾으려는 제품의 인덱스를 구하는 지원 메소드
	private int findProductIdx (Product product) {
		int index = -1;
		
		for (int idx = 0; idx < products.size(); idx++) {
			if (products.get(idx).equals(product)) {
				index = idx;
				break;
			}
		}
		
		return index;
	}
}
