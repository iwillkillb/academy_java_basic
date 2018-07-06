package array.multi;

import java.util.Scanner;

public class ArcheryScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] score = new int[3][9];
		int[] sum = new int[3];
		int max = 0, maxIndex = 0;
		
		// 각 선수별로 과녁 점수를 입력받아 배열에 저장.
		System.out.println("=====양궁 선수 점수 입력=====");
		for(int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 선수 점수 입력 : ");
			for(int j = 0; j<score[i].length; j++) {
				System.out.print((j + 1) + "번째 점수 : ");
				score[i][j] = scan.nextInt();
				sum[i] += score[i][j];
			}
		}
		
		System.out.print("우승 선수는 ");
		for(int i = 0; i < score.length; i++) {
			if(max < sum[i]) {
				max = sum[i];
				maxIndex = i;
			}
		}
		System.out.println((maxIndex + 1) + "번째 선수입니다. 총점 : " + max);
		
		scan.close();
	}

}
