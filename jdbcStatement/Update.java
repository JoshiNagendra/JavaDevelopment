package jdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update {
	public void updateData() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		int result;
		String url = "jdbc:mysql://localhost:3306/javademo";
		String Username = "root";
		String Password = "admin";

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection(url, Username, Password);
			if (connection != null) {
				statement = connection.createStatement();
				if (statement != null) {
					String insertQuery = "update cricketteam set sage =10 where sid =1";
					result =statement.executeUpdate(insertQuery);
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
