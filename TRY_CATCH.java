import java.util.Scanner;

class A {
	
	void fun() {
		System.out.println("Connection 2 is establised");
		Scanner scn = new Scanner(System.in);
		try {
		System.out.println("Enter the numerator");
		int a = scn.nextInt();
		System.out.println("Enter the denominator");
		int b = scn.nextInt();
		int c = a/b;
		System.out.println(c);
		} catch(Exception e) {
			System.out.println("Exception handled in fun()");
		} 
		System.out.println("Connection 2 is terminated");
	}
}
public class TRY_CATCH {

	public static void main(String[] args) {
		
		System.out.println("Connection 1 is establised");
		A a = new A();
		a.fun();
		System.out.println("Connection 1 is terminated");
	}
}
