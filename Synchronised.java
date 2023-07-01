class A {
	public synchronized void m1(String s) {
		for(int i=1; i<=3; i++) {
			System.err.println("Excuted by : "+s);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Myth5 extends Thread{
	A a;
	String s;
	public Myth5(A a , String s) {
		super();
		this.a = a;
		this.s = s;
	}
	public void run() {
		a.m1(s);
	}
}
public class Synchronised {
	public static void main(String[] args) {
		A a = new A();
		Myth5 t = new Myth5(a,"t");
		Myth5 t1 = new Myth5(a,"t1");
		t.start();
		t1.start();
	}
}
