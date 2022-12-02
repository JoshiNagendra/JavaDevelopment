package jdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class Delete {
	public void deleteData() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name to delete the details");
		String name = sc.next();
		String url = "jdbc:mysql://localhost:3306/javademo";
		String Username = "root";
		String Password = "admin";
		name ="'"+name+"'";
		

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(url, Username, Password);
			if (connection != null) {
				statement = connection.createStatement();
				if (statement != null) {
					String deleteQuery= "delete from cricketteam where sname='Joshi'";
					result =statement.executeUpdate(deleteQuery);
					//String insertSqlQuery = "insert into student(`sname`,`sage`,`saddr`) values ('nitin',29,'RCB')";
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
			

		}
	
	}

}
