import java.util.Scanner;

class Test extends Thread
{
	public void run() 
	{
		Thread t = Thread.currentThread();
		String  name = t.getName();
		
		if(name.equals("ADD")) {
			addition();
		}
		else if(name.equals("Char")) {
			printChar();
		}
		else
		{
			printNum();
		}
	}
	public void addition() {
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
	public void printChar() {
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
	
	public void printNum() {
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
}
public class MTOS3 {

	public static void main(String[] args) {
		Join t1 = new Join();    // jobs
		Join t2 = new Join();    // jobs
		Join t3 = new Join();    // jobs
		
		t1.setName("ADD");
		t2.setName("Char");
		t3.setName("Num");
		
		
		t1.start();
		t2.start();
		t3.start();
		}
	}







