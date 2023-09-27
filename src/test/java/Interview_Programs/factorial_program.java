package Interview_Programs;

import java.util.Scanner;

public class factorial_program {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("The factorial of "+n+" is "+factorial(n));
	}
	
	public static int factorial(int n) {
		int result = 1;
		for (int i = n; i >0; i--) {
			result = result*i;
		}
		return result;
	}
}
