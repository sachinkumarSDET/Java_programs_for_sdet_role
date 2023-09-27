package string_programs;

import java.util.LinkedHashSet;

public class duplicates_in_String {

	public static void main(String[] args) {
		String s = "sachinkumarbiradarsdetattestyantra";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character character : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character==s.charAt(i)) {
					count++;
				}
			}
			
			if (count>1) {
				System.out.print(character+"="+count+" ");
			}
		}

	}

}
