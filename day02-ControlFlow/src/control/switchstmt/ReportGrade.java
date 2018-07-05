package control.switchstmt;

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
public class ReportGrade {

	public static void main(String[] args) {
		// 1. 선언, 2. 초기화
		int score = -1;
		char grade = '?';
		// 스캐너 변수 초기화
		Scanner scan = new Scanner(System.in);
		// 무엇을 해야 하는가?, 스캐너를 사용하여 score 변수 재설정
		System.out.print("0~100사이의 점수를 입력 : ");
		score = scan.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("알 수 없는 점수입니다.");
		} else {
			switch(score / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
			case 6:
				grade = 'C';
				break;
			case 5:
			case 4:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			System.out.printf("%d점에 해당하는 학점은 %c입니다.%n", score, grade);
		}
		scan.close();
	}

}
