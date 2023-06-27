package Exception_Handling_TapAcademy;

import java.util.Scanner;

class Test1 {
	
	void fun1() {
		System.out.println("Connection 4 establised");
		
			Scanner scn = new Scanner(System.in);
			
			System.out.println("Enter the numerator");
			int a = scn.nextInt();
			
			System.out.println("Enter the denominator");
			int b = scn.nextInt();
			int c = a/b;
			System.out.println(c);
			System.out.println("Connection 4 terminated");
	}
}
class Test2 {
	
	void fun2() {
		System.out.println("Connection 3 establised");
		Test1 t1 = new Test1();
		t1.fun1();
		System.out.println("Connection 3 terminated");
	}
}
class Test3 {
	
	void fun3() {
		System.out.println("Connection 2 establised");
		Test2 t2 = new Test2();
		t2.fun2();
		System.out.println("Connection 2 terminated");
	}
}

public class Test {

	public static void main(String[] args) {
		
			System.out.println("Connection 1 establised");
			Test3 t3 = new Test3();
			t3.fun3();
			System.out.println("Connection 1 terminated");
		}
	}



