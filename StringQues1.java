import java.util.Scanner;

public class StringQues1 {

	public static void main(String[] args) {
		int id[] = {1,2,3,4,5};
		String product[] = {"TV","AC","MOBILE","SHOES","FAN"};
		float cost[] = {10000.0f,25000.0f,12000.0f,2500.0f,6000.0f};
		int quantity[] = {15,10,7,25,20};
		
		System.out.print("Enter product id :: ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=0;
		for (int i = 0; i < id.length; i++) {
			if(n==id[i]) {
				System.out.println("Id :: "+id[i]);
				System.out.println("Product :: "+product[i]);
				System.out.println("Cost :: "+cost[i]);
				System.out.println("Quantity :: "+quantity[i]);
				q=1;
				break;
			}
		}
		if(q==0)
			System.out.println("Invalid product Id!!");

	}

}
