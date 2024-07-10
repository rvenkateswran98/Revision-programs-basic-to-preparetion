package revision1;

public class StringBuilder {
	public static void main(String[] args) {

		System.out.println("String Builder\n");
		StringBuffer sb = new StringBuffer("Hari");
		
		System.out.println(sb.hashCode());
		
		sb = sb.append("123");
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb.reverse().toString());
		
		System.out.println("\nString reverse\n");

	}
}
