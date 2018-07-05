import java.io.FileInputStream;
import java.util.Scanner;

public class FileAssignment1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter path of File :: ");
			String filepath = sc.nextLine();
			FileInputStream fi = new FileInputStream(filepath);
			int size = fi.available();
			byte[] arr = new byte[size];
			fi.read(arr);
			
			String str = new String(arr);
			System.out.println(str);
			
			byte[] charArr = str.getBytes();
			int countLower=0,countUpper=0,countNum=0,countSpace=0,countLine=1;
			for (int i = 0; i < charArr.length; i++) {
				if(charArr[i]>=65&&charArr[i]<=90)
					countUpper++;
				else if(charArr[i]>=97&&charArr[i]<=122)
					countLower++;
				else if(charArr[i]>=48&&charArr[i]<=57)
					countNum++;
				else if(charArr[i]==32)
					countSpace++;
				else if(charArr[i]==10)
					countLine++;
			}
			
			System.out.println("#Report#");
			System.out.print("Total size of file :: "+size);
			System.out.println("Number of Alphabates :: ");
			System.out.println("      Uppercase Alphabates :: "+countUpper);
			System.out.println("      Lowercase Alphabates :: "+countLower);
			System.out.println("      Total number of Alphabates :: "+(countUpper+countLower));
			System.out.println("Total number of Numeric value :: "+countNum);
			System.out.println("Total number of space :: "+countSpace);
			System.out.println("Total number of Lines :: "+countLine);
			
			fi.close();
			
		} catch (Exception e) {
			System.out.println("error ");
		}

	}

}
