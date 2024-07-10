package revision1;

public class StaticMemory {

	static int a=70;
	public StaticMemory() {
		a++;
		System.out.println(a);
	}
	public static void get() {
		System.out.println("HI");
	}
	public static void main(String[] args) {
		get();//hi
		StaticMemory s1=new StaticMemory();//71
		StaticMemory s2=new StaticMemory();//71
	}
	static {/// will first execute;
		System.out.println("Im from static block");
	}
	
	
	
	
	
}
