package StringCode;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "java";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		if (str.equals(result)) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}
	}
}
