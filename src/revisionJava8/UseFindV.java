package revisionJava8;

public class UseFindV {
	public static void main(String[] args) {

		FindVowel f = (s) -> {
			for (int i = 0; i < s.length; i++) {

				String a = s[i].toLowerCase();

				if (a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
					System.out.println("Vowel Prsent : " + a.charAt(a.length() - 1));

				} else {
					System.out.println("Consonent : " + a.charAt(a.length() - 1));

				}

			}
		};

		String str[] = { "One", "Two", "Three", "Four", "Five", "xyz", "Sky" };
		f.findv(str);

	}
}
