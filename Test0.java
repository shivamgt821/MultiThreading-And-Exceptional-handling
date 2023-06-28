package Exception_Handling_TapAcademy;

import java.util.Scanner;


	class Test01 {
		
		void fun1() {
			System.out.println("Connection 4 establised");
			
				Scanner scn = new Scanner(System.in);
				try {
				System.out.println("Enter the numerator");
				int a = scn.nextInt();
				
				System.out.println("Enter the denominator");
				int b = scn.nextInt();
				int c = a/b;
				System.out.println(c);
				} catch(Exception e) {
					System.out.println("Some Problem Occurred");
				}
				System.out.println("Connection 4 terminated");

		}
	}
	class Test02 {
		
		void fun2() {
			System.out.println("Connection 3 establised");
			Test01 t1 = new Test01();
			t1.fun1();
			System.out.println("Connection 3 terminated");
		}
	}
	class Test03 {
		
		void fun3() {
			System.out.println("Connection 2 establised");
			Test02 t2 = new Test02();
			t2.fun2();
			System.out.println("Connection 2 terminated");
		}
	}

	public class Test0 {

		public static void main(String[] args) {
			
				System.out.println("Connection 1 establised");
				Test03 t3 = new Test03();
				t3.fun3();
				System.out.println("Connection 1 terminated");
			}
		}


