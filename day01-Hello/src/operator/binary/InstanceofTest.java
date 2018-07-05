package operator.binary;
/**
 * 객체의 타입을 조사하는 연산자
 * instanceof를 테스트하는 클래스.
 * ------------------------------------
 * object instanceof class
 * 로 사용시 object가 class 타입의 객체이면 true
 * 그 외의 경우는 false를 결과로 얻어내는 연산자.
 * ------------------------------------
 * 
 * @author PC38208
 *
 */
public class InstanceofTest {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		String name = "전현찬";
		boolean result;
		
		// 3. 사용
		result = name instanceof String;
		System.out.printf("name = %s이며, %s(은)는 String 타입이다? %b%n", name, name, result);
		
		
		
		// 1. 선언 : StringBuffer : 문자열을 저장하는 String과 유사한 다른 타입.
		// StringBuffer surname = "Jeon";	일반 변수와 같은 초기화는 불가능.
		StringBuffer surname;
		
		// 2. 초기화
		surname = new StringBuffer("Jeon");	// new 연산자 필요
		
		// 3. 사용
		result = (Object)surname instanceof String;
		System.out.printf("surname = %s이며, %s(은)는 String 타입이다? %b%n", surname, surname, result);
	}

}
