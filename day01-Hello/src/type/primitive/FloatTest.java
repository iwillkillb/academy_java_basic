package type.primitive;
/**
 * 실수형 타입인 float, double 타입을 테스트하는 클래스.
 * @author PC38208
 *
 */
public class FloatTest {

	public static void main(String[] args) {
		// 1. 선언
		float pi1;
		double pi2;
		
		// 2. 초기화
		pi1 = 3.14f;	// float에는 f를 붙여야 한다.
		pi2 = 3.14;
		
		// 3. 사용 : 변수 값 출력
		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
		
		pi1 = 3.14159265358979353846f;
		pi2 = 3.14159265358979353846f;

		System.out.println("float pi1 = " + pi1);
		System.out.println("double pi2 = " + pi2);
	}

}
