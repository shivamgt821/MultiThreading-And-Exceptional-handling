import java.util.Scanner;

public class SingleThreades_Seqence {

	public static void main(String[] args) throws Exception {
		System.out.println("Addition Started");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = scn.nextInt();
		System.out.println("Enter the 2nd number :");
		int b = scn.nextInt();
		int c = a+b;
		System.out.println(c);
		
		System.out.println("Printing character started ");
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			Thread.sleep(4000);

		}
		System.out.println("Printing character ended ");

		System.out.println("Printing number started ");
		for(int i=10; i<=20; i++) {
			System.out.println(i);
			Thread.sleep(4000);
		}
		System.out.println("Printing number ended ");

	}

}
