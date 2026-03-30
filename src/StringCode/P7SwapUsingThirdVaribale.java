package StringCode;

public class P7SwapUsingThirdVaribale {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3;
		s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
	}
}
