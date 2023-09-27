package string_programs;

import java.util.ArrayList;

public class length_of_string_without_inbuilt_method {

	public static void main(String[] args) {
		String s = "sachinkumarbiradar";
		int count =0;
		ArrayList<Character> list = new ArrayList<>();
		for (Character character : s.toCharArray()) {
			list.add(character);
			count++;
		}
		System.out.println("length of string is = "+count);
		System.out.println("length of string is = "+list.size());
	}

}
