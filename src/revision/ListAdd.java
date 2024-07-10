package revision;

public class ListAdd {
	public static void main(String[] args) {

		int a[] = { 2, 6, 5, 3, 4, 4 ,3,5};
		int count = 0;
		for (int i = 1; i < a.length; i=i+2) {
			//for (int j = i + 1; j < a.length; j++) {

				if (a[i-1] + a[i] == 8) {
					count++;
				//}
				
			}

		}
		System.out.println("Count= " + count);

	}

}
