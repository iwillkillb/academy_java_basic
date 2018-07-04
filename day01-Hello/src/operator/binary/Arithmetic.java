package operator.binary;

import java.util.Scanner;

/**
 * 이항연산자 중 산술연산자(+, -, *, /, %)를 테스트하는 클래스.
 * printf를 써서 포맷팅하여 테스트.
 * 두 정수를 입력받아서 입력받은 값으로 사칙연산과 나머지 연산을 수행함.
 * @author PC38208
 *
 */
public class Arithmetic {

	public static void main(String[] args) {
		// 키보드 입력을 쉽게 해주는 스캐너를 사용.
		// 1. 선언
		// 정수를 저장할 변수 선언
		int input1;
		int input2;
		
		// 키보드 입력을 쉽게 해주는 스캐너를 사용.
		// 스캐너 변수 선언.
		// Ctrl + Shift + O = 자동 import
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 두 개 입력 : ");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		System.out.printf("%d + %d = %d \n", input1, input2, input1 + input2);
		System.out.printf("%d - %d = %d \n", input1, input2, input1 - input2);
		System.out.printf("%d * %d = %d \n", input1, input2, input1 * input2);
		System.out.printf("%d / %d = %d \n", input1, input2, input1 / input2);
		System.out.printf("%d %% %d = %d \n", input1, input2, input1 % input2);
		scan.close();
	}

}
