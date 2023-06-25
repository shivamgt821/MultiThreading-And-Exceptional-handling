import java.util.Scanner;

public class Demotap3 {

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
			System.out.println(ar[index]);
		}
		catch(Exception e) {
			System.out.println("Invalid Input");
		}
		System.out.println("Connection is terminated");
	}

}
