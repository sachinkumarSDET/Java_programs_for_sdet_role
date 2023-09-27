package string_programs;

public class Check_palindrome_condition {

	public static void main(String[] args) {
		
		String word = "malayalam";
		if (word.equalsIgnoreCase(reverse(word))) {
			System.out.println("The given "+word+" word is palindrome");
		} else {
			System.out.println("The given "+word+" word is not palindrome");
		}
		
	}
		public static String reverse(String word) {
			String reverse_word="";
			for (int i = word.length()-1; i>=0; i--) {
				reverse_word = reverse_word+word.charAt(i);
			}
			return reverse_word;
		}
}
