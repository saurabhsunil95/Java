import java.io.FileInputStream;

public class File1 {

	public static void main(String[] args) {
		try {
			String filepath = "e:\\mydoc.txt";
			
			//open file in read mode
			FileInputStream fi = new FileInputStream(filepath);
			
			//get no of bytes those can be read by the read() method
			int size = fi.available();
			
			//create an array of byte to store the data of file
			byte[] arr = new byte[size];
			
			//store fetch byte data and store in inside this array
			fi.read(arr);
			
			String str = new String(arr);
			System.out.println(str);
			
			fi.close();
			
		} catch (Exception e) {
			System.out.println("error ");
		}

	}

}
