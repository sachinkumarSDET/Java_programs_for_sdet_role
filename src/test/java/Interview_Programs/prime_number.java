package Interview_Programs;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		prime_number prime_class = new prime_number();
		prime_class.prime(n);
		
	}
	public void prime(int n) {
		int count =0;
		if (n==0 || n==1) {
			System.out.println(n+" is not a prime number");
		} else {
			for (int i = 2; i <=(n/2); i++) {
				if (n%i==0) {
					count++;
				} 
			}
			if (count==1) {
				System.out.println(n+" is a prime number");
			} else {
				System.out.println(n+" is not a prime number");
			}
		}
	}
}
