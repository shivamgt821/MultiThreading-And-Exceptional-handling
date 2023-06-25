class Exp1
{
	public void fun() throws ArithmeticException 
	{
	}
}
class Exp2 extends Exp1  {
// 	public void fun() throws Exception {                    // invalid
//	public void fun() throws NullPointerException {         // valid 
//	public void fun() throws NegativeArraySizeException {   // valid  due to Rule3 liscko principle same category unchecked exception 
	public void fun() throws ArithmeticException {
//		public void fun() throws SQLException {

		System.out.println("Inside child class fun()");
}
public class Demotap5 {

	public static void main(String[] args) {
		Exp2 e = new Exp2();
		e.fun();
		}
	}
}



