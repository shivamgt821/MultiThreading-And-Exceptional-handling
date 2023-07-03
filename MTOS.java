import java.util.Scanner;

class Test1 extends Thread {
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
class Test2 extends Thread {
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
class Test3 extends Thread {
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
public class MTOS {

	public static void main(String[] args) {
		Join t1 = new Join();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		t1.start();
		t2.start();
		t3.start();
		}
	}
}
