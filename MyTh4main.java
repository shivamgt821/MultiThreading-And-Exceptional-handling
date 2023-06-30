public class MyTh4main {

	public static void main(String[] args) {
		Thread m=Thread.currentThread();
		MyTh4 t = new MyTh4();
		t.start();
		try {
			t.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i=1; i<=3; i++) {
			System.out.println("main class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
