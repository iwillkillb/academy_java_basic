package inheritance.abstrct.person;

public class Employee extends Person {
	// 1. 멤버변수 선언부
	String dept;
	
	// 2. 생성자 선언부
	Employee () {
		
	}
	
	Employee (String dept) {
		this.dept = dept;
	}
	
	Employee (String id, String name, int age, String dept) {
		super (id, name, age);
		this.dept = dept;
	}
	
	// 3. 메소드 선언부
	@Override
	public String toString() {
		String employeeStr = String.format(", 부서 : %s", dept);
		return "직원 정보 - " + super.toString() + employeeStr;
	}

	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
	}
}
