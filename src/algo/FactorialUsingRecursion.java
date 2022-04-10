package algo;

public class FactorialUsingRecursion {
	
	public static void main(String arr[]) {
		int number = 6;
		
		System.out.println(factorial(number));
	}
	
	public static int factorial(int number) {
		
		return (number > 1) ? number * factorial(number - 1) : 1; 
	}

}
