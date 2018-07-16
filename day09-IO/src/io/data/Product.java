package io.data;
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
