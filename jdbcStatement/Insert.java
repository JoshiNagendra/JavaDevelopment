package jdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Insert {
	public void InsertData() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		int result;
		String url = "jdbc:mysql://localhost:3306/javademo";
		String Username = "root";
		String Password = "admin";
		
		System.out.println("Enter the details to insert the data into database");
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID");
        int sid = sc.nextInt();
        System.out.println("Enter the name");
        String sname = sc.next();
        System.out.println("Enter the age ");
        int sage=sc.nextInt();
        System.out.println("Enter the team now ");
        String steam = sc.next();
  
     

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(url, Username, Password);
			if (connection != null) {
				statement = connection.createStatement();
				if (statement != null) {
					//String insertQuery = "insert into cricketteam(`sid`,`sname`,`sage`,`steam`) values ("+sid+","+sname+","+sage+","+steam+")";
					String insertQuery = String.format("insert into cricketteam(`sid`,`sname`,`sage`,`steam`) values (%d,'%s',%d,'%s')",sid,sname,sage,steam);
					//String query =String.format( "insert into student(`sname`,`sage`,`saddr`) values ('%s',%d,'%s')",sname,sage,saddr );
					result =statement.executeUpdate(insertQuery);
					System.out.println("No of rows got effected :"+result);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(statement !=null) {
				statement.close();
			}
			if(connection != null) {
				connection.close();
			}
			if(sc != null) {
				sc.close();
			}
			

		}
	}

}
