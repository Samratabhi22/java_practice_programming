package tyss_practice;

import java.util.HashSet;

public class String_03 {

	public static void main(String[] args) {
//		countNoOfVowelInString();
//		countNoOfVowelInStringWithoutDuplicate();
//		segregates_alpa_num_specialChar();
//		addition_of_digits_in_a_string();
//		Addition_of_2_digits_from_string();
//		find_min_length_in_string_array();
//		find_max_length_in_string_array();
		sort_string_by_length();
	}

	public static void countNoOfVowelInString() {
		String str = "Engineer";
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				count++;
				System.err.print(str.charAt(i) + " ");
			}
		}
		System.out.println(" <----No of vowels in a given string is ---> " + count);
	}

	public static void countNoOfVowelInStringWithoutDuplicate() {
		String str = "Engineer";
		str = str.toLowerCase();
		char[] strArr = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for (Character ch : strArr) {
			set.add(ch);
		}
		int count = 0;
		for (Character cht : set) {
			if (cht == 'a' || cht == 'e' || cht == 'i' || cht == 'o' || cht == 'u') {
				count++;
				System.out.print(cht);
			}
		}
		System.out.println("==" + count);
	}

	public static void segregates_alpa_num_specialChar() {
		String str = "a2B*C5?d";

		String alphabet = "";
		String numeric = "";
		String specialChar = "";

		char[] strArr = str.toCharArray();
		for (char c : strArr) {
			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				alphabet = alphabet + c;
			} else if (c >= '0' && c <= '9') {
				numeric = numeric + c;
			} else {
				specialChar = specialChar + c;
			}
		}

		System.out.println("alphabet--> " + alphabet);
		System.out.println("numeric--> " + numeric);
		System.out.println("specialChar--> " + specialChar);
	}

	public static void addition_of_digits_in_a_string() {
		String str = "b02c1D5";
		int sum = 0;
		char[] strArr = str.toCharArray();
		for (char c : strArr) {
			if (c >= '0' && c <= '9') {
				int n = (int) c - 48;// type cast to the int type && -48 is for ascci value of 0 is 48,1 is 49
				sum = sum + n;
			}
		}
		System.err.println("sum of the digits in string is == " + sum);
	}

	public static void Addition_of_2_digits_from_string() {
		String str = "a11bdf12c2";
		int tempSum = 0;
		int finalSum = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				int num = (int) str.charAt(i) - 48;
				tempSum = tempSum * 10 + num;
			} else {
				finalSum = finalSum + tempSum;
				tempSum = 0;
			}
		}
		finalSum = finalSum + tempSum;
		System.out.println(finalSum);
	}

	public static void find_min_length_in_string_array() {
		String[] str = { "abc","dv", "abcs", "ab", "abcdef" };
		String minString = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < minString.length()) {
				minString = str[i];
			}
		}
		
		for (String string : str) {
			if (string.length()==minString.length()) {
				System.out.print(string+" ");
			}
		}
		System.out.println();
		
	}

	public static void find_max_length_in_string_array() {
		String[] str = { "abc", "abcs", "ab", "abcdef" };
		String maxLength = str[0];
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > maxLength.length()) {
				maxLength = str[i];
			}
		}
		
		for (String string : str) {
			if (string.length()==maxLength.length()) {
				System.out.print(string+" ");
			}
		}
		System.out.println();
	}
	
	public static void sort_string_by_length() {
		String[] str = {"abc", "abcs", "ab", "abcdef"};
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].length()<str[j].length()) {
					String temp = str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		for (String string : str) {
			System.out.print(string+" ");
		}
	}
}
