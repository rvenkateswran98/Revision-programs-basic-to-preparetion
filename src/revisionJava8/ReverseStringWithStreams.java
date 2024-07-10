package revisionJava8;

import java.util.stream.Collectors;

import revision1.StringBuilder;

import java.util.Arrays;

public class ReverseStringWithStreams {
	public static void main(String[] args) {
		String a = "a1b265c3f";
		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {

			for (int j = i + 1; j < b.length; j++) {
				if (b[i] >= 'a' && b[i] <= 'z') {
					if (b[i] < b[j]) {
						char c = b[i];
						
						b[i] = b[j];
						b[j] = b[i];
						b[j] = c;
					}
				}
			}
		}
		
		System.out.println("Input  =  "+ a);
		System.out.println(b);
	}

}
