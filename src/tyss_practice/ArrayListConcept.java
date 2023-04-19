package tyss_practice;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListConcept {
	
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(12);
		list.add(12.05);
		list.add(12.05f);
		list.add(120000000000000l);
		list.add('v');
		list.add("vinay");
		list.add("MJ");
		list.add(true);
		list.add(null);
		System.out.println(list);
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(90);
		intList.add(88);
		intList.add(81);
		intList.add(92);
		intList.add(89);
		intList.add(100);
		intList.add(1);
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
		list.addAll(intList);
		System.out.println(list);
		System.out.println(list.lastIndexOf(1));
		System.out.println(list.contains("vinay"));
		System.out.println(list.remove("MJ"));
		System.out.println(list);
		
	}
}
