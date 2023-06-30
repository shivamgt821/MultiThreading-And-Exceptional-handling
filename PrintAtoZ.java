public class PrintAtoZ  extends Thread{
		
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		PrintAtoZ obj = new PrintAtoZ();
		obj.start();
	}
	}
