package Multithreading_TapAcademy;

class Demo3 extends Thread {
	public void run() {
		System.out.println("User thread started execution");
		for(int i=1; i<=5; i++) 
		{
			System.out.println("User thread executing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("User thread finished execution");
	}
}
class Demo4 extends Thread {
	public void run() {
		System.out.println("Daemon thread started execution");
		for(;;) 
		{
			System.out.println("Daemon thread is executing");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
//		System.out.println("Daemon thread finished execution");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Main thread started execution");
		Demo3 d3 = new Demo3();
		d3.start();
		Demo4 d4 = new Demo4();
		d4.setDaemon(true);
		d4.start();
		System.out.println("Main thread finished execution");

		}
	}


