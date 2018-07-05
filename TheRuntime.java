import java.util.Scanner;

public class TheRuntime {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a text");
			String text = s.nextLine();
			//get the object of runtime
			Runtime rt = Runtime.getRuntime();
			rt.exec(text);
		} catch (Exception e) {
			System.out.println("error "+e);
		}

	}

}
