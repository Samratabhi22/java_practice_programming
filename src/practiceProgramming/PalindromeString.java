package practiceProgramming;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "katak";
		String str1= "";
		for (int i = 0; i < str.length(); i++) {
			str1=str.charAt(i)+str1;
		}
		if (str.equals(str1)) {
			System.out.println("Given String is a palindrome");
		}else {
			System.err.println("Given string is not a palindrome");
		}
	}
}
