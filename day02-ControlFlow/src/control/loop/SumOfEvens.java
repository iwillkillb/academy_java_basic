package control.loop;
/**
 * 1 ~ 100 사이의 짝수의 합을 계산하는 클래스.
 * while 활용.
 * @author PC38208
 *
 */
public class SumOfEvens {

	public static void main(String[] args) {
		int number = 0;
		int sum = 0;
		
		while (number <= 100) {
			sum += number;
			System.out.println(number + " " + sum);
			number += 2;
		}
		
		// 다른 풀이
		number = 0;
		sum = 0;
		while (number <= 100) {
			if ((number % 2 == 0)) {
				sum += number;
				System.out.println(" -> " + number + " " + sum);
				number++;
			}
		}
		
		System.out.printf("1 ~ 100 사이 짝수의 합 : %d%n", sum);
	}

}
