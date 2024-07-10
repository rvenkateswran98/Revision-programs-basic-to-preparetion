package revision1;

public class Finalize {

	public void finalize() {
		System.out.println("Collected");
	}

	public static void main(String[] args) {
		System.gc();
		Finalize s1 = new Finalize();
		System.out.println(s1.hashCode());
		s1 = new Finalize();
		System.out.println(s1.hashCode());
		// System.gc(); //garbage collection
	}

}
