package Interview_Programs;

public class check_number_is_palindrome {

	public static void main(String[] args) {
		int number = 2002;
		int reverse = 0;
		int temp = number;
		while (number>0) {
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		System.out.println(reverse);
		System.out.println(temp);
		if (reverse==temp) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}
	}

}
