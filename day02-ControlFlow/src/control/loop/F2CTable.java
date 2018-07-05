package control.loop;

/**
 * 화씨온도F -> 섭씨온도C 로 변환
 * C = 5 / 9 * (F - 32)
 * 화씨온도 0.0도에서 10도씩 증가시키면서 100.0도까지 계산
 * for 구문구조 사용
 * 화씨온도 : fah
 * 섭씨온도 : cel
 * @author PC38208
 *
 */
public class F2CTable {

	public static void main(String[] args) {
		double fah;
		double cel;
		
		final int FROM = 0, TO = 100, STEP = 10;
		
		for (fah = FROM ; fah <= TO ; fah += STEP) {
			cel = 5.0 / 9.0 * (fah - 32.0);
			System.out.printf("%5.1f F = %5.1f C %n", fah, cel);
		}
		
		System.out.printf("최종 fah = %5.1f %n", fah);
	}

}
