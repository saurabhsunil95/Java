import java.io.File;
import java.sql.Date;

public class TheFileClass {

	public static void main(String[] args) {
		String path = "e:/india.txt";
		//denote  this path using file class
		File f = new File(path);
		
		//check if path is correct
		if(f.exists()){
				System.out.println("correct");
				
				//check path is a file
				if(f.isFile()) {
					System.out.println("File");
					long filesize = f.length();
					System.out.println("size of file is "+filesize+"bytes");
					long time = f.lastModified();
					System.out.println("file modified at time "+time);
					//convert milisecond into date yy-mm-dd
					Date d = new Date(time);
					System.out.println("date :: "+d);
				}
				if(f.isDirectory())
					System.out.println("directory");
		}
		else System.out.println("not correct");
	}

}
