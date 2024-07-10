package revisionJava8;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException{

		Runnable r=new Num();
		Thread t=new Thread(r);
		
		Main t1=new Main();
		
		t1.start();
		t.start();
		if(t1.isAlive()) {
			System.out.println("Alive");
		}
		t1.join();
		
		System.out.println("Mani Thread Runned");
		
	}

}

class Num implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}

		}
	}

}

class Main extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Updating-->");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
		}
	}

}
