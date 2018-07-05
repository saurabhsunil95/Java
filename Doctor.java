import java.util.Scanner;

public class Doctor {
	String name,spec,hospital;
	float exp;
	int fee;
	
	void inputDocInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter doctor informtion :: ");
		System.out.print("Name :: ");
		name = sc.next();
		System.out.print("Spec. :: ");
		spec = sc.next();
		System.out.print("Exp. :: ");
		exp = sc.nextFloat();
		System.out.print("Fee :: ");
		fee = sc.nextInt();
		System.out.print("Hospital Name :: ");
		hospital = sc.next();
	}
	
	void printDocInfo() {
		System.out.println();
		System.out.println("#DOCTOR INFORMATION#");
		System.out.println("Name :: "+name);
		System.out.println("Spec. :: "+spec);
		System.out.println("Exp. :: "+exp+" years");
		System.out.println("Fee :: "+fee+" INR");
		System.out.println("Hospital Name :: "+hospital);
		System.out.println("--------------------------------------");
	}
	public static void main(String[] args) {
		Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		
		d1.inputDocInfo();
		d2.inputDocInfo();
		d1.printDocInfo();
		d2.printDocInfo();
	}

}
