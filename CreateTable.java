
import java.sql.*;

import javax.swing.*;

public class CreateTable {

	public static void main(String[] args) {
		try {
			//load driver class
			Class.forName("com.mysql.jdbc.Driver");
			
			//get connection
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/july", "root", "9534598529");
			
			//get statement
			Statement st = co.createStatement();
			
			//execute sql statement
			int r = st.executeUpdate("create table person (name varchar(100),age int,city varchar(100))");
			
			System.out.println("table created "+r);
			//close connection
			co.close();
			
		} catch (Exception e) {
			System.out.println("exception  "+e);
		}
	}

}
