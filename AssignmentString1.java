import java.util.Scanner;

public class AssignmentString1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :: ");
		String str = sc.nextLine();
		str = str+'\0';
		int len=0;
		for (int i = 0; str.charAt(i) != '\0'; i++) {
	        len++;
	    }
		System.out.println("Length of string is :: "+len);
	}

}
