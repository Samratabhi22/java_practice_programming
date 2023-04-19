package javaPractice;

import java.util.HashMap;

public class UsageOfMap {
public static void main(String[] args) {
	HashMap<String,Integer> m = new HashMap<String,Integer>();
	m.put("Varun", 100);
	m.put("Kumar", 200);
	m.put("Najeer", 300);
	m.put("Vinay", 420);
	m.put("Chetu", 500);
	System.out.println(m);
	HashMap<String,Integer> n = new HashMap<String,Integer>();
	n.put("sanju", 12);
	n.put("Sindhu", 840);
	n.put("Raksha", 130);
	n.putAll(m);
	System.out.println(n);
	System.out.println(n.containsKey("Raksha"));
	System.out.println(n.containsValue(100));
	System.out.println(n.size());
	System.out.println(n.remove("sanju"));
	System.out.println(n.remove("sanju"));
	System.out.println(n.get("Varun"));
	System.out.println(n.isEmpty());
	System.out.println(n.equals(m));
	System.out.println(n.hashCode());
	System.out.println(n.size());
	System.out.println(n.values());
	System.out.println(n.keySet());
	
}
}
