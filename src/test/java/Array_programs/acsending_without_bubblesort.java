package Array_programs;

import java.util.Arrays;

public class acsending_without_bubblesort {
	public static void main(String[] args) {
		int[] arr = {8, 3, 9, 2, 10, 54, 23};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
