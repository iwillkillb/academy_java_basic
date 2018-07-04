package type.primitive;
/**
 * 문자 1개를 저장하는 타입 char형 변수에
 * 유니코드 표기법으로 저장하여 테스트하는 클래스.
 * @author PC38208
 *
 */
public class CharTestUnicode {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		char han = '\ud55c';	// 유니코드
		char gul = '\uae00';
		
		// 3. 사용
		System.out.println(han + gul);		// 산술연산 : 99164, 두 값의 십진연산 결과
		System.out.println(han + "" + gul);	// 문자결합 : 한글, 접합연산이 일어나 문자로 처리
		System.out.println(han);
		System.out.println(gul);	//따로 쓰면 한/글 이라고 나온다.
	}

}
