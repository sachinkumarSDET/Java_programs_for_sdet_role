package Interview_Programs;

import java.util.Arrays;

public class Check_anagram {

	public static void main(String[] args) {
		String s = "Night";
		String s1 = "Thing";
		
		char[] original_word = s.toLowerCase().toCharArray();
		char[] validation_word = s1.toLowerCase().toCharArray();
		
		Arrays.sort(original_word);
		Arrays.sort(validation_word);
		
		if (s.length()!=s1.length()) {
			System.out.println(s+" and "+s1+" are not anagrams.");
		} else {
			for (int i = 0; i < validation_word.length; i++) {
				if (original_word[i]==validation_word[i]) {
					continue;
				}
			}
			System.out.println(s+" and "+s1+" are anagrams.");
		}

	}

}
