package basics;

import java.util.HashMap;
import java.util.Map;

public class DsMap {
	
	public static void main(String[] args) {
		Map<String, String> names = new HashMap<String, String>();
		names.put("R", "Raju");
		names.put("B", "Babu");
		System.out.println(names);
		System.out.println(names.get("B"));
		names.remove("B");
		System.out.println(names);
		names.put("A", "Aman");
		names.put("B", "Babu");
		names.put("C", "Chand");
		System.out.println(names);
		int counter = 0;
		for (int i = 0; i < names.size(); i++) {
			counter++;
		}
		System.out.println("size = " + counter);
	}
	
}
