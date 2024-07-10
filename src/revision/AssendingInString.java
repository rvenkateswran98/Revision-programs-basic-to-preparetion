package revision;

public class AssendingInString {
	public static void main(String[] args) {

		String a = "Im from Chennai";
		String b[] = a.split(" ");

		for (int i = 0; i < b.length; i++) {

			for (int j = i + 1; j < b.length; j++) {
				if (b[i].length() <= b[j].length()) {
					String temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}

			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}
