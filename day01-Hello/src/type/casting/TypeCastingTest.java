package type.casting;
/**
 * 숫자형 데이터 사이에 형 변환(type casting)을 테스트하는 클래스.
 * @author PC38208
 *
 */
public class TypeCastingTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		double pi = 3.14159265358979353846f;
		int number = 100;
		int result;
		double result1;
		
		// (타입)피연산값; <= 피 연산값을 강제 형변환 구문
		result = number + (int)pi;
		result1 = number + pi;
		
		// 3. 사용
		System.out.println("double pi = " + pi);
		System.out.println("int number = " + number);
		System.out.println("int result = " + result);
		System.out.println("int result1 = " + result1);
	}

}
