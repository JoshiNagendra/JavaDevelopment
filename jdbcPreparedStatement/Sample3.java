package jdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement pstmnt=null;
		ResultSet result=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name");
		String Username = sc.next();
		System.out.println("Enter the password ");
		String Password = sc.next();
		String query ="select count(*) from users where Username = ? and Password = ?";
		try {
			connection =util.JdbcUtil.getConnection();
			if(connection != null) {
				pstmnt =connection.prepareStatement(query);
				pstmnt.setString(1, Username);
				pstmnt.setString(2,Password);
				if(pstmnt !=null) {
					result=pstmnt.executeQuery();
					int count=0;
					if(result.next()) {
						count=result.getInt(1);
					}
					if(count==1) {
						System.out.println("Valid Credentials");
					}else {
						System.out.println("Invalid Credentials");
					}
				}
				
			}
		}catch(SQLException f) {
			f.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
			util.JdbcUtil.closeConnection(result, pstmnt, connection);
		}
	}

}
