package revision3;

import java.util.function.Predicate;

public class PredicateExample  {
	
	    public static void main(String[] args) {
	    	
	        Predicate<Integer> isEven = x -> x % 2 == 0;
	        System.out.println(isEven.test(4)); // true
	        System.out.println(isEven.test(7)); // false
	        
	        Predicate<String> isEmpty = String::isEmpty;
	        System.out.println(isEmpty.test("")); // true
	        System.out.println(isEmpty.test("Hello")); // false
	    }
	}
