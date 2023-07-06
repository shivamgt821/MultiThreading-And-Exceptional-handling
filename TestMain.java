class Synchronised{
	  public void run() {
//	public synchronized void run() {  // it is used to print output one by one for wait one person to another

		
		String name = Thread.currentThread().getName();
		System.out.println(name+ " started printing");
		for(int i=1; i<=3; i++) {
			System.out.println(name+ " is printing");
			try{
				Thread.sleep(4000);
			}
			catch(Exception e) {
				System.out.println("Some problem occcured");
			}
		}
		System.out.println(name+" completed printing");
		
	}
}
public class TestMain {

	public static void main(String[] args) {
		
	}

}
