package array.multi;

import java.util.Scanner;

public class BestPitcher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] ERA = new double[3][5];
		double min = 10.0;
		int minIndexTeam = 0, minIndexSel = 0;
		
		// 각 팀별로 각 투수의 방어율을 입력받아 배열에 저장한다.
		System.out.println("1선발 2선발 3선발 4선발 5선발 방어율 입력");
		for (int i = 0; i < ERA.length; i++) {
			System.out.println((i + 1) + "번째 팀 1~5선발 투수 방어율 : ");
			for (int j = 0; j < ERA[i].length ; j++) {
				System.out.print((j + 1) + "선발 : ");
				ERA[i][j] = scan.nextDouble();
				while(ERA[i][j] >= 10.0 || ERA[i][j] <= 0) {
					System.out.print("(0보다 크고, 10보다 작은 수로 입력하세요.) " + (j + 1) + "선발 : ");
					ERA[i][j] = scan.nextDouble();
				}
			}
		}
		
		System.out.print("최고의 투수는 ");
		for (int i = 0; i < ERA.length; i++) {
			for (int j = 0; j < ERA[i].length ; j++) {
				if (min > ERA[i][j]) {
					min = ERA[i][j];
					minIndexTeam = i;
					minIndexSel = j;
				}
			}
		}
		System.out.println((minIndexTeam + 1) + "번째 팀의 " + (minIndexSel + 1) + "선발 투수입니다. 방어율 : " + min);
		
		scan.close();
	}

}
