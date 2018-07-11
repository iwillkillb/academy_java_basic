package shop;
/**
 * 생성자 : 기본 + 1개씩 추가해서 4개, this 써라.
 * @author PC38208
 *
 */
public class Product {
	//코드번호
	String prodCode;
	//제품명
	String prodName;
	//가격
	int price;
	//재고수량
	int quantity;
	
	// 생성자들
	Product () {
		
	}
	Product (String prodCode) {
		this ();
		this.prodCode = prodCode;
	}
	Product (String prodCode, String prodName) {
		this (prodCode);
		this.prodName = prodName;
	}
	Product (String prodCode, String prodName, int price) {
		this (prodCode, prodName);
		this.price = price;
	}
	Product (String prodCode, String prodName, int price, int quantity) {
		this (prodCode, prodName, price);
		this.quantity = quantity;
	}
	
	// 필드 출력
	void print () {
		System.out.printf("번호 : %s, 품명 : %s, 가격 : %,6d, 재고 : %3d \n", prodCode, prodName, price, quantity);
	}
	// 할인가 반환
	int discount (double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		return price;
	}
	// 판매 : quantity 감소, 0 이하 수량은 판매불가
	void sell (int amount) {
		if (this.quantity >= amount && amount > 0) {
			this.quantity -= amount;
		}
	}
	// 입고 : quantity 증가
	void buy (int amount) {
		if (amount > 0) {
			this.quantity += amount;
		}
	}
	// 입력된 값으로 제품 정보를 수정하여 저장
	void set (String prodCode, String prodName, int price, int quantity) {
		// 현재 코드와 들어온 코드가 다르면
		if (!this.prodCode.equals(prodCode)) {
			this.prodCode = prodCode;
		}
		// 현재 이름과 들어온 이름이 다르면
		if (!this.prodName.equals(prodName)) {
			this.prodName = prodName;
		}
		// 가격이 다르면
		if (this.price != price) {
			this.price = price;
		}
		// 가격이 다르면
		if (this.quantity != quantity) {
			this.quantity = quantity;
		}
	}
}
