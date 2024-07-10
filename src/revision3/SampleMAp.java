package revision3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SampleMAp {
	public static void main(String[] args) {

		Map<Integer, String> lst = new ConcurrentHashMap<>();

		lst.put(01, "Nisha");
		lst.put(03, "Hari");
		lst.put(02, "Arun");
		lst.put(05, "Mani");
		lst.put(8,"Mano");

		for (Integer x: lst.keySet()) {
			lst.put(8,"Mano");
			
			System.out.println(x);

		}
		System.out.println(lst);

	}

}
