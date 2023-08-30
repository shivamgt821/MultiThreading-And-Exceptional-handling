public class Demo4  {

	public static void main(String[] args) {
		System.out.println("main start");
		try {
		System.out.println(10/0);  //  first we got an exception -->  Exception in thread "main" java.lang.ArithmeticException: / by zero
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array block");
		}
		catch(ArithmeticException e) { // then we use try and catch block to handled that exception
			System.out.println("Arth block");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("main end");
	}

}
