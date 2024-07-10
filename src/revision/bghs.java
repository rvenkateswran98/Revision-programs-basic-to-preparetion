package revision;

public class bghs {

	public static void main(String[] args) {

		String a = "a3b5c";
		char[]b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			
			for(int j=i+1;j<b.length;j++) {
			if(i%2==0) {
				if(b[i]<b[j]) {
					char d=b[i];
					b[i]=b[j];
					b[j]=d;
					
				}			}
			}
		}
		System.out.println(b);
		
	}
}
