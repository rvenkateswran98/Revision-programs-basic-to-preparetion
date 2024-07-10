package revisionJava8;

public class Duplicate_1For {

	public static void main(String[] args) {

		String b = "ramkuamr";

		char[] a = b.toCharArray();
		for (int i = 0; i < a.length; i++) {

			int c = 0;

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					a[j] = '@';
					c++;

				}
			}
			if (c == 0 && a[i] != '@') {
				System.out.println(a[i]);

			}

		}
		System.out.println(a);

//		for (int i = 0; i < a.length(); i++) {
//			char b = a.charAt(i);
//
//			if (a.indexOf(b) == a.lastIndexOf(b)) {
//
//				//System.out.println("Non Dublicate==" + b);
//			} else {
//				//System.out.println("Dublicated===" + b);
//			}
//
//		}

	}

}
