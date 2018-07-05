import java.io.FileOutputStream;

public class File3 {

	public static void main(String[] args) {
		try {
			String filepath1= "e://Saurabh.txt";
			
			//open file in write mode 
			FileOutputStream fo1 = new FileOutputStream(filepath1,false);
			
			String text = "ihsbfijnkjxjahsdfkdnxzhjbsi bsvjfjjn jhgkanfba saurabh s";
			
			//convert string into array of byte
			byte[] arr = text.getBytes();
			
			for (int i = 0; i < arr.length; i++) {
				fo1.write(arr[i]);
			}
			
			fo1.close();
			
		} catch (Exception e) {
			System.out.println("error "+e);
		}

	}

}
