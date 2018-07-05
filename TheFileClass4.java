import java.io.File;

public class TheFileClass4 {

	public static void main(String[] args) {
		
//		String oldpath = "e:/img.jpg";
//		String newpath = "e:/img.java";
		
		String oldpath = "e:/img.java";
		String newpath = "e:/img.jpg";
		
		//denote old path
		File f1 = new File(oldpath);
		
		//denote new path
		File f2 = new File(newpath);
		
		if(f1.renameTo(f2))
			System.out.println("renaming done");
		else System.out.println("renaming not done");
	}

}
