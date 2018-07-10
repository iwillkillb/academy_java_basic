package product;
/**
 * 생성자 : 기본 + 1개씩 추가해서 4개, this 써라.
 * print ()
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
		System.out.printf("번호 %s \t|\t 품명 %s \t|\t 가격 %d \t|\t 재고 %d \n", prodCode, prodName, price, quantity);
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
}
