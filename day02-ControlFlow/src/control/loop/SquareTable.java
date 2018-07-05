package control.loop;

public class SquareTable {
	public static void main(String[] args) {
		int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int a=0 ; a<numberArray.length ; a++) {
			System.out.printf("%2d X %2d = %4d \n", numberArray[a], numberArray[a], numberArray[a] * numberArray[a]);
		}
		
		System.out.println();
		
		for (int n : numberArray) {
			System.out.printf("%2d X %2d = %4d \n", n, n, n * n);
		}
	}
}
