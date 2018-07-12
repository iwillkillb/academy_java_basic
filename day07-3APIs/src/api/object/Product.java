package api.object;
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
	public Product () {
		
	}
	public Product (String prodCode) {
		this ();
		this.prodCode = prodCode;
	}
	public Product (String prodCode, String prodName) {
		this (prodCode);
		this.prodName = prodName;
	}
	public Product (String prodCode, String prodName, int price) {
		this (prodCode, prodName);
		this.price = price;
	}
	public Product (String prodCode, String prodName, int price, int quantity) {
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
	public void print () {
		System.out.printf("번호 %s \t|\t 품명 %s \t|\t 가격 %d \t|\t 재고 %d \n", prodCode, prodName, price, quantity);
	}
	// 할인가 반환
	public int discount (double percentage) {
		int price = this.price;
		
		if (percentage > 0) {
			price = price - (int)(this.price * (percentage / 100));
		}
		return price;
	}
	// 판매 : quantity 감소, 0 이하 수량은 판매불가
	public void sell (int amount) {
		if (this.quantity >= amount && amount > 0) {
			this.quantity -= amount;
		}
	}
	// 입고 : quantity 증가
	public void buy (int amount) {
		if (amount > 0) {
			this.quantity += amount;
		}
	}
	
	
	
	@Override
	public boolean equals (Object obj) {
		// 1. 동일 비교 결과 저장 변수 선언
		// 2. 초기화 : 기본 false 설정
		boolean isEqual = false;
		// 3. 사용 : 동일한 객체인지 판단
		// (1) 비교 대상인 obj가 Product 타입인지 검사.
		if (obj instanceof Product) {
			// (2) 비교하려하는 this객체와 비교 대상인 obj간 각각의 필드가 동일한지 비교
			Product product = (Product)obj;
			// prodCode가 같으면 같은 객체로 인정
			if (this.prodCode.equals(product.prodCode)) {
				isEqual = true;
			}
		}
		return isEqual;
	}
	@Override
	public int hashCode() {
		// 입력이 동일하면 출력도 동일함을 보장하는 수학적 알고리즘.
		// 출력이 다르면 입력이 다르다는 결론을 보장하는 함수.
		// 1. 비교하려는 필드가 참조형이면 그 클래스의 hashCode()를 호출.
		// 2. 비교하려는 필드가 기본형이면 참조형으로 바꾸는 포장 클래스 객체로 변환 후에 hashCode()를 호출.
		// 3. 1과 2의 결과를 모두 ^(XOR)연산을 통과시킨다.
		return this.prodCode.hashCode();
	}
	// Object 클래스에서 나도 모르는 사이 상속받은 toString () 메소드를 재정의해보자.
	// 1. 메소드 헤더가 동일 : 리턴타입 메소드 이름 (매개변수)
	@Override
	public String toString() {
		String strProduct = String.format("번호 %s \t|\t 품명 %s \t|\t 가격 %,d \t|\t 재고 %d \n", prodCode, prodName, price, quantity);
		return strProduct;
	}
}
