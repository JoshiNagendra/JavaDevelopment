package jdbcWithDateInsertionAndRetrieval;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	private JdbcUtil() {
		
	}
	public static Connection getConnection() throws SQLException {
		Connection connection =null;
		String url = "jdbc:mysql://localhost:3306/javademo";
		String Username = "root";
		String Password = "admin";
        connection =DriverManager.getConnection(url, Username, Password);
        return connection;
	}
	public static void closeConnection(Connection connection,Statement statement,ResultSet result) throws SQLException {
		if(result!=null) {
			result.close();
		}
		if(statement !=null) {
			statement.close();
		}
		if(connection !=null) {
			connection.close();
		}
		
	}

}
