import java.util.Scanner;
class Stall implements Runnable {
	private String stallName;
	private String details;
	private double stallArea;
	private double stallCost;
	private String owner;

	public Stall() 
	{
		
	}
	public Stall(String stallName,String details,double stallArea,String owner) {
		this.stallName = stallName;
		this.details = details;
		this.stallArea = stallArea;
		this.owner = owner;
	}
	public String getStallName() 
	{
		return stallName;
	}
	
	public String getDetails() 
	{
		return details;
	}
	
	public double getStallArea() 
	{
		return stallArea;
	}
	
	public double getStallCost() 
	{
		return stallCost;
	}
	
	public String getOwner() 
	{
		return owner;
	}
	
	public void run() 
	{
		stallCost = stallArea*150;
	}
}

public class Stallmain {
	public static void main(String[] args)	 {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of the stalls: ");
		int n=scn.nextInt();
		
		Stall stalls [] = new Stall[n];
		
		for(int i=0; i<n; i++) {
			String s = scn.nextLine();
			String[] split = s.split(",");
			stalls[i] = new Stall(split[0],split[1],Integer.parseInt(split[2]),split[3]);
		}
		for(int i=0; i<n; i++) {
			Thread t = new Thread(stalls[i]);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		double totalCost = 0.0;
		
		for(int i=0; i<n; i++) {
			totalCost +=stalls[i].getStallCost();
		}
		System.out.println(totalCost);	
	}
}
		
	
