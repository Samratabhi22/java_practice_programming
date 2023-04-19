package tyss_practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Array_Class_work_01 {

	//remove duplicates
	//count duplicates
	//print position without duplicates
	//print last occurrence
	//print count of unique words
	
	//----{4,5,4,1,5,3,2}----//
	
	public static void main(String[] args) {
		remove_duplicates();
		count_duplicates();
		print_position_without_duplicate();
		last_occurance_of_dup_numbers();
		Print_count_of_unique_num();
	}
	
	public static void remove_duplicates() {
		System.err.println("remove_duplicates");
		int [] a = {4,5,4,1,5,3,2};
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		int [] b = new int[set.size()];
		int count = 0;
		for (int ele : set) {
			b[count]=ele;
			count++;
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	public static void count_duplicates() {
		System.err.println("count_duplicates");
		int [] a = {4,5,4,1,5,3,2};
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer integer : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i]==integer) {
					count++;
				}
			}
			System.out.println("the integer element "+integer+" is repeated "+count+" times");
		}
	}
	
	public static void print_position_without_duplicate() {
		System.err.println("print_position_without_duplicate");
		int [] a = {4,5,4,1,5,3,2};
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer integer : set) {
			for (int i = 0; i < a.length; i++) {
				if (a[i]==integer) {
					System.out.println("index of "+integer+" is "+(i+1));
					break;
				}
			}
		}
	}
	
	public static void last_occurance_of_dup_numbers() {
		System.err.println("last_occurance_of_dup_numbers");
		int [] a = {4,5,4,1,5,3,2};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		
		for (Integer integer : set) {
			for (int i = a.length-1; i >=0; i--) {
				if (a[i]==integer) {
					System.out.println("last occurance of "+integer+" is "+(i+1));
					break;
				}
			}
		}
	}
	
	public static void Print_count_of_unique_num() {
		System.err.println("Print_count_of_unique_num");
		int [] a = {4,5,4,1,5,3,2};
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if (a[i]==integer) {
					count++;
				}
			}
			System.out.println("Occurance of "+integer+" is "+count+" time");
		}
	}
}
