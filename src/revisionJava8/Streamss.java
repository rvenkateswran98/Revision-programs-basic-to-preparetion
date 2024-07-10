package revisionJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamss {

	public static void main(String[] args) {
		String a = "823631";
		// find Avg from String
		Double avg = a.chars().map(Character::getNumericValue).average().getAsDouble();
		// System.out.println(avg);
		// Array find Dup
		int bb[] = { 12, 2, 1, 3, 2, 32, 1, 32 };
		int cc[]= {34,54,1,34,67,99,0};
		List<Integer> Lsts = Arrays.stream(bb).boxed().distinct().collect(Collectors.toList());
		

		List<Integer> Lst = Arrays.stream(bb).boxed().distinct().collect(Collectors.toList());// toCollection(ArrayList::new));

		List<Integer> lst1 = Lst.stream().filter(i -> Collections.frequency(Lst, i) > 0).toList();
		System.out.println("fre" + lst1);
		// Skip
		List<Integer> one = Lst.stream().sorted(Comparator.reverseOrder()).skip(1).limit(2).toList();

		// Cout the String Character
		String ss = "Discussing";
		Long cout = ss.chars().map(Character::getNumericValue).count();
		//System.out.println(cout);

		List<String> st = Arrays.asList("Hello", "WellCome", "Solo", "Google", "dora", "food", "good");
		List<String> st1 = st.stream().filter(e -> e.contains("l")).collect(Collectors.toList());
		//System.out.println(st1);

	}

}
