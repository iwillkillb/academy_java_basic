package inheritance.basic.person;
/**
 * Person과 상속관계인 Student를 테스트하는 클래스.
 * @author PC38208
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// 1. 선언
		Person person = new Person ("P00", "김철수", 18);
		Student student = new Student ("S01", "홍길동", 18, "도술");
		Teacher teacher = new Teacher ("T02", "이몽룡", 36, "과거시험");
		Employee employee = new Employee ("E03", "심청", 20, "인당수");
		
		// 2. 초기화
		
		// 3. 사용
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(teacher.toString());
		System.out.println(employee.toString());
	}

}
