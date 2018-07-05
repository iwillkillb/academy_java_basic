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
		int score = -1;
		char grade = '?';
		
		Scanner scan = new Scanner(System.in);
		
		while (score > 100 || score < 0 ) {
			System.out.print("0~100사이의 점수를 입력 : ");
			score = scan.nextInt();
			
			if (score <= 100 && score >= 0 ) {
				if (score >= 90) {
					grade = 'A';
				} else if (score >= 80) {
					grade = 'B';
				} else if (score >= 60) {
					grade = 'C';
				} else if (score >= 40) {
					grade = 'D';
				} else {
					grade = 'F';
				}
				System.out.println(score + "점에 해당하는 학점은 " + grade + "입니다.");
			} else {
				System.out.println("알 수 없는 점수입니다.");
			}
		}
		scan.close();
	}

}
