package revision3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SampleList {

	public static void main(String[] args) {

		List<String> a = new CopyOnWriteArrayList<>();
		a.add("Nish");
		a.add("Hari");
		a.add("Kumar");
		a.add(null);
		for (String s : a) {
			a.add("Mano");
		}

		System.out.println(a);

	}

}
