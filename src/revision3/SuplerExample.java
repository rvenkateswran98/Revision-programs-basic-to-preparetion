package revision3;

import java.util.function.Supplier;

public class SuplerExample {

	public static void main(String[] args) {
		Supplier<String> stringSupplier = () -> "Hello, World!";
		System.out.println(stringSupplier.get());

		Supplier<Double> randomSupplier = Math::random;
		System.out.println(randomSupplier.get());
	}
}
