class Myth extends Thread {
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("child is executing");
		}
	}
}
public class Demo2Th {
	public static void main(String[] args) {
		Myth t = new Myth();
		t.start();
		System.out.println(10/0);
		for(int i=1; i<=5; i++) {
			System.out.println("main");
		}
	}
}
