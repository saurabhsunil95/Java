import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		long t = System.currentTimeMillis();
		System.out.println("total years from 01/01/1970");
		System.out.println(t/1000/3600/24/365);
		
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		long t2 = System.currentTimeMillis();
		System.out.println((t2-t)/1000+" Seconds");
	}

}
