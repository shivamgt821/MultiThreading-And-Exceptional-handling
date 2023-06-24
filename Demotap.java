import java.util.Scanner;

public class Demotap {

	public static void main(String[] args) {
		System.out.println("Connection is establised");
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scn.nextInt();
		System.out.println("Enter the Denomator");
		int b = scn.nextInt();
		int c = a/b;
		System.out.println(c);
		System.out.println("Connection is terminated");
	}

}
