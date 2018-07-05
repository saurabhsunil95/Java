import java.util.Scanner;

public class AC {
	String brand;
	int cost;
	
	void inputAcInfo() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input AC brand :: ");
		brand = s.next();
		
		System.out.print("Input AC cost :: ");
		cost = s.nextInt();
	}
	
	void displayAcInfo() {
		System.out.println("Brand :: "+brand);
		System.out.println("Cost :: "+cost);
	}

	public static void main(String[] args) {
		AC a1 = new AC();
		a1.inputAcInfo();
		a1.displayAcInfo();

	}

}
