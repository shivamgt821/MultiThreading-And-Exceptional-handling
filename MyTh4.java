public class MyTh4 extends Thread {
	static Thread m;
	public void run() {
		try {
			m.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1; i<=3; i++) {
			System.out.println("child thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
