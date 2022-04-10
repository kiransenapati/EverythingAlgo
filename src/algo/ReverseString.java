package algo;

public class ReverseString {

	public static void main(String[] args) {
		String test = "test";
		String output = "";
		for (int i=test.length()-1; i>=0; i--) {
			output = output + test.charAt(i);
		}
		System.out.println("Output : " + output);
		

	}

}
