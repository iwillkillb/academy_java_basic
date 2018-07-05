package control.ifstmt;

import java.util.Scanner;

/**
 * 키와 몸무게 (둘 다 double)를 입력받아 BMI 지수를 출력하고, 판정한다.
 * @author PC38208
 *
 */
public class CalcBMI {

	public static void main(String[] args) {
		double weight, length;
		double bmi;
		String result;
		Scanner scan = new Scanner(System.in);

		System.out.print("키를 입력하세요(m) : ");
		length = scan.nextDouble();
		System.out.print("몸무게를 입력하세요(kg) : ");
		weight = scan.nextDouble();
		
		bmi = weight / (length * length);
		if (bmi < 15) {
			result = "병적인 저체중";
		} else if (bmi >= 15 && bmi < 18.5) {
			result = "저체중";
		} else if (bmi >= 18.5 && bmi < 23) {
			result = "정상";
		} else if (bmi >= 23 && bmi <= 27.5) {
			result = "과체중";
		} else if (bmi > 27.5 && bmi <= 40) {
			result = "비만";
		} else {
			result = "병적인 비만";
		}
		System.out.printf("당신의 BMI 지수는 %.2f, %s상태입니다.\n", bmi, result);
		
		scan.close();
	}

}
