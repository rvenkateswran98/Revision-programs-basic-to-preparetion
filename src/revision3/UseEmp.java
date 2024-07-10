package revision3;

import java.util.HashMap;

public class UseEmp {

	public static void main(String[] args) {

		Emp e1 = new Emp(1001, "Hari", 12000, "Male");
		Emp e2 = new Emp(1010, "Priya", 15000, "female");
		Emp e3 = new Emp(1001, "Raja", 20000, "Male");
		Emp e4 = new Emp(1001, "Raj", 20000, "Male");


		HashMap<Integer, Emp> emps = new HashMap<>(10);
		emps.put(e1.getId(), e1);
		emps.put(e2.getId(), e2);
		emps.put(e3.getId(), e3);

//		//for (Integer k : emps.keySet()) {
//			System.out.println("Key : "+k);
//			System.out.println("value : "+emps.get(k));
//		}
		
		System.out.println(e4.equals(e3));

	}

}
