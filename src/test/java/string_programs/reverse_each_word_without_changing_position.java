package string_programs;

public class reverse_each_word_without_changing_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Sachinkumar Biradar SDET";
		System.out.println("Before reversal ==> "+name);
		System.out.println("After reversal ==> "+reverse_words(name));
		
	}

	public static String reverse_words(String name) {
		String[] words = name.split(" ");
		String reverse = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			for (int j = word.length()-1; j >=0; j--) {
				reverse = reverse+word.charAt(j);
			}
			reverse = reverse+" ";
		}
		return reverse;
	}
}
