package Interview;

import java.util.Arrays;

public class P2SortBinaryArray {
	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		int countzero = 0;

		// Zero count
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countzero++;
			}
		}
		// zero set first
		for (int i = 0; i < countzero; i++) {
			arr[i] = 0;
		}

		// set 1
		for (int i = countzero; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));

		for (int ele : arr) {
			System.out.print(ele + ", ");
		}
	}
}
