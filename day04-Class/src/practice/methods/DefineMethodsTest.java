package practice.methods;

public class DefineMethodsTest {

	public static void main(String[] args) {
		MakeMethods methods = new MakeMethods();
		
		methods.printTenTimes (505);
		System.out.println("========================");
		methods.printSomebodysMessage ("Jone", "What are you doing?");
		System.out.println("========================");
		methods.printMessage ("Hello, world!");
		System.out.println("========================");
		System.out.println(methods.returnOriginMessage("Nice meet to you."));
		System.out.println("========================");
		System.out.println("addTen 100 : " + methods.addTen(100));
		System.out.println("========================");
		System.out.println("subtractTen 100 : " + methods.subtractTen(100));
		System.out.println("========================");
		System.out.println("makeDouble 2.2 : " + methods.makeDouble(2.2));
		System.out.println("========================");
		System.out.println("subtractFivePointFive 5.5 : " + methods.subtractFivePointFive(10.7));
		System.out.println("========================");
		System.out.println(methods.makeFullName("Hyunchan", "Jeon"));
		System.out.println("========================");
		System.out.println("100 + 200 = " + methods.add(100, 200));
		System.out.println("========================");
		System.out.println("1.1 + 2.2 = " + methods.add(1.1, 2.2));
		System.out.println("========================");
		methods.printMsgManyTimes("Test Message", 5);;
		System.out.println("========================");
		methods.arithmetic("+", 4, 3);
		methods.arithmetic("-", 4, 3);
		methods.arithmetic("*", 4, 3);
		methods.arithmetic("/", 4, 3);
		methods.arithmetic("?", 4, 3);
		System.out.println("========================");
		System.out.println("arithmetic1 : " + methods.arithmetic1("+", 7, 5));
		System.out.println("arithmetic1 : " + methods.arithmetic1("-", 7, 5));
		System.out.println("arithmetic1 : " + methods.arithmetic1("*", 7, 5));
		System.out.println("arithmetic1 : " + methods.arithmetic1("/", 7, 5));
		System.out.println("arithmetic1 : " + methods.arithmetic1("?", 7, 5));
		System.out.println("========================");
		System.out.println("2는 짝수인가?" + methods.isEven(2));
		System.out.println("3은 짝수인가?" + methods.isEven(3));
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("========================");
		System.out.println("absolute 46 : " + methods.absolute(46));
		System.out.println("absolute -46 : " + methods.absolute(-46));
		System.out.println("========================");
		System.out.println("findMultiple");
		methods.findMultiple(7);
		System.out.println("========================");
		System.out.println("decideSign 21 : " + methods.decideSign(21));
		System.out.println("decideSign 0 : " + methods.decideSign(0));
		System.out.println("decideSign -2 : " + methods.decideSign(-2));
		System.out.println("========================");
		methods.repeatMessage("Repeat message...", 6);
		System.out.println("========================");
		System.out.println("반지름 5의 원 넓이 : " + methods.calcCircleArea(5));
		System.out.println("========================");
		int[] nums = methods.makeMultipleNums(5);
		for (int idx = 0; idx < nums.length; idx++) {
			System.out.println(idx + " : " + nums[idx]);
		}
	}

}
