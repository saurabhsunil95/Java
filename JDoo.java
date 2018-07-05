
import java.util.Scanner;


public class JDoo extends Doo {
	int r;
	String s;
	void inputValue() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("enter value of p");
		super.p = s1.nextInt();
		System.out.println("enter value of q");
		super.q = s1.next();
		System.out.println("enter value of r");
		r = s2.nextInt();
		System.out.println("enter value of s");
		s = s2.next();
	}
	void show() {
		System.out.println("value of p = "+super.p+"\n"
				+ "value of q = "+super.q+"\n"
						+ "value of r = "+r+"\n"
								+ "value of s = "+s);
	}
	void swapString() {
		String temp = super.q;
		super.q = s;
		s = temp;
		System.out.println("string is swapped");
	}
	void showIntValue() {
		System.out.println("value of p + "+super.p+"\n"
				+ "value of r = "+r);
	}
	void showString() {
		System.out.println("value of q = "+super.q+"\n"
				+ "value of s = "+s);
	}
	void showMaxInt() {
		if(super.p>=r)
			System.out.println("max value of int is = "+super.p);
		else System.out.println("max value of int is = "+r);
	}
	void fullString() {
		String temp = super.q+" "+s;
		System.out.println("full string is  = "+temp);
	}
	void swapIntValue() {
		int temp = super.p;
		super.p = r;
		r = temp;
		System.out.println("int value is swapped");
	}

}
