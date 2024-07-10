package revisionJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<>();
		lst.add(23);
		lst.add(232);
		lst.add(123);
		lst.add(623);
		lst.add(723);
		lst.add(4320);
		List<Integer> ls1 = Arrays.asList(12, 32, 4, 55, 67);
		List<Integer> ls2 = Arrays.asList(12, 32, 4, 55, 67);
		List<Integer> ls3 = Arrays.asList(12, 32, 4, 55, 67);

		List<List<Integer>> a = Arrays.asList(ls1, ls2, ls3);

		// flatMap
		List<Integer> b = a.stream().flatMap(s -> s.stream()).filter(z -> z % 2 == 0).toList();
		System.out.println(b);
		boolean hasEvenNumber = lst.stream().allMatch(num -> num % 2 == 0);
		System.out.println(hasEvenNumber);

		String w1 = Stream.of("string").map(s -> new StringBuilder(s).reverse()).collect(Collectors.joining(" "));

		

	}

}
