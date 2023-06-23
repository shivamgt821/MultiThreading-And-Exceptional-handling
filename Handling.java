public class Handling {

	public static void main(String[] args) {
		try {
			System.out.println("main started");
			int a = 20 , b = 0 , c;
			c=a/b;
			System.out.println(c);
			System.out.println("main executed");
		}
		catch (ArithmeticException a) {
			int x = 20 , y = 0 , z;
			z=x/y;
			System.out.println(z);
			System.out.println("can't divided by zero");
		}
		finally {
			int p = 20 , q = 0 , r;
			r=p/q;
			System.out.println(r);
			System.out.println("main ended");
		}
	}

}
