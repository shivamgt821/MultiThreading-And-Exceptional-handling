public class finally_Block {

	public static void main(String[] args) {

		System.out.println("main start");
		try {
		System.out.println(10/0);  //  first we got an exception -->  Exception in thread "main" java.lang.ArithmeticException: / by zero
		} catch(Exception e) { // then we use try and catch block to handled that exception
			System.out.println(e);
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("main end");
	}

}
