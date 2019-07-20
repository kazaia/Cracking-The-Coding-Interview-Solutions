import java.util.Arrays;

public class CheckPermutation01 {

	public static boolean isPermutation(String a, String b) {

		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		String a = "abc";
		String b = "bac";

		String str1 = "string";
		String str2 = "unique";

		System.out.println(isPermutation(a, b));
		System.out.println(isPermutation(str1, str2));
	}
}
