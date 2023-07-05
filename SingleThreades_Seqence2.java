import java.util.Scanner;

class Demo {
	public static void addition() {
		System.out.println("Addition Started");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd number :");
		int b = scn.nextInt();
		int c = a+b;
		System.out.println(c);
	}

	public static void printChar() throws Exception {
		System.out.println("Printing character started ");
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			Thread.sleep(4000);
		}
}
	public static void printNum() {
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
public class SingleThreades_Seqence2 {
   public static void main(String[] args) throws Exception {
	   Demo.printChar();
	   Demo.printNum();
	   Demo.addition();

   		}
	}	
}

