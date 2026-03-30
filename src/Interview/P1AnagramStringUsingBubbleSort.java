package Interview;


public class P1AnagramStringUsingBubbleSort {
	public static void main(String[] args) {
		String str1 = "Ar   mY";
		String str2 = "Mar  Y";

		char[] arr1 = makeLowerCaseRemoveSpace(str1).toCharArray();
		char[] arr2 = makeLowerCaseRemoveSpace(str2).toCharArray();

		sortArray(arr1);
		sortArray(arr2);

		if (isEquals(arr1, arr2)) {
			System.out.print("String is Anagram");
		} else {
			System.out.print("String is not Anagram");
		}

	}

	public static String makeLowerCaseRemoveSpace(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}

	public static void sortArray(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static boolean isEquals(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
