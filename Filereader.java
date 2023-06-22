import java.io.FileNotFoundException;  
import java.io.FileReader;

public class Filereader {
	
	public static void m1() throws FileNotFoundException {
		
		System.out.println("m1 excuted");
		FileReader r = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\java\\Abc.java");
		
	}

	public static void main(String[] args) {
		try{
			m1();
		}catch (Exception e) {
			e.printStackTrace();
		}System.out.println("main excuted");
		
	}

}
