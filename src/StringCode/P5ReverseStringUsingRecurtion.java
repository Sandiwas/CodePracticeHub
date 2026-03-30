package StringCode;

public class P5ReverseStringUsingRecurtion {
	public static void main(String[] args) {
		String str = "java";
		System.out.println("given string is " + str + " output string is " + reverseString(str));
	}

	public static String reverseString(String str) {
		if (str.length() == 0) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
