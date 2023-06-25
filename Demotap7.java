import java.io.FileNotFoundException;
import java.sql.SQLException;

class Exmp1
{
	public void fun() throws SQLException {
		
	}
}
class Exmp2 extends Exmp1 
{
//	public void fun() throws FileNotFoundException  // Rule 3 Error due to this does not apply for checked exc applies only for unchecked 
	public void fun() throws SQLException   // checked excep
	{
		System.out.println("Inside child class fun");
	}
}
public class Demotap7 {

	public static void main(String[] args) 
	{
		Exmp2 e2 = new Exmp2();
		try {
		e2.fun();
		} catch(Exception e) {
			System.out.println("Handled");
		}
	}

}
