package strings;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string you want");
		String str = scan.nextLine();
		StringBuilder input = new StringBuilder(str.toLowerCase());
		removeDuplicates(input);
		scan.close();
	}

	public static void removeDuplicates(StringBuilder input) {
		// creating new stringBuilder to store the repeated character removed string
		StringBuilder output = new StringBuilder();
		// taking the every letter from the string in a loop
		for (int i = 0; i < input.length(); i++) {
			// declaring the variable to count the repetition
			int count = 0;
			// equating the character to the other character present in the string
			for (int j = 0; j < input.length(); j++) {
				// if the first loop character is same as the second loop character increase the
				// count value
				if (input.charAt(i) == input.charAt(j)) {
					count++;
				}
			}
			// System.out.println("count of "+input.charAt(i)+" is "+count);
			// if the character is repeating only one time then append that char in output
			// String
			if (count == 1) {
				output.append(input.charAt(i));
			}
		}
		System.out.println(output.toString());

	}
}
