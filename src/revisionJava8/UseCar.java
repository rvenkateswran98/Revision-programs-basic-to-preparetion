package revisionJava8;

public class UseCar {
	public static void main(String[] args) {

		Car c1 = Car.getCar();
		c1.brand = "BMW";
		c1.price = 12009;
		c1.model = "M-Series";

		Car c2 = Car.getCar();
		 c2=null;

		Car c3 = Car.getCar();
		c3.brand = "Audi";
		c3.price = 1109;
		c3.model = "A6";

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}
}
