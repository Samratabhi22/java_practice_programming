package tyss_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;


public class VecctorAndStack {

	public static void main(String[] args) {
		
		Vector<Object> vec = new Vector<Object>();
		vec.add(10);
		vec.add(25);
		vec.add("vin");
		vec.add('p');
		vec.add(12.05);
		System.out.println(vec.firstElement());
		System.out.println(vec);
		vec.remove("vin");
		System.out.println(vec);
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(10);
		
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(10);
		pq.add(2);
		pq.add(15);
		pq.add(1);
		pq.add(5);
		pq.add(10);
		pq.add(9);
		
		
		
		HashSet<Object> hs = new HashSet<Object>();
		hs.add("vin");
		hs.add('v');
		hs.add(123);
		hs.add(123);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		ArrayList<Object> AL = new ArrayList<Object>(hs);
		AL.add(null);
		hs.addAll(AL);
		System.out.println(hs);
		Set<Object> set = new LinkedHashSet<Object>();
		set.add("Vinay");
		set.add("Hari");
		set.add("Ashwini");
		set.add("Vinay");
		LinkedHashSet<Object> lhs = (LinkedHashSet<Object>)set;
		lhs.add(null);
		lhs.add('v');
		lhs.add(null);
		lhs.add(null);
		
		
		System.err.println(lhs);
		AL.addAll(set);
		System.out.println(AL);
		
		System.out.println(pq);
		
		TreeSet<Object> ts = new TreeSet<Object>();
		ts.add("Vinay");
		ts.add("Kumar");
		ts.add("Sindhu");
		ts.add("Vinay");
		ts.add("Ashwini");
		ts.add("Hari");
		System.out.println("ts---> "+ts);
		
//		Stack<Integer> 
		
	}
}
