
import java.sql.*;

public class Program2 {

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
			String q = "create table employee(emp_Id int(40) primary key auto_increment, "
					+ "emp_name varchar(200) not null, emp_dept varchar(400))";
			// Create a statement:
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			System.out.println("Table created in database");
			con.close();
			
		
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}

	}

