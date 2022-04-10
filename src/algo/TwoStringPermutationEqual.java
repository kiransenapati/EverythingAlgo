package algo;

import java.util.Arrays;

public class TwoStringPermutationEqual {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bac";
		String s3 = "xyz";

		System.out.println("Strings are equal: " + isEqual(s1, s2));
		System.out.println("Strings are equal: " + isEqual(s1, s3));

	}

	public static boolean isEqual(String s1, String s2) {
		return sortString(s1).equals(sortString(s2));
	}

	// sort both the strings and do equals
	public static String sortString(String s) {

		char[] arr = s.toCharArray();
		Arrays.sort(arr);

		return new String(arr);
	}

	// arr++ ; arr-- if value < 0 then no
	public static boolean isEqualsBitsSum(String s1, String s2) {

		if (s1.length() != s2.length())
			return false;
		int[] arr = new int[128];
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			arr[ch]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			arr[ch]--;
			if (arr[ch] < 0) {
				return false;
			}
		}

		return true;
	}

}
