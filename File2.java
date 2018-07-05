import java.io.FileOutputStream;

public class File2 {

	public static void main(String[] args) {
		try {
			String filepath1= "e://ram.txt";
			String filepath2 = "e://lakhan.txt";
			
			//open a file in write mode
			FileOutputStream fo1 = new FileOutputStream(filepath1,false);
			
			//open a file in append mode
			FileOutputStream fo2 = new FileOutputStream(filepath2,true);
			
			System.out.println("jsdfh whdf");
			
		} catch (Exception e) {
			System.out.println("error "+e);
		}

	}

}
