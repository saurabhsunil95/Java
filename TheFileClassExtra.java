import java.io.File;

public class TheFileClassExtra {

	public static void main(String[] args) {
		String path = "e:/info.txt";
		File f = new File(path);
		
		if(f.canExecute())
			System.out.println("Tests whether the application can execute the file denoted by this abstract pathname.");
		if(f.canRead())
			System.out.println("Tests whether the application can read the file denoted by this abstract pathname.");
		if(f.canWrite())
			System.out.println("Tests whether the application can modify the file denoted by this abstract pathname.");
		else System.out.println("No ");
		
		String path1 = "e:/file";
		File f1 = new File(path1);
		
		String filename[] = f1.list();
		for (int i = 0; i < filename.length; i++) {
			System.out.println(filename[i]);
		}
	}

}
