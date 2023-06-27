package Exception_Handling_TapAcademy;
class Test9 
{
	int count = 0;
	void Test9() throws Exception
	{
		try 
		{
			count++;
			try 
			{
				count++;
				try 
				{
					count++;
					throw new Exception();
				}
				catch(Exception ex) 
				{
					count++;
					throw new Exception();
				}
			}
			catch(Exception ex) 
			{
				count++;
			}
		}
		catch(Exception ex) 
		{
			count++;
		}
	}
	void display() 
	{
		System.out.println(count);
	}
}
public class Practice2 
{

	public static void main(String[] args) throws Exception {
		Test9 obj = new Test9();
		obj.Test9();
		obj.display();
	}

}
