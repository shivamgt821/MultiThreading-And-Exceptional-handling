class Family implements Runnable {
	String resource1 ="TV";
	String resource2 ="PLAYSTATION";

	public void run() 
	{

		String name = Thread.currentThread().getName();
		if(name.equals("Rohit")==true) {
			rohitAccResource();
		}
		else {
			vijayAccResource();
		}
	}
	void rohitAccResource() 
	{
		synchronized(resource2) 
		{
			try 
			{
				System.out.println("Rohit acquired Playstation");
				Thread.sleep(10000);
				synchronized(resource1) 
				{
					System.out.println("Rohit acquired TV");
					Thread.sleep(10000);
				}
			} catch (Exception e) 
			{
				System.out.println("Rohit Failed");
			}
		}
	}
		void vijayAccResource() {
			synchronized(resource1) {
				try 
				{
					System.out.println("Vijay acquired TV");
					Thread.sleep(10000);
					synchronized(resource2) 
					{
						System.out.println("Vijay acquired Playstation");
						Thread.sleep(10000);
					}
				} catch (Exception e) 
				{
					System.out.println("Vijay Failed");
				}
			}
		}
		
}
public class FamilyMain {

	public static void main(String[] args) {
		Family f = new Family();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.setName("Rohit");
		t2.setName("Vijay");
		t1.start();
		t2.start();
	}

}
