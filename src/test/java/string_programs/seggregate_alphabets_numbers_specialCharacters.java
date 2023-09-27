package string_programs;

public class seggregate_alphabets_numbers_specialCharacters {

	public static void main(String[] args) {
		
		String s = "1fh458svj%&*bjegh yfjhvj67890$%^&*";
		String alphabets ="";
		String numbers = "";
		String spl_char = "";
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
				alphabets = alphabets+s.charAt(i);
			} else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				numbers = numbers+s.charAt(i);
			} else {
				spl_char=spl_char+s.charAt(i);
			}
		}
		System.out.println(alphabets+numbers+spl_char);
	}

}
