public class Demo5 {

	public static void main(String[] args) {
		String s = null;;
		int n=0;
		System.out.println("main start");
		try {
		n=s.length();
		System.out.println(n);
	}
		catch(Exception e) {
			System.out.println(e);
			s = "Shivam";
			}
			System.out.println(s.length());
			System.out.println("main end");
		}

}
