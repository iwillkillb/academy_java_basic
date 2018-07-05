package control.ifstmt;

import java.util.Scanner;

/**
 * 다중 선택 if 구문을 사용하여 다음의 기준으로
 * 
 * 90점 이상  A
 * 80 ~ 89 B
 * 60 ~ 79 C
 * 40 ~ 59 D
 * 나머지      F
 * 
 * 입력된 점수에 대해 학점을 계산하는 클래스를 작성
 * 
 * 점수 int 타입 변수명 score
 * 학점 char 타입 변수명 grade를 사용할 것.
 * 
 * 출력시 printf 사용
 * @author PC38208
 *
 */
public class Grade {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int score = -1;
		char grade = '?';
		// 스캐너 변수 초기화
		Scanner scan = new Scanner(System.in);
		
		while (score > 100 || score < 0 ) {
			// 무엇을 해야 하는가?, 스캐너를 사용하여 score 변수 재설정
			System.out.print("0~100사이의 점수를 입력 : ");
			score = scan.nextInt();
			// 3. 사용 : score에 입력된 값을 판단.
			if (score <= 100 && score >= 0 ) {	// score를 범위 내에 제대로 넣었을 경우
				if (score >= 90) {
					grade = 'A';
				} else if (score >= 80) {	// else if 조건은 위의 조건을 만족하지 못한 경우.
					grade = 'B';
				} else if (score >= 60) {
					grade = 'C';
				} else if (score >= 40) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				System.out.printf("%d점에 해당하는 학점은 %c입니다.%n", score, grade);
			} else {	// score를 범위 내에 제대로 넣지 않았을 경우
				System.out.println("알 수 없는 점수입니다.");
			}
		}
		scan.close();
	}

}
