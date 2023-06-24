public class Thread_Sleep2 {

	public static void main(String[] args) {
		for(int i=65; i<=70; i++) {  // for(int i=1; i<=5; i++){
			System.out.println((char)i);  // System.out.println(i);
		try {
			Thread.sleep(2000);	
		} catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}
