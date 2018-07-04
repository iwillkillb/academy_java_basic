package operator.binary;

import java.util.Scanner;

public class ScoreInput {

	public static void main(String[] args) {
		// 1. 선언
		// 스캐너 선언
		Scanner scan;
		
		// 변수 선언
		int score;
		
		// 2. 초기화
		// 스캐너 초기화
		scan = new Scanner(System.in);
		// 변수 초기화 : 스캐너를 통해서 입력
		
		System.out.println("점수를 입력 : ");
		score = scan.nextInt();
		
		// 3. 사용
		// 0 <= score <= 100
		if (score >= 0 && score <= 100) {
			System.out.printf("%d점은 유효한 점수입니다.\n", score);
		} else {
			System.out.printf("%d점은 유효한 점수가 아닙니다.\n", score);
		}
		/*
		 * 테스트 진행 시 주의점
		 * 
		 * 1. 올바른 데이터만으로 테스트하지 말 것.
		 * 2. 경계값 테스트를 반드시 진행.
		 * 3. 잘못된 결과를 발생시킬 것으로 예상되는 값으로 진행.
		 */
		
		scan.close();
	}

}
