class Mythread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class CreatingMyThread {

	public static void main(String[] args)  {
		System.out.println("main start");
		Thread t1 = new Mythread();
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

}
