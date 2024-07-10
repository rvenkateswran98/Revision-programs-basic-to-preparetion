package revision;

public class PrintSameLength {
	public static void main(String[] args) {

		String a = "this is java program  good of";

		String b[] = a.split(" ");

		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {

				if (b[i].length() == b[j].length()) {
					count++;
				}

			}
			if (count >= 2) {
				System.out.println(b[i]);
			}

		}

	}
}
