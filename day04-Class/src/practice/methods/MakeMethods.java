package practice.methods;

public class MakeMethods {
	// 1.
	public void printTenTimes (int input) {
		for (int idx = 0; idx < 10; idx++) {
			System.out.println (input + (10 * idx));
		}
	}

	// 2.
	public void printSomebodysMessage (String name, String message) {
		System.out.println (name + "의 메시지 : " + message);
	}

	// 3.
	public void printMessage (String message) {
		System.out.println (message);
	}

	// 4.
	public String returnOriginMessage (String message) {
		return message;
	}

	// 5.
	public int addTen (int input) {
		return input + 10;
	}

	// 6.
	public int subtractTen (int input) {
		return input - 10;
	}

	// 7.
	public double makeDouble (double input) {
		return input * 2;
	}

	// 8.
	public double subtractFivePointFive (double input) {
		return input - 5.5;
	}

	// 9.
	public String makeFullName (String name, String surname) {
		return surname + name;
	}

	// 10.
	public int add (int x, int y) {
		return x + y;
	}

	// 11.
	public double add (double x, double y) {
		return x + y;
	}

	// 12.
	public void printMsgManyTimes (String message, int input) {
		for (int count = 0; count < input; count++) {
			System.out.println (message + ", " + (count + 1) + "회");
		}
	}

	// 13.
	public void arithmetic (String operator, int x, int y) {
		switch (operator) {
			case "+":
				System.out.printf ("%d + %d = %d \n", x, y, x + y);
				break;
			case "-":
				System.out.printf ("%d - %d = %d \n", x, y, x - y);
				break;
			case "*":
				System.out.printf ("%d * %d = %d \n", x, y, x * y);
				break;
			case "/":
				System.out.printf ("%d / %d = %.2f \n", x, y, ((double)x / (double)y));
				break;
			default:
				System.out.printf ("잘못된 연산자입니다. \n");
				break;
		}
	}

	// 14.
	public double arithmetic1 (String operator, int x, int y) {
		switch (operator) {
			case "+":
				return (double)(x + y);
			case "-":
				return (double)(x - y);
			case "*":
				return (double)(x * y);
			case "/":
				return (double)x / (double)y;
			default:
				System.out.printf ("잘못된 연산자입니다. \n");
				return 0.0;
		}
	}

	// 15.
	public boolean isEven (int input) {
		return (input % 2 == 0) ? true : false;
	}

	//========================================

	// 1.
	public int absolute (int x) {
		return (x > 0) ? x : -x;
	}

	// 2.
	public void findMultiple (int x) {
		for (int val = x; val <= 100; val++) {
			if (val % x == 0)
				System.out.println (val);
		}
	}

	// 3.
	public String decideSign (int x) {
		if (x < 0)
			return "음의 정수";
		else if (x == 0)
			return "정수 0";
		else
			return "양의 정수";
	}

	// 4.
	public void repeatMessage (String message, int repeat) {
		String[] msgs = new String[repeat];
		for (int idx = 0; idx < msgs.length ; idx++) {
			msgs[idx] = message;
			System.out.println ("인덱스 " + idx + " : " + msgs[idx]);
		}
	}

	// 5.
	public double calcCircleArea (int r) {
		return 3.14 * r * r;
	}

	// 6.
	public int[] makeMultipleNums (int x) {
		int count = 0;
		int idx = 0;
		for (int val = x; val <= 100; val++) {
			if (val % x == 0)
				count++;
		}
		int[] nums = new int[count];
		for (int val = x; val <= 100; val++) {
			if (val % x == 0 && idx < nums.length)
				nums[idx++] = val;
		}
		return nums;
	}

}
