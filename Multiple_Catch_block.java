public class Multiple_Catch_block {

	public static void main(String[] args) {

		System.out.println("main start");
		int a[] = {1,2,3,4,5};
		try {
		System.out.println(a[10]);  // first we got java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		catch(ArithmeticException e) {
			System.out.println("Arth Handled"); 	
		}
		catch(NullPointerException e) {
			
			System.out.println("Null handled");
		}
		System.out.println("main end");
	}

}
