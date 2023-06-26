package Exception_Handling_TapAcademy;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class Multiple_Catch_Block2 {

	public static void main(String[] args) {
		System.out.println("Connection is estd");
		Scanner scn = new Scanner(System.in);
		try {
			System.out.println("Enter the numerator");
			int a = scn.nextInt();
			System.out.println("Enter the dinominator");
			int b = scn.nextInt();
			int c = a/b;
			System.out.println(c);
			System.out.println("Enter the size of an array");
			int size = scn.nextInt();
			int ar[] = new int[size];
			System.out.println("Enter the element");
			int ele = scn.nextInt();
			System.out.println("enter the position to be stored in");
			int index = scn.nextInt();
			ar[index] = ele;
			ar = null;
			System.out.println(ar[index]);
			
			}
		catch(ArithmeticException ae) {
			System.out.println("Please provide not zero denominator");
		}
		catch(NegativeArraySizeException nas	) {
			System.out.println("Please provide positive array size");
		}
		catch(InputMismatchException im) {
			System.out.println("Please Provide Integer value");
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Please provide valid index");
		}
		
		System.out.println("Connection is terminated");
	}
}
