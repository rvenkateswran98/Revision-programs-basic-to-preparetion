package revision3;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
		printUpperCase.accept("hello"); // prints "HELLO"

		Consumer<Integer> multiplyByTwo = x -> System.out.println(x * 2);
		multiplyByTwo.accept(5); // prints "10"
	}
}
