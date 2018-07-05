import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseUpdate {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/assignment";
		String user = "root";
		String pass = "9534598529";
		
		try {
			Connection co = DriverManager.getConnection(url,user,pass);
			
			Statement st = co.createStatement();
			
			String sql = "update students "
					+ "set name='rahul',std ='12th' "
					+ "where roll=1";
			st.executeUpdate(sql);
			System.out.println("data updated ");
		} catch (Exception e) {
			System.out.println("exception "+e);
		}

	}

}
