package shoes.list;

public class Shoe {
	// 1. 멤버 변수
	// 신발 제품코드
	private String shoeCode;
	// 신발 제품명
	private String shoeName;
	// 신발 사이즈
	private int size;
	// 가격
	private int price;
	// 신발 타입
	private String type;
	// 재고수량
	private int quantity;
	
	// 2. 생성자들
	public Shoe() {
		
	}
	public Shoe(String shoeCode) {
		this ();
		this.shoeCode = shoeCode;
	}
	public Shoe(String shoeCode, String shoeName) {
		this (shoeCode);
		this.shoeName = shoeName;
	}
	public Shoe(String shoeCode, String shoeName, int size) {
		this (shoeCode, shoeName);
		this.size = size;
	}
	public Shoe(String shoeCode, String shoeName, int size, int price) {
		this (shoeCode, shoeName, size);
		this.price = price;
	}
	public Shoe(String shoeCode, String shoeName, int size, int price, String type) {
		this (shoeCode, shoeName, size, price);
		this.type = type;
	}
	public Shoe(String shoeCode, String shoeName, int size, int price, String type, int quantity) {
		this (shoeCode, shoeName, size, price, type);
		this.quantity = quantity;
	}
	
	// 3. 접근자 / 수정자
	public String getShoeCode() {
		return shoeCode;
	}
	public void setShoeCode(String shoeCode) {
		this.shoeCode = shoeCode;
	}
	
	public String getShoeName() {
		return shoeName;
	}
	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// 4. 메소드들
	
	
	
	
	// 5. 재정의
	@Override
	public String toString() {
		String strShoe = String.format("%s : %s (%d사이즈) | %,d원 | %s 타입 | %d개 남음", shoeCode, shoeName, size, price, type, quantity);
		return strShoe;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((shoeCode == null) ? 0 : shoeCode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shoe other = (Shoe) obj;
		if (shoeCode == null) {
			if (other.shoeCode != null)
				return false;
		} else if (!shoeCode.equals(other.shoeCode))
			return false;
		return true;
	}
	
	
	
	
}
