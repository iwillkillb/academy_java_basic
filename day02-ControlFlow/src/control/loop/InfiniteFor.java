package control.loop;
/**
 * for 반복구조에서 선언식, 조건식, 증감식이 생략된 구문을 무한반복을 테스트하는 클래스
 * @author PC38208
 *
 */
public class InfiniteFor {

	public static void main(String[] args) {
		// 조건식이 생략되어 항상 true로 간주 => 무한루프
		for (int idx = 0 ; ; idx++) {
			System.out.printf("idx = %d %n", idx);
		}
	}

}
