import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileAssignment2 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter path of Source :: ");
			String filepath1 = sc.nextLine();
			System.out.print("Enter path of Destination :: ");
			String filepath2 = sc.nextLine();
			FileInputStream fo1 = new FileInputStream(filepath1);
			
			int size = fo1.available();
			byte[] arr = new byte[size];
			fo1.read(arr);
			String str = new String(arr);
			
			System.out.println("           #MENU#");
			System.out.println("Press 1 for copy file in write mode ");
			System.out.println("Press 2 for copy file in append mode ");
			
			int q = sc.nextInt();
			
			if(q==1) {
				FileOutputStream fo2 = new FileOutputStream(filepath2,false);
				byte[] arr1 = str.getBytes();
				fo2.write(arr1);
				fo2.close();
				System.out.println("Source File is copy in Destination File in write mode");
			}
			else {
				FileOutputStream fo2 = new FileOutputStream(filepath2,!false);
				byte[] arr1 = str.getBytes();
				fo2.write(arr1);
				fo2.close();
				System.out.println("Source File is copy in Destination File in Append mode");
			}
			fo1.close();
			
			FileInputStream fo2 = new FileInputStream(filepath2);
			int size2 = fo2.available();
			System.out.println("Size of source file is :: "+size+" bytes");
			System.out.println("Size of destination file is :: "+size2+" bytes");
			
		} catch (Exception e) {
			System.out.println("error ");
		}

	}

}
