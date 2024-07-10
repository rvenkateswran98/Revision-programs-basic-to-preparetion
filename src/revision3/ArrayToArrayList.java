package revision3;

import java.util.*;

public class ArrayToArrayList {
	public static void main(String[] args) {

		int[] a = { 3, 5, 6, 7, 9 };
		// int[] to ArrayList
		List<Integer> nList = Arrays.stream(a).boxed().toList();
		
		Integer[] num = new Integer[nList.size()];
		num = nList.toArray(num);

		List<Integer> lst1 = new ArrayList<>(); // Array List
		for (Integer i : a) {
			lst1.add(i);
		}
		System.out.println(lst1);
		// ArrayList to int [] --> withOut Inbuilt method
		int[] intarray = new int[lst1.size()];
		for (int i = 0; i < lst1.size(); i++) {
			intarray[i] = lst1.get(i);
		}
		// with InBuilt

		Integer[] intArray = lst1.toArray(new Integer[0]);

		for (Integer i : intArray) {
			System.out.println(i);
		}
		int[] intArray1 = lst1.stream().mapToInt(i -> i).toArray();
		System.out.println(Arrays.toString(intArray1));

	}

}
