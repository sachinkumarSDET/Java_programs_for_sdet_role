package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class addition_using_maps {

	public static void main(String[] args) {
		int[] arr = {-5, 6, 7, 8, 9, 20, 11, 4};
		int sum = 15;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int value = sum-arr[i];
			if (map.containsKey(value)) {
				System.out.println(arr[i]+" "+value);
			}
			map.put(arr[i], i);
		}
	
	}

}
