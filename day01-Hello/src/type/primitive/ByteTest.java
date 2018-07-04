package type.primitive;
/**
 * 1 byte = 8 bit에 해당하는 크기만큼 정수를 저장하는 타입인 byte타입을 테스트하는 클래스이다.
 * @author PC38208
 *
 */
public class ByteTest {

	public static void main(String[] args) {
		// 1. 선언
		byte buffer;
		
		// 2. 초기화
		buffer = 0;
		
		// 3. 사용
		for (int idx = 0; idx < 257; idx++) {
			System.out.print(buffer++);
			System.out.println(" , ");
		}
		// 저장할 수 있는 값의 범위를 넘어서는 값을 직접 할당할 수는 없다.
		buffer = 127;
	}

}
