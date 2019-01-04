import java.util.Arrays;

public class ctci_ch01_01 {

	final static int MAX = 256;

	public static boolean isUnique(String str) {
		int index = 0;
		boolean[] arrayOfBoolean = new boolean[MAX];

		Arrays.fill(arrayOfBoolean, false);

		for (int i = 0; i < str.length(); i++) {
			index = str.charAt(i);

			if (arrayOfBoolean[index] == true) {
				return false;
			} else {
				arrayOfBoolean[index] = true;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String[] words = { "string", "aba", "zaia", "abcdefg", "unique" };
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}

	}
}
