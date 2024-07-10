package revisionJava8;

public class UseFindEven {
	public static void main(String[] args) {

		FindEven f = (x) -> {
			for (int i = 0; i < x.length; i++) {
				if (x[i] % 2 == 0) {
					System.out.println("Even no: " + x[i]);
				}

			}

		};

		int o[] = { 1, 4, 55, 66, 88 };
		f.even(o);
	}
}
