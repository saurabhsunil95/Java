import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class OtpGenerator {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Digits of OTP :: ");
		int b =  sc.nextInt();
		
		if(b<=5) {
			System.out.println("Invalid number !!!");
		}
		else if(b>=11) {
			System.out.println("Invalid number !!!");
		}
		else{
			System.out.print("Generated OTP :: ");
			for(int i=1;i<=b;i++) {
			int otp = r.nextInt(10);
			System.out.print(otp);
			}
		}
		
	}

}
