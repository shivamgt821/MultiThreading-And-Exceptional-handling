public class Demo6 {

	public static void div(){
		System.out.println(10/0);

	}
	public static void main(String[] args) {
		try {
		div();
		} catch(Throwable e){
			System.out.println(e.getMessage());
		}
		
	}
}
