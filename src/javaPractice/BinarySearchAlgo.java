package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchAlgo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.err.println(s.toString());
//		dc d = new dc();
//		System.err.println(d);
		System.out.println("Enter a size of an array");
		int size = s.nextInt();
		int[] a = new int[size];
		System.out.println("Enter a value for array of int type");
		for (int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter a key value to search in array");
		int key = s.nextInt();
		if (binarySearch(a, key)) {
			System.err.println("the key is found");
		}else {
			System.err.println("the key not found");
		}
		s.close();
	}
	public static Boolean binarySearch(int b [],int key) {
		int low = 0;
		int high = b.length-1;
		
		while(low<=high) {
			int mid = (high+low)/2;
			
			if (b[mid]==key) {
				return true;
			}
			else if (b[mid]<key) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return false;	
	}

}
class dc{
	int a= 10;
	public String toString() {
		return ""+a;
		
	}
}
