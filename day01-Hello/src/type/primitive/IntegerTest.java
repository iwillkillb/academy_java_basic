package type.primitive;
/**
 * 정수형 타입 중 가장 대표적인 int타입을 테스트하는 클래스.
 * 
 * @author PC38208
 *
 */
public class IntegerTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 한 줄에 변수를 선언하며 초기화하는 것을 여러번 나열하는 것이 가능함.
		int num1 = 5, num2 = 28;
		// (한 줄에 여러 변수를 선언하는 것이 가능함.)
		int num3, num4, num5;
		
		int num6;
		int num7;
		int num8;
		
		// num3, 4, 5에 대해서는 초기화
		// num1, 2에 대해서는 사용
		num3 = num1 * num2;	//곱셈
		num4 = num2 / num1;	//나눗셈
		num5 = 25 / num1;	//나눗셈

		// 3. 사용
		System.out.println("5 * 28 = " + num3);
		System.out.println("28 / 5 = " + num4);
		System.out.println("25 / 5 = " + num5);
	}

}
