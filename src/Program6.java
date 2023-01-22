import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program6 {
	
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
			
			String q = "update employee1 set emp_dept =? where emp_id = ?";
			
			
			// Create a statement:
			PreparedStatement stmt = con.prepareStatement(q);
			stmt.setString(1,"IT");
			stmt.setInt(2, 6);
			int i = stmt.executeUpdate();
			System.out.println(i+ " Record(s) Updated Successfully");
			con.close();
		
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}
}
