import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stubb
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3036/Employeedetails", "root", "Pass12!@");
		Statement Stm = conn.createStatement();
		  ResultSet Records = Stm.executeQuery("select * from Emplyeeinfo where Empid='Emp05'");
		  
		  Records.next();
		  System.out.println(Records.getString("Empid"));
		  System.out.println(Records.getString("Empname"));
		  System.out.println(Records.getString("empage"));
		  System.out.println(Records.getString("Department"));
		
		
		
		//jdbc:mysql://localhost:3036/Employeedetails
		

	}

}
