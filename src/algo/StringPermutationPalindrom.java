package algo;

public class StringPermutationPalindrom {

	public static void main(String[] args) {
		// String test = "abc cba";
		String test2 = "t";

		// isPermutationPalindrom(test);
		isPermutationPalindrom(test2);
	}

	public static void isPermutationPalindrom(String str) {
		/*
		 * Approach 1: Count the char of each type and check if its odd length then odd
		 * count for only 1 character If its even length then all chars are of even
		 * count. Ignore non alphabets (a-z) and (A-Z) - store it in a hash map
		 */

		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');

//		int A = Character.getNumericValue('A');
//		int Z = Character.getNumericValue('Z');

		int[] table = new int[26];

		for (int i = 0; i < str.length(); i++) {
			int ch = Character.getNumericValue(str.charAt(i));
			if (a <= ch && ch <= z) {
				table[z - ch]++;
			}
//			else if (A <= ch && ch <= Z) {
//				table[ch]++;
//			}
		}
		boolean isPalindrom = true;
		if (table.length % 2 == 0) {
			for (int i = 0; i < table.length & table[i] != 0; i++) {
				if (table[i] % 2 != 0) {
					isPalindrom = false;
					break;
				}
			}
		} else {
			int count = 0;
			for (int i = 0; i < table.length & table[i] != 0; i++) {
				if (table[i] % 2 != 0) {
					count++;
					if (count > 1 || table.length == 1) {
						isPalindrom = false;
						break;
					}
				}
			}
		}

		if (isPalindrom) {
			System.out.println("The text is a palindrom!");
		} else {
			System.out.println("The text is a not a palindrom!");
		}

	}

}
