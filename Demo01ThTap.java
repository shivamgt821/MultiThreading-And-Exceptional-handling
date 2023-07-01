package Multithreading_TapAcademy;

public class Demo01ThTap {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started execution");
		System.out.println("main thread is executing");
		Thread.sleep(5000);
		System.out.println("main thread is executing");
		Thread.sleep(5000);
		System.out.println("main thread is executing");
		Thread.currentThread().interrupt();  // this is used to interrupt the or break the code
		Thread.sleep(5000);
		System.out.println("main thread completed execution");

	}

}
