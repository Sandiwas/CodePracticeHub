package StringCode;

public class P3ReverseSentence {
	public static void main(String[] args) {
		String str = "I am sandip";
		String[] arr = str.split(" ");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		System.out.println(result);
	}
}
