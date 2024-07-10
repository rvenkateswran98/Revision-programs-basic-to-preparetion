package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTowArray {
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 2, 13, 4);
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		Set<Integer> lst = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toSet());
		System.out.println(lst);

	}
}
