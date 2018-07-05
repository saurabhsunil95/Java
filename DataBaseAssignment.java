import java.util.Scanner;
import java.sql.*;


public class DataBaseAssignment {
	public static void main(String[] args) {
		String name,std,grade = null,feedback = null;
		int roll,hindi,english,maths,physics,chemistry,total;
		float percentage;
		boolean q = true;

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		while(q) {
		System.out.print("Enter Roll no of student:: ");
		roll = sc.nextInt();
		System.out.print("Enter name of student:: ");
		name = sc.next();
		System.out.print("Enter class of student:: ");
		std = sc1.next();
		System.out.print("Enter marks of PHYSICS subject:: ");
		physics = sc1.nextInt();
		System.out.print("Enter marks of CHEMISTRY subject:: ");
		chemistry = sc1.nextInt();
		System.out.print("Enter marks of MATHS subject:: ");
		maths = sc1.nextInt();
		System.out.print("Enter marks of HINDI subject:: ");
		hindi = sc1.nextInt();
		System.out.print("Enter marks of ENGLISH subject:: ");
		english = sc1.nextInt();
		
		
		if(hindi<0||hindi>100)
			hindi = 0;
		if(english<0||english>100) {
			english = 0;
		}
		if(maths<0||maths>100) {
			maths = 0;
		}
		if(physics<0||physics>100) {
			physics = 0;
		}
		if(chemistry<0||chemistry>100) {
			chemistry = 0;
		}
		
		
		total = (hindi + chemistry + english + maths + physics);
		percentage = total/5;
		
		//Grade
		if(percentage<50.0) {
			grade = "FAIL";
			feedback = "Do hard work and try to score atleast D grade next time";
		}
		else if(percentage>=50.0&&percentage<60.0) {
			grade = "D";
			feedback = "Do hard work and try to score atleast C grade next time";
		}
		else if(percentage>=60.0&&percentage<70.0) {
			grade = "C";
			feedback = "Do hard work and try to score atleast B grade next time";
		}
		else if(percentage>=70.0&&percentage<80.0) {
			grade = "B";
			feedback = "Do hard work and try to score atleast A grade next time";
		}
		else if(percentage>=80.0&&percentage<90.0) {
			grade = "A";
			feedback = "Good work and try to score atleast A+ grade next time";
		}
		else if(percentage>=90.0&&percentage<=100.0) {
			grade = "A+";
			feedback = "Well done... keep going on";
		}
		System.out.println();
		System.out.println("OUTPUT:::: ");
		System.out.println();
		System.out.println("Student name :: "+name);
		System.out.println("Roll no :: "+roll);
		System.out.println("Class :: "+std);
		System.out.println("Student Subjects marks");
		System.out.println("	HINDI :: "+hindi);
		System.out.println("	ENGLISH :: "+english);
		System.out.println("	MATHS :: "+maths);
		System.out.println("	PHYSICS :: "+physics);
		System.out.println("	CHEMISTRY :: "+chemistry);
		System.out.println();
		System.out.println("Total Marks :: "+ total);
		System.out.println("Percentage ::   "+percentage);
		System.out.println("Grade :: "+ grade);
		System.out.println("Remark ::"+ feedback);
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment", "root", "9534598529");
			Statement st = co.createStatement();
			int r = st.executeUpdate("insert into students"
					+ "(roll,name,std,physics,chemistry,maths,hindi,english,total,percentage,grade,remark) values"
					+ " ('"+roll+"','"+name+"','"+std+"','"+physics+"',"
					+ "'"+chemistry+"','"+maths+"','"+hindi+"','"+english+"','"+total+"','"+percentage+"',"
							+ "'"+grade+"','"+feedback+"')");
			
			System.out.println("data inserted "+r);
			co.close();
			
		} catch (Exception e) {
			System.out.println("exception  "+e);
		}
		
		System.out.println("Do you want to enter more data if yes then type yes");
		String s =sc.next();
		if(s.equals("yes")!=true)
			q=false;
		}

	}

}
