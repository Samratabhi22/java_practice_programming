package tyss_practice;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class My_Array_Practice_01 {

	public static void main(String[] args) {

		any_largest_num_in_array();
		any_minimun_num_in_array();
		duplicate_Elements_In_Array();
		first_Duplicate_number_In_Array();
	}

	public static void any_largest_num_in_array() {

		int a[] = { 10, 8, 6, 4, 5, 4, 1, 3, 99, 4, 2, 7 ,9};
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = a[i];
			} else if (a[i] > secondLargest && a[i] < firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = a[i];
			} else if (a[i]>thirdLargest && a[i] < secondLargest) {
				thirdLargest = a[i];
			}
		}
		System.out.println("firstLargest >> " + firstLargest);
		System.out.println("secondLargest >> " + secondLargest);
		System.out.println("thirdLargest >> "+ thirdLargest);
	}

	public static void any_minimun_num_in_array() {

		int a[] = { 10, 8, 6, 4, 5, 4, 1, 3, 99, 4, 2, 7, -2 };
		int firstMinmun = Integer.MAX_VALUE;
		int secondMinimun = Integer.MAX_VALUE;
		int thirdMinimun = Integer.MAX_VALUE;
		int fourthMinimun = Integer.MAX_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < firstMinmun) {
				fourthMinimun = thirdMinimun;
				thirdMinimun = secondMinimun;
				secondMinimun = firstMinmun;
				firstMinmun = a[i];
			} else if (a[i] < secondMinimun && a[i] > firstMinmun) {
				fourthMinimun = thirdMinimun;
				thirdMinimun=secondMinimun;
				secondMinimun = a[i];
			} else if (a[i]<thirdMinimun && a[i] > secondMinimun) {
				fourthMinimun = thirdMinimun;
				thirdMinimun=a[i];
			}else if (a[i]<fourthMinimun && a[i]> thirdMinimun) {
				fourthMinimun = a[i];
			}
		}

		System.out.println("firstMinmun >> " + firstMinmun);
		System.out.println("secondMinimun >> " + secondMinimun);
		System.out.println("thirdMinimun >> " + thirdMinimun);
		System.out.println("fourthMinimun >> " + fourthMinimun);
	}
	
	public static void duplicate_Elements_In_Array() {
		
		int a[] = {-2, 10, 8, 6, 4, 5, 4, 1, 3, 99,2, 4, 2, 7, -2,1 };
		
		Map<Integer,Integer> map = new Hashtable<Integer, Integer>();
		
		for (int i = 0; i < a.length; i++) {
			int count =1;
			if (map.get(a[i])==null) {
				map.put(a[i], 1);
			}else {
				count++;
				map.put(a[i], count);
			}
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}
	
	public static void first_Duplicate_number_In_Array() {
		int a[] = {10, 8, 6, 4, 5, 4, 1, 3, 99,2, 4, 2, 7, -2,1 };
		int firstDupIndex=-1;
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = a.length-1; i >=0 ; i--) {
			if (hs.contains(a[i])) {
				firstDupIndex=i;
			}else {
				hs.add(a[i]);
			}
		}
		if (firstDupIndex!= -1) {
			System.out.println(a[firstDupIndex]+" is a first duplicate number");
		}else {
			System.out.println("There is no duplicate number present in the array");
		}
	}
	

}
