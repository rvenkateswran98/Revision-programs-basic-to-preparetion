package revision1;

public class CustomException {
	public static void main(String[] args) {
		String a = null;

		try {
			System.out.println(a.toLowerCase());
		} catch (NullPointerException ne) {
			System.out.println(ne.getMessage());
		} finally {
			System.out.println("Im from finally");
		}

	}

}
