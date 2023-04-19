package tyss_practice;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class PracticeMap {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Vinay", 88);
		ht.put("Harikrishna", 90);
		ht.put("Ashwini", 92);
		ht.put("sindhu", 89);
		System.out.println(ht);
		ht.putIfAbsent("Vinay", 20);
		System.out.println(ht);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Ashwini", "Chetan");
		hm.put("Sindhu", "Diwakar");
		hm.put("AllGirls", "Harikrishna");
		hm.put(null, "Vinay");
		hm.put("Kumar", null);
		hm.put("Najeer", null);
		System.out.println(hm);
		hm.put(null, null);
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("Ashwini", "Chetan");
		lhm.put("Sindhu", "Diwakar");
		lhm.put("AllGirls", "Harikrishna");
		lhm.put(null, "Vinay");
		lhm.put("Kumar", null);
		lhm.put("Najeer", null);
		System.err.println(lhm);
		
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("Ashwini", "Chetan");
		tm.put("Sindhu", "Diwakar");
		tm.put("AllGirls", "Harikrishna");
		tm.put("p", "Vinay");
		tm.put("Kumar", null);
		tm.put("Najeer", null);
		System.out.println(tm);
		
		System.out.println(System.currentTimeMillis());
		GregorianCalendar gc = new GregorianCalendar();
				boolean val = gc.isLeapYear(2022);
				System.out.println(val);
	}
}
