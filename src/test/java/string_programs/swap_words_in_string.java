package string_programs;

public class swap_words_in_string {

	public static void main(String[] args) {
		String s = "Sachinkumar Biradar";
		System.out.println("Before swapping ==> "+s);
		System.out.println("After swapping ==> "+swap(s));
	}

	public static String swap(String name) {
		String[] words = name.split(" ");
		String temp = null;
		temp = words[0];
		words[0] = words[1];
		words[1] = temp;
		return words[0]+" "+words[1];
	}
}
