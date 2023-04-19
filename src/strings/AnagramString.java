package strings;

import java.util.Arrays;

public class AnagramString {
	
	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");
	}
	
	public static void isAnagram(String str1, String str2) {
		// to remove the white spaces present in the string
		String s1 = str1.replaceAll("\\s", "");//"\\s" means single whitespace character
		String s2 = str2.replaceAll("\\s", "");//"\\s" means single whitespace character
		
		//check the length of the string after removing all the void spaces in it
		//if it is equal then only proceed for next step
		boolean status = true;
		if (s1.length() != s2.length()) {
			//if the lengths are different
			status = false;
		} else {
			//if lengths are equal
			char[] ArrayS1 = s1.toLowerCase().toCharArray();
			char[] ArrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			//if both the arrays matches change the status to true
			status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}


}