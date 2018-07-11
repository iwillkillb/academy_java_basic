package inheritance.basic.person;

public class Teacher extends Person {
	// 1. 멤버변수 선언부
	String subject;
	
	// 2. 생성자 선언부
	Teacher () {
		
	}
	
	Teacher (String subject) {
		this.subject = subject;
	}
	
	Teacher (String id, String name, int age, String subject) {
		super (id, name, age);
		this.subject = subject;
	}
	
	// 3. 메소드 선언부
	@Override
	public String toString() {
		String teacherStr = String.format(", 교과 : %s", subject);
		return "교사 정보 - " + super.toString() + teacherStr;
	}
}
