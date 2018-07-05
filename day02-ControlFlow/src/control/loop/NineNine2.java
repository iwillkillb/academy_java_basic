package control.loop;

public class NineNine2 {

	public static void main(String[] args) {		
		
		for (int stage = 2; stage <= 8; stage += 3) {
			
			if (stage < 8) {
				System.out.printf("\n%d단 \t\t %d단 \t\t %d단 \n", stage, stage + 1, stage + 2);
				for (int times = 1; times <= 9; times ++) {				
					System.out.printf("%d X %d = %2d \t %d X %d = %2d \t %d X %d = %2d \n",
							stage, times, stage * times,
							stage + 1, times, (stage + 1) * times,
							stage + 2, times, (stage + 2) * times
							);
				}
			} else {
				System.out.printf("\n%d단 \t\t %d단 \n", stage, stage + 1);				
				for (int times = 1; times <= 9; times ++) {				
					System.out.printf("%d X %d = %2d \t %d X %d = %2d \n",
							stage, times, stage * times,
							stage + 1, times, (stage + 1) * times
							);
				}
			}
		}
		
	}

}
