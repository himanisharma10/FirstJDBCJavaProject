import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { // Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// creating a connection
			String url = "jdbc:mysql://localhost:3306/datascience";
			String username = "root";
			String password = "password";
			Connection con = DriverManager.getConnection(url, username, password);

			// creating a query
			Statement selectStmt = con.createStatement();
			ResultSet rs = selectStmt
					.executeQuery("SELECT emp_id, emp_name, emp_dept from datascience.employee1 "
							+ " where emp_dept ='CSE' ");
			while (rs.next()) {
				System.out.println(rs.getInt(1)); // First Column
				System.out.println(rs.getString(2)); // Second Column
				System.out.println(rs.getString(3)); // Third Column
				
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
