package exception.scope;

public class ExceptionScopeTest {

	public static void main(String[] args) {
		// 1. 선언
		ExceptionScope demo;
		
		// 2. 초기화
		demo = new ExceptionScope();
		
		// 3. 사용
		System.out.println("메인 메소드 시작");
		demo.level1();
		System.out.println("메인 메소드 종료");
	}

}
