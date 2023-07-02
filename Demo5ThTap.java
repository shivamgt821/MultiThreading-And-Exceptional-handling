package Multithreading_TapAcademy;

class Demo6 extends Thread {
	public void run() {
		System.out.println("Typing Started");
		for(int i=1; i<=5; i++) {
			System.out.println("Typing...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Typing Completed");
	}
}
class Demo7 extends Thread 
{
	public void run() 
	{
		System.out.println("Code Completion Started");
		for(; ;) 
		{
			System.out.println("Code Completion");
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Demo8 extends Thread {
	public void run() {
		System.out.println("Auto Saving Started");
		for(; ;) {
			System.out.println("Auto saving Completion");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

public class Demo5ThTap {

	public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.setName("TYPE");
		Demo7 d2=new Demo7();
		d2.setName("COMPLETE");
		d2.setDaemon(true);
		Demo8 d3=new Demo8();
		d3.setName("SAVE");
		d3.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();
		}
	}
}
