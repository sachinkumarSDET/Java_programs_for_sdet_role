package Array_programs;

public class position_of_each_number {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 9, 12, 4};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" is at the "+(i+1)+" position");
		}
	}

}
