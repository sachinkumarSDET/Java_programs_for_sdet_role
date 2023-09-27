package Array_programs;

public class fmin_smin_in_array_having_duplicates {

	public static void main(String[] args) {
		int[] arr = {2, 7, 4, 1, 9, 1, 9, 7, 8};
		int fmin = arr[0];
		int smin = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (fmin>=arr[i]) {
				if (fmin!=arr[i]) {
					smin=fmin;
				}
				fmin=arr[i];
			} else if (smin>arr[i] || smin==fmin) {
				smin=arr[i];
			}
		}
		System.out.println("fmin = "+fmin+" <===> "+"smin = "+smin);

	}

}
