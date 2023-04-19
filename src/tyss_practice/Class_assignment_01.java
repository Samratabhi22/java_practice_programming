package tyss_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Class_assignment_01 {

	public static void main(String[] args) {
		count_and_Print_Alphabet();
		multiple_first_three_max_without_BS();
		rev_string_as_expected();
		occurance_of_word();
		countTheCharecters();
		count_char();
		addition_of_first_three_min_of_Array();
		combination_of_numbers();
		remove_space();
		reverse_the_word();
		addition_09_using_hashMap();
		addition_09_using_hashMap_1();
		rev_string_as_expected();
		remove_duplicate_words_from_2_strings();
		length_ofString_withoutLength_function();
		push_Key_Index_value_To_Last();
		multiply_digit_in_given_string();
		multiply_each_digit_in_a_string();
		check_for_anagram_for_2_string();
		reverse_word_and_sentense();
		prime_number_from_1_to_100();
	}

	public static void count_and_Print_Alphabet() {
		System.err.println("1--> Count_and_Print_Alphabet");
		String str = "aaabbcdddf"; // a3b2c1d3f1
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}

		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (ch == str.charAt(i)) {
					count++;
				}
			}
			System.out.print(ch + "" + count);
		}
		System.out.println();//just send cursor to next line for next method o\p
	}

	public static void multiple_first_three_max_without_BS() {
		System.err.println("2--> Multiple_first_three_max_without_BS");
		int[] a = { 7, -3, 0, 2, 1, -9 };
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = a[i];
			} else if (a[i] > secondMax && a[i] < firstMax) {
				thirdMax = secondMax;
				secondMax = a[i];
			} else if (a[i] > thirdMax && a[i] < secondMax) {
				thirdMax = a[i];
			}
		}
//		System.out.println(firstMax);
//		System.out.println(secondMax);
//		System.out.println(thirdMax);
		System.out.println("Multiplication of first three max------> " + firstMax * secondMax * thirdMax);
	}

	public static void rev_string_as_expected() {
		System.err.println("3--> Rev_string_as_expected");
		String s="i am selenium";
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				rev=s.charAt(i)+rev;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {
				rev=rev.substring(0,i)+" "+rev.substring(i);
			}
		}
		System.out.println(rev);
	}
	
	public static void occurance_of_word() {
		System.err.println("4--> occurance_of_word");
		String str = "My name is rishav it contain ri and shav";
		String [] strArr = str.split(" ");
		HashSet<String> set = new LinkedHashSet<String>();
		for (String string : strArr) {
			set.add(string);
		}
		
		for (String string : set) {
			int count = 0;
			for (int i = 0; i < strArr.length; i++) {
				if (string.equals(strArr[i])) {
					count++;
				}
			}
			if (count>0) {
				System.out.println(string+" is occuring "+count+" times");
			}
		}
	}
	
	public static void countTheCharecters() {
		System.err.println("5--> countTheCharecters");
		String s = "aaaabbbbbbcjdldm";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		System.out.println("Charecter in String ----> " + count);
	}
	
	public static void count_char() {
		System.err.println("6--> count_char_and_print_format char:count");
		String s = "Malayalam";
		s=s.toLowerCase();
		HashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character character : set) {
			
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character==s.charAt(i)) {
					count++;
				}
			}
			System.out.print(character+":"+count);
		}
		System.out.println();
	}
	
	public static void addition_of_first_three_min_of_Array() {
		System.err.println("7--> addition_of_first_three_min_of_Array");
		int a[] = { 7,-6,11,9,0,4 };
		int firstMinmun = Integer.MAX_VALUE;
		int secondMinimun = Integer.MAX_VALUE;
		int thirdMinimun = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < firstMinmun) {
				thirdMinimun = secondMinimun;
				secondMinimun = firstMinmun;
				firstMinmun = a[i];
			} else if (a[i] < secondMinimun && a[i] > firstMinmun) {
				thirdMinimun=secondMinimun;
				secondMinimun = a[i];
			} else if (a[i]<thirdMinimun && a[i] > secondMinimun) {
				thirdMinimun=a[i];
			}
		}

		System.out.println("firstMinmun >> " + firstMinmun);
		System.out.println("secondMinimun >> " + secondMinimun);
		System.out.println("thirdMinimun >> " + thirdMinimun);
		System.out.println("Addition of first three min --> "+(firstMinmun+secondMinimun+thirdMinimun));
		
	}
	
	public static void combination_of_numbers() {
		System.err.println("8--> combination_of_numbers_whose_sum_is_11");
		int a [] = {1,3,5,2,8,9,10};
		//a+b=11----> 11-a[i]=b
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==11) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}
	
	public static void remove_space() {
		System.err.println("9--> remove_space");
		String s = "my name is abc";
//		String[] str = s.split(" ");
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				s1 = s1 + s.charAt(i);
			}
		}
