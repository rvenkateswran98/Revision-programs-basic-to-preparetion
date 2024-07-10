package revision;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an integer: ");

		if (scanner.hasNextInt()) {
			int input = scanner.nextInt();
			String output = Integer.toString(input); // Convert int to string
			// Alternatively: String output = "" + input; // String concatenation

			System.out.println("Output as a string: " + output);
		} else {
			System.out.println("Invalid input. Please enter an integer.");
		}

		scanner.close();
	}
}
