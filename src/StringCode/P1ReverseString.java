package StringCode;

public class P1ReverseString {
	public static void main(String[] args) {
		String str = "java";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println(result);
	}
}
