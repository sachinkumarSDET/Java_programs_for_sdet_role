package Array_programs;

import java.util.LinkedHashSet;

public class occurence_of_each_numbers_in_array {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 2, 9, 12, 4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Integer number : set) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (number==arr[i]) {
					count++;
				}
			}
				System.out.println(number+" is occuring "+count+" times");
		}
	}

}
