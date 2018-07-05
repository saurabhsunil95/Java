import java.util.Scanner;

public class Employee {
	int id;
	float salary;
	String name,desig,email,tech;
	float bs,H,T,D,P,grossM,grossY;
	
	void inputEmployeeInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("# Enter Employee Information #");
		System.out.print("Name :: ");
		name = sc.nextLine();
		System.out.print("ID :: ");
		id = sc.nextInt();
		System.out.print("Designation :: ");
		desig = sc.next();
		System.out.print("Salary :: ");
		salary = sc.nextFloat();
		System.out.print("Email Id :: ");
		email = sc.next();
		System.out.print("Technology :: ");
		tech = sc.next();
		
		bs=salary;
		if(bs<10000) {
			H=(10*bs)/100;
			T=(9*bs)/100;
			D=(8*bs)/100;
			P=(7*bs)/100;
			grossM=(H+T+D+P+bs);
			grossY=(H+T+D+P+bs)*12;
		}
		else if(bs>=10000&&bs<20000) {
			H=(12*bs)/100;
			T=(11*bs)/100;
			D=(10*bs)/100;
			P=(9*bs)/100;
			grossM=(H+T+D+P+bs);
			grossY=(H+T+D+P+bs)*12;
		}
		else if(bs>=20000&&bs<30000) {
			H=(14*bs)/100;
			T=(13*bs)/100;
			D=(12*bs)/100;
			P=(11*bs)/100;
			grossM=(H+T+D+P+bs);
			grossY=(H+T+D+P+bs)*12;
		}
		else if(bs>=30000&&bs<40000) {
			H=(16*bs)/100;
			T=(15*bs)/100;
			D=(14*bs)/100;
			P=(13*bs)/100;
			grossM=(H+T+D+P+bs);
			grossY=(H+T+D+P+bs)*12;
		}
		else if(bs>=40000) {
			H=(18*bs)/100;
			T=(17*bs)/100;
			D=(16*bs)/100;
			P=(15*bs)/100;
			grossM=(H+T+D+P+bs);
			grossY=(H+T+D+P+bs)*12;
		}
	}
	
	void printSalarySlip() {
		
		System.out.println("\n------------------------------------------------------");
		System.out.println("#SALARY SLIP FOR ID#"+id+"#");
		System.out.println("Name :: "+name);
		System.out.println("Designation :: "+desig);
		System.out.println("Email :: "+email);
		System.out.println("Technology :: "+tech);
		System.out.println("Basic Salary :: "+bs+" INR");
		System.out.println("HRA :: "+H+" INR");
		System.out.println("TA :: "+T+" INR");
		System.out.println("DA :: "+D+" INR");
		System.out.println("PF :: "+P+" INR");
		System.out.println("Gross Salary Per Month :: "+grossM+" INR");
		System.out.println("Gross Salary Per Year :: "+grossY+" INR");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.inputEmployeeInfo();
		e.printSalarySlip();

	}

}
