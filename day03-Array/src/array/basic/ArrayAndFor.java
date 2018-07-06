package array.basic;
/**
 * 배열과 for구문구조의 조합
 * ------------------
 * 배열과 for구문은 항상 같이 사용되는 조합이므로, 둘 사이의 용법을 능숙하게 다룰 수 있어야 합니다.
 * 10칸 짜리 int 배열 변수를 선언하고 for구문으로 초기화, 출력.
 * @author PC38208
 *
 */
public class ArrayAndFor {

	public static void main(String[] args) {
		// 1. 선언 : int 배열 참조 변수 선언
		int[] numbers;
		// 원소의 합을 저장할 변수
		int summary = 0;
		
		// 2. 초기화 : 배열 참조 변수의 타입은 기본형 8가지가 아니므로, new로 초기화를 해야 한다.
		numbers = new int[10];
		
		// 3. 사용
		// (1) 1 ~ 10까지 값을 할당
		for (int idx = 0; idx < numbers.length; idx++) {
			numbers[idx] = idx + 1;
		}
		
		// (2) 할당한 값을 출력 : for 구문
		for (int idx = 0; idx < numbers.length; idx++) {
			System.out.printf("numbers[%d] = %d%n", idx, numbers[idx]);
		}
		
		System.out.println("==========================");
		// (3) 할당한 값을 출력 : foreach 구문
		for (int number: numbers) {
			System.out.printf("number = %d%n", number);
		}
		
		// (4) 모든 앨리먼트들의 합 계산	
		System.out.println("==========================");
		for (int number: numbers) {
			summary += number;
		}
		System.out.printf("원소의 총합 (summary) = %d%n", summary);
	}

}
