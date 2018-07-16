package divider.scope;

/**
 * 입력값에 따라 0으로 나누는 상황이 발생할 수 있는 Divider클래스를 테스트한다.
 * 테스트 과정에서 DivideZeroException을 try ~ catch 구문으로 처리한다.
 * @author PC38208
 *
 */
public class DividerScopeTest {

	public static void main(String[] args) {
		// 1. 선언
		DividerScope divScope;
		
		// 2. 초기화
		divScope = new DividerScope();
		
		// 3. 사용
		System.out.println("=== main이 실행되었습니다. ===");
		divScope.level1();
		System.out.println("=== main이 종료되었습니다. ===");
	}

}
