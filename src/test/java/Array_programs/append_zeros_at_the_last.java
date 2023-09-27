package Array_programs;

public class append_zeros_at_the_last {

	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 4, 0, 4, 0};
		int m = 0;
		int n = arr.length-1;
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				arr1[m] = arr[i];
				m++;
			} else {
				arr1[n] = arr[i];
				n--;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}

}
