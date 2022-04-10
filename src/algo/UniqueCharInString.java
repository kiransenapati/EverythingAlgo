package algo;

public class UniqueCharInString {

	public static void main(String[] args) {
		String str = "kiran";
		String str2 = "liana";
		System.out.println(isUnique(str));
		System.out.println(isUnique(str2));

		System.out.println(isUniqueBit(str));
		System.out.println(isUniqueBit(str2));

	}

	public static boolean isUnique(String s) {
		boolean[] arr = new boolean[128];
		// A string if greater than 128 chars it should definitely have duplicates
		if (s.length() > 128)
			return false;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (arr[val]) {
				return false;
			}
			arr[val] = true;
		}
		return true;
	}

	// this is considering there are only letters i.e. a-z
	public static boolean isUniqueBit(String s) {

		int checker = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

}
