import java.util.Scanner;

public class AssignmentString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :: ");
		String s = sc.nextLine();
		int n = s.length();
		char[] arr1 = s.toCharArray();
		char[] arr = new char[n];
		int j=0;
		for (int i = arr1.length-1; i >=0; i--) {
			arr[j]=arr1[i];
			j++;
		}
		String rev = new String(arr);
		System.out.println("Reverse String is :: "+rev);
		
		if(s.equalsIgnoreCase(rev))
			System.out.println("String "+s+" is Palindrom.");
		else System.out.println("String "+s+" is not Palindrom");
	}

}
