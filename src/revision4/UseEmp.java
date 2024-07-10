package revision4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmp {
	public static void main(String[] args) {

		Emp e1 = new Emp("Hari", 101, 22000, "Male");
		Emp e2 = new Emp("Priya", 102, 12000, "female");
		Emp e3 = new Emp("Arun", 103, 32000, "Male");
		Emp e4 = new Emp("Roja", 104, 42000, "female");

		List<Emp> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);

		Map<Integer, Emp> maps = emps.stream().collect(Collectors.toMap(x -> x.getId(), x -> x));
		System.out.println(maps);

	}
}
