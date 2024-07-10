package revision1;

import java.util.Scanner;

public class StringImmutable {
	public static void main(String[] args) {
		System.out.println("String");
		String name = "Hari";
		String n1="Haran";

	  String name1=new String("Hari");
	  System.out.println(name1.hashCode());

		System.out.println(name.hashCode());
		
		name = name.concat(n1);
		
		System.out.println(name.hashCode());

		
		
		
	}

}
