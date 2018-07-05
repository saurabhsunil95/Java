import java.util.Random;

public class OtpAssignment3 {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.print("Generated OTP :: ");
		
		//1st digit numeric
		System.out.print(r.nextInt(10));
		//2nd char
		int q=r.nextInt(2);
		if(q==0) {
			
				char otp = (char)(65+r.nextInt(26));
				System.out.print(otp);
		}
		else {
				char otp = (char)(97+r.nextInt(26));
				System.out.print(otp);
		}
		//3rd digit numeric
		System.out.print(r.nextInt(10));
		
		//4th char
		int qq=r.nextInt(2);
		if(qq==0) {
				char otp = (char)(65+r.nextInt(26));
				System.out.print(otp);
		}
		else {
				char otp = (char)(97+r.nextInt(26));
				System.out.print(otp);
		}
		
		//rest two digit numeric
		for(int i=1;i<=2;i++) {
		int otp = r.nextInt(10);
		System.out.print(otp);
		}

	}

}
