package array.multi;

public class MultiDarray {

	public static void main(String[] args) {
		char stars[][] = new char[6][];
		
		for (int i = 0; i < stars.length; i++) {
			stars[i] = new char[i+1];
			for (int j=0; j < stars[i].length ; j++) {
				stars[i][j] = '★';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}
	}

}
