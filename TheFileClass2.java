import java.io.File;

public class TheFileClass2 {

	public static void main(String[] args) {
		String path = "e:/lota";
		
		File f = new File(path);
		
		//create directory
		
		if(f.delete())
			System.out.println("resource deleted");
		else System.out.println("resourse cant be deleted");

	}

}
