package calc;

import static calc.Calculator.*;
/**
 * 산술연산을 하는 클래스인 Calculator를 테스트한다.
 * @author PC38208
 *
 */
public class CalculatorTest {

	public static void main(String[] args) {
		// 1. 선언
		Calculator calc;
		
		// 2. 초기화 : 기본 생성자가 자동 정의됨.
		calc = new Calculator();	// non-static 영역의 명시적 초기화 : new 사용
		
		// 3. 사용
		//Calculator 클래스의 add() 메소드 사용
		// (1) static -> non-static : 다른 클래스
		int addResult = calc.add(100, 200);
		System.out.println("100 + 200 = " + addResult);
		
		// 이 클래스에 있는 add()를 사용.
		// (2) static -> non-static : 같은 클래스
		CalculatorTest cTest = new CalculatorTest ();
		cTest.add (10, 20);
		
		System.out.println();
		// 동일 클래스 안의 static 영역끼리의 호출 : 이름만으로 바로 사용 가능.
		// (3) static -> static : 같은 클래스
		subtract (10, 20);
		
		// 다른 클래스의 static 영역끼리의 호출 : 앞에 클래스 이름을 명시
		// (4) static -> static : 다른 클래스
		Calculator.subtract (20.0, 45.0);
		
		// (5) static import를 사용하여 마치 내가 가지고 있는 메소드처럼 호출 가능.
		Calculator.add(10.0, 20.0);
		multiply (10.0, 20.0);
	}

	// add 메소드 정의 : non-static
	public int add (int x, int y) {
		System.out.printf("%d + %d = %d", x, y, x + y);
		return x + y;
	}
	
	// subtract 메소드 정의 : static
	public static int subtract (int x, int y) {
		System.out.printf("%d - %d = %d", x, y, x - y);
		return x - y;
	}
}
