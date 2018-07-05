import java.io.FileOutputStream;

public class File4 {

	public static void main(String[] args) {
		try {
			String filepath1= "e://Sunil.txt";
			
			//open file in write mode 
			FileOutputStream fo1 = new FileOutputStream(filepath1,false);
			
			String text = "The JButton class is used to create a labeled button "
					+ "that has platform independent implementation."
					+ " The application result in some action when "
					+ "the button is pushed. It inherits AbstractButton class.";
			
			//convert string into array of byte
			byte[] arr = text.getBytes();
			
			//to store the data of array inside the file in one go
			 fo1.write(arr);
			 
			 fo1.close();
			
			
		} catch (Exception e) {
			System.out.println("error "+e);
		}

	}

}
