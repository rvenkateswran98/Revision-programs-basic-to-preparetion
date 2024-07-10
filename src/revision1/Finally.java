package revision1;

public class Finally {
	public static void main(String[] args) {

		int a = 10;
		try {
			System.out.println(a / 0);
		}

		finally {
			System.out.println("Im from finally");
		}

	}

}
