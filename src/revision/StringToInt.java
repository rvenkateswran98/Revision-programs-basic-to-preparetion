package revision;

public class StringToInt {
	public static void main(String[] args) {

		String a = "2-1+4";
		String[] b = a.split("");

//		int c = Integer.parseInt(b[0]);
//		int d = Integer.parseInt(b[2]);
//		int e = Integer.parseInt(b[4]);

//		System.out.println(c-d+e);

		String s[] = a.split("\\d+");
		String no[] = a.split("\\D");

		int t = Integer.parseInt(no[0]);

		for (int i = 1; i < s.length; i++) {
			switch (s[i]) {
			case "+":
				t += Integer.parseInt(no[i]);
				break;
			case "-":
				t += Integer.parseInt(no[i]);
				break;

			}
		}
		System.out.println(t);

	}

}
