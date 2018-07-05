import java.sql.*;

import com.mysql.cj.protocol.Resultset;
public class DatabaseFetch {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/july5";
		String user = "root";
		String pass = "9534598529";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co = DriverManager.getConnection(url,user,pass);
			Statement st = co.createStatement();
			ResultSet rs = st.executeQuery("select * from car");
			int rc = 0;
			while(rs.next()) {
				//fetch all the columns from record
				String n = rs.getString("name");
				String m = rs.getString("maker");
				int i = rs.getInt("model");
				String cs = rs.getString("cost");
				rc++;
				System.out.println(n+" :: "+m+" :: "+i+" :: "+cs);
			}
			System.out.println("total record = "+rc);
		} catch (Exception e) {
			System.out.println("Execption "+e);
		}

	}

}
