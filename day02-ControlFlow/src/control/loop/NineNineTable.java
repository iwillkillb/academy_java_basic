package control.loop;
/**
 * 중첩루프를 사용해서 구구단을 출력.
 * 2 ~ 9단을 출력한다.
 * 각 단을 시작할 때 단의 제목을 출력.
 * @author PC38208
 *
 */
public class NineNineTable {

	public static void main(String[] args) {
		// 외부 for 반복문 : 2 ~ 9단을 반복
		for (int stage = 2; stage <= 9; stage++) {
			// 단의 제목 출력
			System.out.printf("%n%d단%n", stage);
			// 내부 for 반복문 : 1 ~ 9까지 곱해지는 수를 반복
			for (int times = 1; times <= 9; times++) {
				System.out.printf("%d X %d = %2d%n", stage, times, stage * times);
			}
		}
	}

}
