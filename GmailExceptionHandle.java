class PasswordInvalidException extends RuntimeException {
	
}
public class GmailExceptionHandle {

	public static void main(String[] args) {
		String name = "Ram@123";
		int pass = 1234;
		if(name.equals("Ram@123")) {
			if(pass == 1234) {
				System.out.println("login successfuly");
			}else {
				try {
					throw new PasswordInvalidException();
				}catch (PasswordInvalidException e) {
					e.printStackTrace();
					System.out.println("Invalid Password");
				}
			}
		}else System.out.println("enter valid user name.");
	}

}
