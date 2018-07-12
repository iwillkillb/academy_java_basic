package encap.shop;
/**
 * 생성자 : 기본 + 1개씩 추가해서 4개, this 써라.
 * 
 * 캡슐화를 위해 모든 데이터 필드는 private로 선언.
 * 
 * @author PC38208
 *
 */
public class Product {
	//코드번호
	private String prodCode;
	//제품명
	private String prodName;
	//가격
	private int price;
	//재고수량
	private int quantity;
	
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
	
	/*
	 * ---------------------------------------------------------
	 * 멤버 변수 필드의 가시성을 private로 선언하면 다른 모든 클래스에서 접근이 불가능하다.
	 * 따라서 숨겨진 필드에 접근할 수 있도록 전용 메소드 쌍을 정의해야 한다.
	 * ---------------------------------------------------------
	 * 접근자 메소드 : getter
	 * 1. get으로 시작.
	 * 2. get 뒤에 오는 이름은 접근하려는 멤버변수 명의 첫 글자만 대문자화하여 정의한다.
	 * 3. 메소드 매개변수가 없다.
	 * 4. 메소드 리턴 타입을 접근하려는 멤버변수 타입과 맞춘다.
	 * 5. 멤버변수 타입이 boolean이면 이름이 get이 아니라 is로 시작한다.
	 * 6. 예 : getXxx (), isXxx ()...
	 * ---------------------------------------------------------
	 * 수정자 메소드 : setter
	 * 1. set으로 시작.
	 * 2. set 뒤에 오는 이름은 수정하려는 멤버변수 명의 첫 글자만 대문자화하여 정의한다.
	 * 3. 메소드 매개변수는 수정하려는 멤버변수의 타입과 맞추고, 보통 같은 이름으로 설정.
	 * 4. 리턴 타입은 void로 한다.
	 * 5. 보통 안쪽의 로직은 this.멤버변수 = 매개변수; 로 작성.
	 */	
	
	// prodCode의 접근자
	public String getProdCode () {
		return this.prodCode;
	}
	// setProdCode의 수정자
	public void setProdCode (String prodCode) {
		this.prodCode = prodCode;
	}

	// prodName의 접근자
	public String getProdName () {
		return this.prodName;
	}
	// setProdName의 수정자
	public void setProdName (String prodName) {
		this.prodName = prodName;
	}

	// price의 접근자
	public int getPrice () {
		return this.price;
	}
	// price의 수정자
	public void setPrice (int price) {
		this.price = price;
	}

	// quantity의 접근자
	public int getQuantity () {
		return this.quantity;
	}
	// quantity의 수정자
	public void setQuantity (int quantity) {
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
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	// Object 클래스에서 나도 모르는 사이 상속받은 toString () 메소드를 재정의해보자.
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드 이름 (매개변수)
	@Override
	public String toString() {
		String strProduct = String.format("번호 %s \t|\t 품명 %s \t|\t 가격 %,d \t|\t 재고 %d \n", prodCode, prodName, price, quantity);
		return strProduct;
	}
}
