package array.swap;
/**
 * 두 변수의 값을 서로 맞바꾸는 swap기법을 적용하여 배열의 순서를 뒤집어보는 클래스.
 * @author PC38208
 *
 */
public class SwapArray {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120};
		
		/* -----------------
		 * 배열을 뒤집는 로직의 구성
		 * -----------------
		 * 1. 전체 배열의 끝까지 순회를 하면 배열은 두 번 뒤집어져 값의 변화가 없다.
		 * 2. 배열의 순서를 뒤집을 때에는 길이의 반만 작업을 수행하면 된다.
		 * 0 : 11 = length - 1 - idx
		 * 1 : 10
		 * 2 : 9
		 * 3 : 8
		 * 4 : 7
		 * 5 : 6
		 * 0 ~ 5까지의 인덱스 값은 (numbers.length / 2)보다 작은 동안
		 * 0 < idx < numbers.length / 2
		 * 맞바꿀 원소의 인덱스 : length - 1 - idx
		 */
		
		// 3. 사용
		for (int idx = 0; idx < numbers.length / 2; idx++) {
			// swap을 위한 임시 변수
			int temp;
			// 앞쪽 원소 백업
			temp = numbers[idx];
			// 뒤쪽 원소 값 복사
			numbers[idx] = numbers[numbers.length - 1 - idx];
			// 백업 원소를 뒤쪽 칸에 복사
			numbers[numbers.length - 1 - idx] = temp;
		}
		
		// 출력
		for (int n : numbers) {
			System.out.printf ("%3d=", n);
		}
	}

}
