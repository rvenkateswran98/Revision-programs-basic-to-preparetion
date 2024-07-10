package revision1;

import java.util.Scanner;

public class StringScanner {
public static void main(String[] args) {
	
	System.out.println("\n String Revrse\n");
	System.out.println("Enter the  String : ");
	
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	String reverse = "";
	int len = str.length();
	for (int i = len - 1; i >= 0; i--) {
		reverse += str.charAt(i);
	}
	System.out.println(reverse);

}
}
