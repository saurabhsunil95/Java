import java.io.File;

public class TheFileClass1 {

	public static void main(String[] args) {
		String path = "e:/lota/pani";
		
		File f = new File(path);
		
		//create directory
		
		if(f.mkdir())
			System.out.println("directory created");
		else System.out.println("directory already exist");

	}

}
