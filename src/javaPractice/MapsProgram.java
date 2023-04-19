package javaPractice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsProgram {

	public static void main(String[] args) {
		getStudentDetails("najeer");
	}

	public static void getStudentDetails(String name) {

		List<HashMap<String, String>> details = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> vinay = new LinkedHashMap<>();
		vinay.put("id", "0");
		vinay.put("Name", "Vinay");
		vinay.put("maths", "81");
		vinay.put("School", "Shree Rukmangad");
		details.add(vinay);

		HashMap<String, String> najeer = new LinkedHashMap<>();
		najeer.put("id", "1");
		najeer.put("Name", "Najeer");
		najeer.put("maths", "70");
		najeer.put("School", "Darbar");
		details.add(najeer);

		for (HashMap<String, String> detail : details) {
			if(name.equalsIgnoreCase(detail.get("Name"))) {
			int id = Integer.parseInt(detail.get("id"));
				for (Entry<String, String> entry : details.get(id).entrySet()) {
					String key = entry.getKey();
					String val = entry.getValue();
					System.out.println(key + "\t: " + val);

				}
			}
		}
//		for (HashMap<String, String> hashMap : details) {
//			System.out.println(hashMap);
//		}
	}
	


}
