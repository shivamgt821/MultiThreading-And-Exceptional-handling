public class Thread_Sleep {

	public static void main(String[] args) {
		System.out.println("main start");
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("main exceuting");
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("main end");
	}

}
