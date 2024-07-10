package revision1;

public class MyThread2 implements Runnable {
	@Override
	public void run() {
		synchronized (MyThread2.class) {
			try {
				System.out.println("Hello");
				MyThread2.class.wait(5000);
				System.out.println("Thread is awaked");
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread2 my1 = new MyThread2();
		Thread t = new Thread(my1);
		t.start();
		Thread.sleep(2000);
		System.out.println("Mani Thread: Hello Vanakkam Makkaley");
	}

}
