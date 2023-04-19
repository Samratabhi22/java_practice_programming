package practiceProgramming;

import java.util.Scanner;

public class OcuranceOfCharWithoutLoop {

	static int count;
	static int numberOfOcc;

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter A Word");
		String str = s.next().toLowerCase();
		System.out.println("Enter a charecter to chrct the occurance in given word");
		char ch = s.next().toLowerCase().charAt(0);
		char[] chArr = str.toLowerCase().toCharArray();
		count = chArr.length - 1;
		occurance(chArr, ch);
		System.out.println(numberOfOcc + " is the number of occurance of " + ch + " in " + str);
		s.close();

	}

	public static void occurance(char[] chArr, char ch) {
		if (count < 0) {
			return;
		}
		if (chArr[count] == ch) {
			numberOfOcc++;
		}
		count--;
		occurance(chArr, ch);
	}
}
