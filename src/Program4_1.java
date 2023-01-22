import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program4_1 {

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
					+ "values('Ashish', 'Data Scrience');";
			
			
			// Create a statement:
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Data Inserted in table");
			con.close();
		
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}

}