//		for (String string : str) {
//			System.out.print(string);
//		}
		System.out.println(s1);
	}
	
	public static void reverse_the_word() {
		System.err.println("10--> reverse_the_words_in_sentense");
		String str = "I love programming";
		String[] strArr = str.split(" ");
		for (String string : strArr) {
			for (int i = string.length()-1; i >=0; i--) {
				System.out.print(string.charAt(i));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static void addition_09_using_hashMap() {
		System.err.println("11--> addition_09_using_hashMap");
		int [] a = {7,2,12,15}; //o\p=9
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==9) {
					map.put(i, a[i]);
					map.put(j, a[j]);
				}
			}
		}
		int result = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer val = entry.getValue();
			result=result+val;
		}
		System.err.println("result >> "+result);
		System.out.println("result >> "+(map.get(0)+map.get(1)));
		
//		for (int i : a) {
//			for (int j : a) {
//				if (i+j==9) {
//					System.err.println(i +" "+ j);
//				}
//			}
//		}
	}
	
	public static void addition_09_using_hashMap_1() {
		System.err.println("12--> addition_09_using_hashMap_1");
		int [] a = {7,2,12,15}; //o\p=9
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
					map.put(i, a[i]);
			
		}
		int indexI=0;
		int indexJ=0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==9) {
					indexI=i;
					indexJ=j;
				}
			}
		}

		System.out.println("result >> "+(map.get(indexI)+map.get(indexJ)));
	}
	
	public static void remove_duplicate_words_from_2_strings() {
		System.err.println("13--> remove_duplicate_words_from_2_strings");
		String str1 = "This is fun show";
		String[] str1Arr = str1.split(" ");
		String str2="fun tv show";
		String[] str2Arr = str2.split(" ");
		
		HashSet<String> set1 = new LinkedHashSet<String>();
		for (int i = 0; i < str1Arr.length; i++) {
			set1.add(str1Arr[i]);
		}
		for (int i = 0; i < str2Arr.length; i++) {
			if (set1.contains(str2Arr[i])) {
				set1.remove(str2Arr[i]);
			}else {
				set1.add(str2Arr[i]);
			}
		}
		
		for (String string : set1) {
			System.out.print(string+" ");
		}
		System.out.println();
	}
	
	public static void length_ofString_withoutLength_function() {
		System.err.println("14--> length_ofString_withoutLength_function");
		String s = "vinay";
		char[] strArr=s.toCharArray();
		int lengthOfString=0;
		for (char c : strArr) {
			lengthOfString++;
		}
		System.out.println("lengthOfString >>" + lengthOfString);
		
	}
	
	public static void push_Key_Index_value_To_Last() {
		System.err.println("15--> push_Key_Index_value_To_Last");
		int[] a = {5,1,2,3,4};
		int key = 2;
		for (int i = 0; i < key; i++) {
			int first = a[0];
			for (int j = 0; j < a.length-1; j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		
		System.out.print("Expected The Array ---> [ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
	}
	
	public static void multiply_digit_in_given_string() {
		System.err.println("16--> multiply_digit_in_given_string");
		String str = "I a12m goi324ng t12o f124ind t120he pr5oduct of n236umbers ins242ide th25is str2ing2";
		int tempSum = 0;
		long multiplyResult = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				int num = (int) str.charAt(i) - 48;
				tempSum = tempSum * 10 + num;
			} else {
				//System.out.println(tempSum);
				if (tempSum>0) {
					list.add(tempSum);
				}
				tempSum = 0;
			}
		}
		if (tempSum>0) {
			list.add(tempSum);
		}
		for (Integer integer : list) {
			//System.out.println(integer);
			multiplyResult=integer*multiplyResult;
		}
		System.out.println("Multiplication of numbers included in String---> "+multiplyResult);
	}
	
	public static void multiply_each_digit_in_a_string() {
		System.err.println("17--> multiply_each_digit_in_a_string");
        //Scanner scanner = new Scanner(System.in);
        String str="v1i2n3ay4 p5ri1ya23n5k7a";
        int len, x, mul=1;
        //System.out.println("Enter a string : ");
        //str = scanner.nextLine();
        len = str.length();
        for(int i=0;i<len;i++){
            x = str.charAt(i) - '0';
            if(x>=0 && x<=9){
                mul *= x;
            }/*else{
                continue;
            }*/
        }
        System.out.println("Multiplication : " + mul);
        //scanner.close();
	}
	
	public static void check_for_anagram_for_2_string() {
		System.err.println("18--> check_for_anagram_for_2_string");
		String str1="Listen";
		str1=str1.toLowerCase();
		String str2="silent";
		str2=str2.toLowerCase();
		
		// without using sort method
//		if (str1.length()==str2.length()) {
//			int sum1=0;
//			int sum2=0;
//			for (int i = 0; i < str1.length(); i++) {
//				int asc1 = str1.charAt(i);
//				int asc2 = str2.charAt(i);
//				sum1=sum1+asc1;
//				sum2=sum2+asc2;
//			}
//			if (sum1==sum2) {
//				System.out.println("Given '"+str1+"' and '"+str2+"' are anagram words");
//			}else {
//				System.out.println("Strings are not anagram");
//			}
//		}else {
//			System.out.println("Strings are not anagram");
//		}
		
		if (str1.length()==str2.length()) {
			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();
			Arrays.sort(str1Arr);
			Arrays.sort(str2Arr);
			String s1 = new String(str1Arr);
			String s2 = new String(str2Arr);
			if (s1.equals(s2)) {
				System.out.println("Given '"+str1+"' and '"+str2+"' are anagram words");
			}else {
				System.out.println("Strings are not anagram");
			}
			
		}else {
			System.out.println("Strings are not anagram");
		}
		
	}
	
	public static void reverse_word_and_sentense() {
		System.err.println("19--> reverse_word_and_sentense");
		String s ="my name is ok";
		String s1="";
		String [] strArr = s.split(" ");
		for (int i = strArr.length-1; i >=0; i--) {
			for (int j = strArr[i].length()-1; j >=0 ; j--) {
				s1=s1+strArr[i].charAt(j);
			}
			s1+=" ";
		}
		System.out.println(s1);
	}
	
	public static void prime_number_from_1_to_100() {
		System.err.println("20--> prime_number_from_1_to_100");
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter a Limit to Print Prime number");
		//int n = s.nextInt();
		int n=100;
		int a=1;
		boolean flag = false;
		System.out.print("Prime Number from 1 to 100 --->[ ");
		while (a<n) {
			for (int i = 2; i <= a/2; i++) {
				if (a%i==0) {
					flag=true;
					break;
				}
			}
			if (!flag) {
				System.out.print(a+" ");
			}
			a++;
			flag=false;
		}
		System.out.println("]");
		//s.close();
	}
}
