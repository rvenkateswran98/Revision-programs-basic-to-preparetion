package revision;

public class FindDup {
	public static void main(String[] args) {
		String a[] = { "a", "b", "c", "d", "a", "e", "c" };
		for (int i = 0; i < a.length; i++) {
			int c = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = "@";
					c++;
				}
			}
			if (c > 1 && a[i] != "@") {
				System.out.println(a[i] + "=" + c);
			}
		}
	}
}
