class Creat1to10 implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(450);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("main starts");
		Runnable obj = new Creat1to10();
//		obj.run();
		Thread t1 = new Thread(obj);
		t1.start();
		System.out.println("main end");
	}

	}

