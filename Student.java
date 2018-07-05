import java.util.Scanner;

public class Student {
	String name,std,grade,feedback;
	int roll,hindi,english,maths,physics,chemistry,total;
	float percentage;
	
	public static void main(String[] args) {
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name of student:: ");
		s.name = sc.nextLine();
		System.out.print("Enter Roll no of student:: ");
		s.roll = sc.nextInt();
		System.out.print("Enter class of student:: ");
		s.std = sc.next();
		System.out.print("Enter marks of HINDI subject:: ");
		s.hindi = sc.nextInt();
		System.out.print("Enter marks of ENGLISH subject:: ");
		s.english = sc.nextInt();
		System.out.print("Enter marks of MATHS subject:: ");
		s.maths = sc.nextInt();
		System.out.print("Enter marks of PHYSICS subject:: ");
		s.physics = sc.nextInt();
		System.out.print("Enter marks of CHEMISTRY subject:: ");
		s.chemistry = sc.nextInt();
		
		
		if(s.hindi<0||s.hindi>100)
			s.hindi = 0;
		if(s.english<0||s.english>100) {
			s.english = 0;
		}
		if(s.maths<0||s.maths>100) {
			s.maths = 0;
		}
		if(s.physics<0||s.physics>100) {
			s.physics = 0;
		}
		if(s.chemistry<0||s.chemistry>100) {
			s.chemistry = 0;
		}
		
		
		s.total = (s.hindi + s.chemistry + s.english + s.maths + s.physics);
		s.percentage = s.total/5;
		
		//Grade
		if(s.percentage<50.0) {
			s.grade = "FAIL";
			s.feedback = "Do hard work and try to score atleast D grade next time";
		}
		else if(s.percentage>=50.0&&s.percentage<60.0) {
			s.grade = "D";
			s.feedback = "Do hard work and try to score atleast C grade next time";
		}
		else if(s.percentage>=60.0&&s.percentage<70.0) {
			s.grade = "C";
			s.feedback = "Do hard work and try to score atleast B grade next time";
		}
		else if(s.percentage>=70.0&&s.percentage<80.0) {
			s.grade = "B";
			s.feedback = "Do hard work and try to score atleast A grade next time";
		}
		else if(s.percentage>=80.0&&s.percentage<90.0) {
			s.grade = "A";
			s.feedback = "Good work and try to score atleast A+ grade next time";
		}
		else if(s.percentage>=90.0&&s.percentage<=100.0) {
			s.grade = "A+";
			s.feedback = "Well done... keep going on";
		}
		System.out.println();
		System.out.println("OUTPUT:::: ");
		System.out.println();
		System.out.println("Student name :: "+s.name);
		System.out.println("Roll no :: "+s.roll);
		System.out.println("Class :: "+s.std);
		System.out.println("Student Subjects marks");
		System.out.println("	HINDI :: "+s.hindi);
		System.out.println("	ENGLISH :: "+s.english);
		System.out.println("	MATHS :: "+s.maths);
		System.out.println("	PHYSICS :: "+s.physics);
		System.out.println("	CHEMISTRY :: "+s.chemistry);
		System.out.println();
		System.out.println("Total Marks :: "+ s.total);
		System.out.println("Percentage ::   "+s.percentage);
		System.out.println("Grade :: "+ s.grade);
		System.out.println("Remark ::"+ s.feedback);
	}

}
