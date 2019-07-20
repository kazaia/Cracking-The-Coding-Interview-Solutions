import java.util.Arrays;

public class ctci_ch01_01 {

	public static boolean isUnique(String str) {

		char[] array = str.toCharArray();
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String[] words = { "string", "aa", "zaia", "abcdefgh" };
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}
	}
}
