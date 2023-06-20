package com.jsp.Exceptional_Handling;

// Multiple Catch block

public class Demo3 {

	public static void main(String[] args) {

		System.out.println("main start");
		int a[] = {1,2,3,4,5};
		try {
		System.out.println(a[10]);  // first we got java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		} 
		catch(ArithmeticException e) {
			
		}
		catch(NullPointerException e) {
			
		}
		catch(Exception e) {
			System.out.println("Array handled");
		}
		System.out.println("main end");
	}

}
