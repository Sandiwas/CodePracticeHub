package StringCode;

public class P9ReversEachStringinSentence {
	public static void main(String[] args) {
		String str ="Automation is fun";
		String[] arr =str.split(" ");
		String result ="";
		
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String reverseWord = "";
			
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			result = result + reverseWord +" ";
		}
		
		System.out.println(result);
	}
}
