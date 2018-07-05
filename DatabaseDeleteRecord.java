import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseDeleteRecord {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/assignment";
		String user = "root";
		String pass = "9534598529";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection co = DriverManager.getConnection(url,user,pass);
			
			Statement st = co.createStatement();
			
			String sql = "delete from students "
					+ "where roll=11";
			int nora = st.executeUpdate(sql);
			System.out.println("record affected = "+nora);
			System.out.println("data deleted ");
		} catch (Exception e) {
			System.out.println("exception "+e);
		}

	}

}
