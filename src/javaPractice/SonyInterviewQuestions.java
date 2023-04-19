package javaPractice;

import java.util.Arrays;
import java.util.HashSet;

public class SonyInterviewQuestions {

	public static void main(String[] args) {
//		FirstDuplicateLetter();
//		LargestAlpaChar();
//		PrintMissedNumber();
		SubStringLen2();
	}
	
	public static void FirstDuplicateLetter() {
		HashSet<Character> set = new HashSet<>();
		String word = "Selenium";
		String s = word.toLowerCase();
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			// set will not accept the duplicate so
			// while adding the char to set if it doesn't added it will return false
			// then it will go inside the block and make the flag true
			if (!set.add(s.charAt(i))) {
				flag = true;
				System.out.println("First duplicate letter in the word " + s + " is " + s.charAt(i));
				break;
			}
		}
		if (flag == false) {
			System.out.println("No duplicate letter found");
		}
	}

	public static void LargestAlpaChar() {
		boolean[] uppercase = new boolean[26];
		boolean[] lowercase = new boolean[26];
		int count = 0;

		String str = "dabDhgjB";
		char[] arr = str.toCharArray();
		char largestValue = 0;
		for (char c : arr) {

			if (Character.isLowerCase(c))
				lowercase[c - 'a'] = true;

			if (Character.isUpperCase(c))
				uppercase[c - 'A'] = true;
		}

		System.out.print("alphabet which are present in both uppercase and lowercase --> ");
		for (int i = 25; i >= 0; i--) {
			if (uppercase[i] && lowercase[i]) {
				count++;
				if (count == 1) {
					largestValue = (char) (i + 'A');
				}
				System.out.print((char) (i + 'A') + " ");

			}
		}
		System.out.println("\n");
		System.out.println("largest letter is " + largestValue);

	}
	
	public static void PrintMissedNumber() {
		int[] arr = { 1, 6, 8 };
		int[] missedNum = new int[10 - arr.length];
		int count = 0;
		boolean flag = false;

		for (int i = 1; i <= 10; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				missedNum[count] = i;
				count++;
			}
		}
		
		System.out.println(Arrays.toString(missedNum));
	}
	
	public static void SubStringLen2() {
		String s = "aabbbaccds";
		HashSet<String> uniq = new HashSet<>();
		
		for(int i = 0;i < s.length() - 1  ; i++) {
			System.out.print(s.substring(i, (i + 2)) + " "); 
			uniq.add(s.substring(i, (i + 2)));
		}
		System.out.println("\n");
		System.out.println(uniq);
	}

}
