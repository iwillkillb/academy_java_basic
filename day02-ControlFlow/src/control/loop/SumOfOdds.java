package control.loop;
/**
 * 1 ~ 100 사이의 홀수의 합을 구하는 함수.
 * while 구문을 활용한다.
 * @author PC38208
 *
 */
public class SumOfOdds {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		// 1 ~ 100 까지 증가시킬 값을 저장하는 변수 선언.
		int number = 1;
		// 홀수의 합을 저장할 변수 선언.
		int sum = 0;
		
		// 3. 사용
		while (number <= 100) {
			System.out.println(number + " " + sum);
			sum += number;
			number += 2;
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 : %d%n", sum);
		
		// 다른 풀이
		number = 1;
		sum = 0;
		while (number <= 100) {
			if (number % 2 == 1) {
				System.out.println(number + " " + sum);
				sum += number;
			}
			number++;
		}
		System.out.printf("1 ~ 100 사이의 홀수의 합 : %d%n", sum);
	}

}
