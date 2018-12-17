package advancedselenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DataBaseConnectivity {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/emp";
		String usn="root";
		String pwd="manager";
		
		Class.forName("com.mysql.jdbc.Driver");
		
	    Connection con = DriverManager.getConnection(url, usn, pwd);
	    Statement stmt = con.createStatement();
	    ResultSet result = stmt.executeQuery("SELECT * FROM emp.transactions where transaction_amount > 1000");
	    
	    while(result.next())
	    {
		String str = result.getString(2);
		String str2 = result.getString(3);
		System.out.println(str);
		System.out.println(str2);
	    }
		
		con.close();	
		
	}

}
