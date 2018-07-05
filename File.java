import java.io.FileInputStream;

public class File {

	public static void main(String[] args) {
		try {
			String filepath = "e:\\mydoc.txt";
			
			FileInputStream fi = new FileInputStream(filepath);
			
			while(true) {
				
				//fetch file in byte form in store it
				int var = fi.read();
				
				//end of file and loop
				if(var==-1)
					break;
				
				//byte change into character
				char ch = (char)var;
				System.out.print(ch);
			}
			fi.close();
			
		} catch (Exception e) {
			System.out.println("error ");
		}

	}

}
