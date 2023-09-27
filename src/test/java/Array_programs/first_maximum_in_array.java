package Array_programs;

import java.util.Arrays;

public class first_maximum_in_array {

	public static void main(String[] args) {
		int[] arr = {2, 5, 4, 9, 14, 1};
		
		/*
		 * Solution 1 with sort method available in the Arrays class java.util package
		 */
		Arrays.sort(arr);
		System.out.println("The first maximum number is "+arr[arr.length-1]);
		
		/*
		 * Solution 2: Using bubble sort
		 */
		int fmax = arr[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The first maximum number is "+fmax);
		
		/*
		 * Solution 3: 
		 */
		
	int fmax1 = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (fmax1<arr[i]) {
			fmax1=arr[i];
		}
	}
		System.out.println("First maximum is "+fmax1);
	}

}
