package revision1;

public class MyThread1 extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {

		MyThread1 my = new MyThread1();
		my.start();
		System.out.println("Hello Vanakkam Makkaley");
	}

}
