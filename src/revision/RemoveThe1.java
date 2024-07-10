package revision;

public class RemoveThe1 {
	public static void main(String[] args) {

		String a = "xyz923abc";
		char b[] = a.toCharArray();
		int count = 0;

		for (int i = 0; i < b.length; i++) {

			if (b[i] >= 'A' && b[i] <= 'z') {

			} else {
				if (count <= 0) {
					b[i] = '@';
					count++;
				}
			}
		}

		for (int i = b.length - 1; i >= 0; i--) {
			if (b[i] != '@') {
				System.out.print(b[i]);

			}
		}

	}

}
