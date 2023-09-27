package Array_programs;

public class fmax_smax_in_array_having_duplicates {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 9, 1, 9, 7, 8};
		int fmax = arr[0];
		int smax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (fmax<=arr[i]) {
				if (arr[i]!=fmax) {
					smax=fmax;
				}
				fmax=arr[i];
			} else if (smax<arr[i] || fmax==smax) {
				smax=arr[i];
			}
		}
		System.out.println("fmax = "+fmax+" <===> "+"smax = "+smax);

	}

}
