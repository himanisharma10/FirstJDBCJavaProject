import java.sql.*;
public class JDBC1 {

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
			
			if (con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else
			{
				System.out.println("connection created");
			}
			con.close();
		}
        catch(Exception e)
		{
        	e.printStackTrace();
		}
	}

}
