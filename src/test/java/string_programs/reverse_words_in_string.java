package string_programs;

public class reverse_words_in_string {

	public static void main(String[] args) {
		
		String name = "Sachinkumar Biradar SDET";
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
