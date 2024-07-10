package revision1;

public class StringBuffers {
	public static void main(String[] args) {

		System.out.println("String Buffer\n");

		StringBuffer sn = new StringBuffer("Hari");

		System.out.println("Before: " + sn.hashCode());

		sn = sn.append("123");

		System.out.println("After:  " + sn.hashCode());
		
		System.out.println( sn.replace(0, 1, "S"));
		
		System.out.println(sn.reverse());

	}
}
