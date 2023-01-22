import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program4_2 {
	
	private static String EMP_NAME = "Rachit";
	private static String EMP_DEPT = "CSE";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{   //Load the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating a connection
			String url="jdbc:mysql://localhost:3306/datascience";
			String username ="root";
			String password="password";
			Connection con=DriverManager.getConnection(url,username,password);
			
		// creating a query
			
			String q = "insert into datascience.employee1(emp_name, emp_dept) "
					+ "values(?,?)";
			
			
			// Create a statement:
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setString(1,EMP_NAME);
			stmt.setString(2, EMP_DEPT);
			int i = stmt.executeUpdate();
			System.out.println(i+ " Record(s) Inserted in table");
			con.close();
		
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}
	
}
