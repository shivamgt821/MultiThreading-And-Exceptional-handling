package Exception_Handling_TapAcademy;

public class Practice {

	public static void main(String[] args) {
		try {
			int i,sum ;
			sum = 10;
			for(i=-1; i<3;++i) {
				sum = sum/i;
				System.out.println(sum);
				
			}
		}
//		System.out.println("C")    syntax error, insert "Finally" to complete BlockStatements
		catch(ArithmeticException e) {
			System.out.println("0");
		}
	}

}
