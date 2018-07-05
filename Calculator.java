import java.util.Scanner;

public class Calculator {
	int num1,num2,result;
	String operation;
	
	void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data :: ");
		System.out.print("Num1 :: ");
		num1 = sc.nextInt();
		System.out.print("Num2 :: ");
		num2 = sc.nextInt();
	}
	void add() {
		result = num1+num2;
		operation ="Addition ";
	}
	void sub() {
		result = num1-num2;
		operation ="Subtraction ";
	}
	void mul() {
		result = num1*num2;
		operation ="Multiplication ";
	}
	void div() {
		if(num2!=0) {
			result = num1/num2;
			operation ="Subtraction ";
		}
	}
	void showResult() {
		System.out.println(operation+" of "+num1+" and "+num2+" is "+result);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.inputNumber();
		c.add();
		c.showResult();
		c.sub();
		c.showResult();
		c.mul();
		c.showResult();
		c.div();
		c.showResult();

	}

}
