package Interview_Programs;

public class reverse_string_without_inbuilt_function {

	public static void main(String[] args) {
		String s = "sachinkumarbiradar";
		reverse(s, s.length()-1);

	}
	public static void reverse(String s, int limit) {
		if (limit>-1) {
			System.out.print(s.charAt(limit));
			reverse(s, limit-1);
		}
	}

}
