package Interview;

public class P3FindDuplicateCharUsingFor {
	public static void main(String[] args) {
		
		String str = "Sandip Gahudas Wasekar";
		
		str = removeSpaceMakeLowerCase(str);
		System.out.println(str);

		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if (count > 1 && arr[i] != '0') {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}
}

//if (arr[i] == '0') continue;
//Yahan '0' ka matlab hai marker: “ye character already count ho chuka hai, ignore karo”.
//Isliye outer loop me '0' encounter hote hi continue ho jata hai.
//3️ Difference: '0' vs 0
//Symbol	Type	Meaning in code
//'0' char Character zero, ASCII 48, marker here
//0	int	Numeric zero