package utils;

public class Math {
	
	public static int factorial(int a) {
		if(a <= 1) {
			return 1;		}
		return a * factorial(a - 1);
	}
	
	public static int factorialLoop(int input) {
		int total = 1;
		for(int i = input; i >= 1; i--) {
			total = total * i;
		}
		return total;
	}
	
	//the methods below will calculate the factorial of numbers higher than 12
	
	public static long factorial2(long a) {
		if(a <= 1) {
			return 1;		}
		return a * factorial2(a - 1);
	}
	
	public static long factorialLoop2(int input) {
		int total = 1;
		for(int i = input; i >= 1; i--) {
			total = total * i;
		}
		return total;
	}
	
}