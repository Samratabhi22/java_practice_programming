package javaPractice;

import java.util.Scanner;

public class CharAndString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] alpa = {'A','B','C','D','E','F','G','H','I','J'};
		System.out.println("Enter a key to get Ouput");
		int key = sc.nextInt();
		String output = "";
		while(key>0) {
			int rem = (int) (key%10);
			output=alpa[rem]+output;
			key=key/10;
		}
		System.out.println("out put is "+output);
	}
}
