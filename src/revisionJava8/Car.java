package revisionJava8;

public class Car {

	String brand;
	int price;
	String model;
	private static Car c = null;

	private Car() {

	}

	public static Car getCar() {
		if (c == null) {
			c = new Car();
		}
		return c;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + "]";
	}

}
