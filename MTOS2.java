import java.util.Scanner;

class Test01 implements Runnable {
	public void run() {
		System.out.println("Addition Started");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd number :");
		int b = scn.nextInt();
		int c = a+b;
		System.out.println(c);
		System.out.println("Addition completed");

	}		
}
class Test02 implements Runnable {
	public void run() {
	System.out.println("Printing character started ");
	for(int i=65; i<=75; i++) {
		System.out.println((char)i);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	System.out.println("Printing character ended ");

	}
}
class Test03 implements Runnable {
	public void run() {
		System.out.println("Printing number started ");
		for(int i=10; i<=20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing number ended ");

	}
public class MTOS2 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();    // jobs
		Test02 t2 = new Test02();    // jobs
		Test03 t3 = new Test03();    // jobs
		
		Thread th1 = new Thread(t1);   // workers
		Thread th2  = new Thread(t2);  // workers
		Thread th3  = new Thread(t3);  // workers
		
		th1.start();
		th2.start();
		th3.start();
		}
	}
}




