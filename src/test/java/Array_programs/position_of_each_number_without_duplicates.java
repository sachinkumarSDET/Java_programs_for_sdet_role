package Array_programs;

import java.util.LinkedHashSet;

public class position_of_each_number_without_duplicates {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 2, 9, 12, 4};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (Integer number : set) {
			for (int i = 0; i < arr.length; i++) {
				if (number==arr[i]) {
					System.out.println(number+" is at "+(i+1)+" position");
					break;
				}
			}
		}
	}

}
