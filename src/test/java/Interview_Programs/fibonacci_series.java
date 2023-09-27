package Interview_Programs;

public class fibonacci_series {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 2;
		System.out.println(n1);
		System.out.println(n2);
		int n = 10;
		for (int i = 0; i < n; i++) {
			int temp = n1+n2;
			System.out.println(temp);
			n1 = n2;
			n2 = temp;
		}

	}

}
