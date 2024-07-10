package revision3;

import java.util.HashMap;

public class HashMaps {
	public static void main(String[] args) {

		HashMap<String, Integer> mp = new HashMap<>(10);

		mp.put("Alice", 25);
		mp.put("Bob", 30);
		mp.put("Charlie", 22);

		for (String k : mp.keySet()) {

			System.out.println(k + " " + k.hashCode() % 10);
		}
	}
}
