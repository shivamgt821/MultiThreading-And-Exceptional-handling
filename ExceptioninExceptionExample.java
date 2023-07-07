public class ExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println("main start");
			System.out.println(5/0);
			System.out.println("main ends");
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
		catch (ClassNotFoundException e) {   // Unreachable catch block for ClassNotFoundException. It is already handled by the catch block for Exception
			System.out.println("Class Not FoundException handled");
		}
	}

}
