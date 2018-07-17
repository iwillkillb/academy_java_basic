package junit.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

class AssertTest {
	/* -----------------------------------------
	 * @Test 애너테이션이 붙은 메소드를 자동 실행하여 테스트를 진행
	 * 모든 테스트 메소드는 리턴타입이 void여야 한다.
	 * 모든 테스트 메소드는 매개변수가 없어야 한다.
	 * -----------------------------------------
	 */
	@Test
	void testAssertEquals() {
		assertEquals("실패-문자열이 서로 다름", "안녕하세요", "JUnitTest");
	}
	
	@Test
	void testAssertEquals2() {
		// 두 입력이 같을 것을 가정하여 같은 값이면 test가 success라고 판단.
		assertEquals("안녕하세요", "안녕하세요");
	}
	
	@Test
	void testAssertBoolean() {
		// false가 들어와야 success라고 판단
		assertFalse("실패-조건이 false가 아님", true);
	}
	
	@Test
	void testNull() {
		// 입력값이 null인 경우 success
		assertNull(null);
	}
	
	@Test
	void testNull2() {
		// 입력값이 null이 아니므로 fail
		assertNull(new Object());
	}
	
	@Test
	void testAssertNotSame() {
		assertNotSame("동일 객체가 아니어야 함", new Object(), new Object());
	}
	
	@Test
	void testAssertThatHasItems() {
		assertThat(Arrays.asList("1st", "2nd", "3rd"), CoreMatchers.hasItems("1st", "2nd"));
	}

	@Test
	void testAssertArrayEquals () {
		int[] numbers = new int[10];
		int[] copied = numbers;
		assertArrayEquals("두 배열이 동일함.", numbers, copied);
	}

	@Test
	void testAssertByteArrayEquals () {
		byte[] expected = "테스트".getBytes();
		byte[] actual = "합니다".getBytes();
		assertArrayEquals(expected, actual);
	}

}
