package Array_programs;

public class descending_order_using_bubble_sort {

	public static void main(String[] args) {
		int[] arr = {8, 3, 9, 2, 10, 54, 23};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
