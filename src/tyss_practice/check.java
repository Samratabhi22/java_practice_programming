package tyss_practice;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class check {
	public static void main(String[] args) {
		int [] a = {2,4,5,45,2,3,7,2,3,3,3,3,2,1,5};
		Map<Integer,Integer> s =new HashMap<Integer,Integer>();
		for (int num : a) {
			Integer count = s.get(num);
			if (count ==null) {
				s.put(num, 1);
			}else if (count!=null) {
				s.put(num, count+1);
			}
		}
		
//		Set<Map.Entry<Integer, Integer>> set = s.entrySet();
		
		for (Map.Entry<Integer, Integer> entry : s.entrySet()) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+" ");
			}
		}
	}
}
