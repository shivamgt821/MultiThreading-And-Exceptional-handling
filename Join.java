class  Exmp extends Thread {
	public void run() {
		
		System.out.println("Character printing started");
		for(int i=65; i<=75; i++) {
			System.out.println((char)i);
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Character printing completed");
		
	}
}
public class Join {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread Started and estd connection");
		Exmp e = new Exmp();
		e.start();    // generally first main thread execute then run()
		e.join();     // close the connection after run() execute(finish execution)
		System.out.println("Main Thread Ended and closed connection");

	}

}
