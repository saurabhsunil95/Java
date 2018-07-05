import java.util.Random;
import java.util.Scanner;

public class OtpAssignment2 {

	public static void main(String[] args) {
		Random r = new Random();
			System.out.print("Generated OTP :: ");
			for(int i = 1;i<=4;i++) {
				char otp = (char)(65+r.nextInt(26));
				System.out.print(otp);
			}
			for(int i=5;i<=8;i++) {
			int otp = r.nextInt(10);
			System.out.print(otp);
			}

	}

}
