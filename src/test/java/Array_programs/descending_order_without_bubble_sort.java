package Array_programs;

import java.util.Arrays;

public class descending_order_without_bubble_sort {
	public static void main(String[] args) {
		int[] arr = {8, 3, 9, 2, 10, 54, 23};
		Arrays.sort(arr);
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
