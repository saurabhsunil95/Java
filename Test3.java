import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a value 1:: ");
		float x=sc.nextFloat();
		System.out.println("enter a value 2:: ");
		float y=sc.nextFloat();
		System.out.println("#MENU#");
		System.out.println("Enter 1 for:ADD");
		System.out.println("enter 2 for: SUB");
		int z=sc.nextInt();
		if(z==1) {
			float sum=x+y;
			System.out.println("Addition :: "+sum);
		}
		else if(z==2) {
			 float sub=x-y;
			System.out.println("substraction :: "+sub);
		}
		else System.out.println("invalid!!!!");
	}

}
