package basics;

import java.util.ArrayList;
import java.util.List;

public class DsList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Raju");
		names.add("Babu");
		System.out.println(names);
		names.add(1, "Ani");
		System.out.println(names);
		System.out.println(names.get(2));
	}
}
