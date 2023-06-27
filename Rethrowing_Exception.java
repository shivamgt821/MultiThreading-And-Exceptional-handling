package Exception_Handling_TapAcademy;

import java.util.Scanner;

class Demo1 {
	
	void fun() throws Exception {
		System.out.println("Connection 2 is established");
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter numerator");
			int a = scn.nextInt();
			System.out.println("Enter denominator");
			int b = scn.nextInt();
			int c = a/b;
			System.out.println(c);
			}
		catch(Exception e) 
			{
			System.out.println("Exception handled in fun()");
			throw e;
			}
		finally 
			{
			System.out.println("Connection 2 is terminated");
			}
	}
}

public class Rethrowing_Exception {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		try {
			Demo1 d1 = new Demo1();
			d1.fun();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main()");
		}
		System.out.println("Connection 1 is terminated");

	}

}
