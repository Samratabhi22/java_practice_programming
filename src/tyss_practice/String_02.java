package tyss_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class String_02 {

	public static void main(String[] args) {
//		palindrome_check();
//		rev_Given_sentense();
//		removeSpace();
//		devide_words_by_pipeline();
//		rev_words_in_a_string();
//		swipe_the_first_and_last_words_in_string();
//		swap_the_value_of_2_var_without_temp_var();
//		count_of_UpperCase_lowerCase_in_string();
//		remove_duplicate_char_in_string();
//		occuranceOfEachChar();
//		occuranceOfChar_2nd_way();
//		countNoDuplicatesInAString();
//		position_of_each_char_in_string_without_duplicates();
//		lastOccuranceOfCharInString();
		removeDuplicateWordsInString();
	}

	public static void palindrome_check() {
		String str = "Gadag";
		str = str.toLowerCase();
		String revStr = "";
		for (int i = 0; i < str.length(); i++) {
			revStr = str.charAt(i) + revStr;
		}
		if (str.equals(revStr)) {
			System.out.println("Gven String is Palindrome --->" + str);
		} else {
			System.out.println("Gven String is not Palindrome --->" + str);
		}

	}

	public static void rev_Given_sentense() {

		String str = "I am a software engineer";
		System.err.println("Reverse the sentense --->" + str);
		String[] words = str.split(" ");
		String revStr = "";
		for (int i = 0; i < words.length; i++) {
			revStr = words[i] + " " + revStr;
		}
		System.out.println(revStr);
	}

	public static void removeSpace() {
		String str = "I|am|a|software|engineer";
		System.err.println("removeSpace--> " + str);
		String[] strArr = str.split("|");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i]);
		}
		System.out.println();
	}

	public static void devide_words_by_pipeline() {
		String str = "I|am|a|software|engineer";
		System.err.println("removeSpace--> " + str);
		str = str.replace('|', ' ');
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

	public static void rev_words_in_a_string() {
		String str = "I am a software engineer";
		System.err.println("reverse words in string---> " + str);
		String[] strArr = str.split(" ");
		String revStr = "";
		for (String string : strArr) {
			String str1 = "";
			for (int i = 0; i < string.length(); i++) {
				str1 = string.charAt(i) + str1;
			}
			revStr = revStr + str1 + " ";
		}
		System.out.println(revStr);
	}

	public static void swipe_the_first_and_last_words_in_string() {
		String str = "I am a software engineer";
		str = str.trim();
		System.err.println("swipe_the_first_and_last_words_in_string--> " + str);
		String[] strArr = str.split(" ");
		String temp = strArr[0];
		strArr[0] = strArr[strArr.length - 1];
		strArr[strArr.length - 1] = temp;
		for (String string : strArr) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	public static void swap_the_value_of_2_var_without_temp_var() {

		int a = 10;
		int b = 20;

		System.out.println("Befor swaping value of a--> " + a + " b--> " + b);

		b = b + a;// 30
		a = b - a;// 20
		b = b - a;// 10

		System.out.println("After swaping value of a--> " + a + " b--> " + b);
	}

	public static void count_of_UpperCase_lowerCase_in_string() {
		String str = "SoFtwRE";
		int upperCount = 0;
		int lowerCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upperCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lowerCount++;
			}
		}
		System.out.println("UpperCase Letter count --> " + upperCount + " LowerCase letter count --> " + lowerCount);
	}

	public static void remove_duplicate_char_in_string() {

		String str = "Kannada";
		System.err.println("remove_duplicate_char_in_string --> " + str);
		String str1 = "";
		HashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (set.add(str.charAt(i))) {
				str1 = str1 + str.charAt(i);
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		System.out.println(str1);
	}

	public static void occuranceOfEachChar() {
		String str = "kannada";
		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				count = map.get(str.charAt(i));
				count++;
				map.put(str.charAt(i), count);
			}
		}
		System.out.println(map);
	}

	public static void occuranceOfChar_2nd_way() {
		String str = "Kannada";
		char[] strArr = str.toCharArray();// of use charAt(int Index) direcctly
		HashSet<Character> set = new LinkedHashSet<Character>();
		for (char chr : strArr) {
			set.add(chr);
		}
		System.out.println("character in set --> " + set);

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < strArr.length; i++) {
				if (strArr[i] == ch) {
					count++;
				}
			}
			System.out.println("occurance Of --> " + ch + " times --> " + count);
		}
	}

	public static void countNoDuplicatesInAString() {
		String str = "Kannada"; // a--> 3 n--> 2
		HashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println("character in set --> " + set);

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("occurance Of --> " + ch + " times --> " + count);
			}
		}
	}

	public static void position_of_each_char_in_string_without_duplicates() {
		String str = "kannada";

		HashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (Character character : set) {
			for (int i = 0; i < str.length(); i++) {
				if (character == str.charAt(i)) {
					System.out.println(character + " position is " + (i + 1));
					break;
				}
			}
		}
	}

	public static void lastOccuranceOfCharInString() {
		String str = "Kannada";// k=1, a=7, n=4, d=6

		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (Character character : set) {
			for (int i = str.length() - 1; i >= 0; i--) {
				if (character == str.charAt(i)) {
					System.out.println("last occurance of char" + character + " is " + (i + 1));
					break;
				}
			}
		}
	}

	public static void removeDuplicateWordsInString() {
		String str1 = "I am I am a software engineer";
		String str2 = "";
		String[] str1Arr = str1.split(" ");
		HashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str1Arr.length; i++) {
			set.add(str1Arr[i]);
		}
		for (String string : set) {
			str2=str2+string+" ";
		}
		System.out.println(str2);
	}

}
