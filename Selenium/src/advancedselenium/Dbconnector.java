package advancedselenium;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

class Dbconnector{

public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
	//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
    String dbUrl = "jdbc:mysql://localhost:3306/emp";					

	//Database Username		
	String username = "root";	
    
	//Database Password		
	String password = "raj9342300269";				

	//Query to Execute		
	String query = "select *  from employee;";	
    
	    //Load mysql jdbc driver		
	    Class.forName("com.mysql.jdbc.Driver");			

		//Create Connection to DB		
	Connection con = (Connection) DriverManager.getConnection(dbUrl,username,password);

		//Create Statement Object		
   Statement stmt = (Statement) con.createStatement();					

		// Execute the SQL Query. Store results in ResultSet		
		ResultSet rs= stmt.executeQuery(query);							

		// While Loop to iterate through all data and print results		
	while (rs.next()){
        		String myName = rs.getString(2);								        
                String myAge = rs.getString(3);					                               
                System. out.println(myName+"  "+myAge);		
        }		
		 // closing DB Connection		
		con.close();			
}
}