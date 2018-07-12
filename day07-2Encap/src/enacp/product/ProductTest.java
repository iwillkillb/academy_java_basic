package enacp.product;
/**
 * 매장에서 제품을 생성하고 입출고 혹은 할인가격을 구하는 등의 기능을 테스트하는 클래스.
 * @author PC38208
 *
 */
public class ProductTest {

	public static void main(String[] args) {
		// 1. 선언
		Product product;
		
		// 2. 초기화
		product = new Product("P001", "MS-아크 터치 마우스", 51330, 36);
		
		// 3. 사용
		// (1) 제품 상태 출력
		product.print ();
		
		// (2) 20% 할인가?
		int cdPrice = product.discount(20);
		System.out.printf("제품 가격 : %d, 20%% 할인가 : %d \n", product.getPrice(), cdPrice);
		
		// (3) 2개 판매
		product.sell(2);
		
		// (4) 제품 상태 출력
		product.print ();
		
		// (5) 입고
		product.buy(10);
		
		// (6) 제품 상태 출력
		product.print ();
		
		System.out.println("=====================================================");
		System.out.print(product.toString());
		System.out.println("=====================================================");
	}

}
