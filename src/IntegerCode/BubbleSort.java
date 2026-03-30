package IntegerCode;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2 };

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

		for (int ele : arr) {
			System.out.print(ele + ",");
		}
	}
}



//[2, 3, 4, 5]
//2,3,4,5,