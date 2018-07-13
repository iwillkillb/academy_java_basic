package shop.reply;

import shop.Product;

/**
 * 매니저가 1건의 제품정보를 가지고 왔을 때
 * 출력할 응답을 구현
 * @author PC38208
 *
 */
public class ProductReply implements Reply {

	@Override
	public void reply(Object object) {
		// object로 들어오는 대상이 Product 타입임이 확실하다고 간주.
		// 확실하다 / instanceof를 생략
		Product product = (Product)object;
		product.print();
	}

}
