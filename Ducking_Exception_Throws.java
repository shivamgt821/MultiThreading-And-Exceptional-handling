import java.util.Scanner;

class Demo01 {
	void fun() throws Exception  {
		System.out.println("Connection 2 is establised");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int a = scn.nextInt();
		System.out.println("Enter the denominator");
		int b = scn.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection 2 is terminated");
	}
}
public class Ducking_Exception_Throws {

	public static void main(String[] args) {
		System.out.println("Connection 1 is established");
		try {
			Demo01 d1 = new Demo01();
			d1.fun();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main()");
		}
		System.out.println("Connection 1 is terminated");

	
	}

}
