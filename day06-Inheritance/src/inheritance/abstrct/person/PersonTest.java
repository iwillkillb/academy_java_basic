package inheritance.abstrct.person;
/**
 * Person과 상속관계인 Student를 테스트하는 클래스.
 * @author PC38208
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// 1. 선언
		Person[] persons = new Person[3];
		persons[0] = new Student ("S01", "홍길동", 18, "도술");
		persons[1] = new Teacher ("T02", "이몽룡", 36, "과거시험");
		persons[2] = new Employee ("E03", "심청", 20, "인당수");
		
		// 2. 초기화
		
		// 3. 사용
		for (Person person: persons) {
			person.print();
		}
	}

}
