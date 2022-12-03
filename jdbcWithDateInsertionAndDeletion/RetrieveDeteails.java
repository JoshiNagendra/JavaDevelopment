package jdbcWithDateInsertionAndDeletion;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class RetrieveDeteails {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		System.out.println("Welcome to jdbc application");
		System.out.println("----------------------------------------------------------");
		String query="select name,address,gender,dob,doj from employeedetails";
		try {
			connection =JdbcUtil.getConnection();
			if(connection !=null) {
				statement =connection.prepareStatement(query);
			}
			if(statement!=null) {
				result =statement.executeQuery();
			}
			if(result !=null) {
				System.out.println("| Name\tAddress\t\tGender\tDob\t\tDoj       |");
				System.out.println("-----------------------------------------------------------");
				while(result.next()) {
					String name=result.getString(1);
					String address =result.getString(2);
					String gender=result.getString(3);
					Date d1=result.getDate(4);
					Date d2 =result.getDate(5);
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String dob = sdf.format(d1);
					String doj = sdf.format(2);
					System.out.println(name+"\t"+address+"\t"+gender+"\t"+d1+"\t"+d2); 
				}
				System.out.println();
				System.out.println("Thank you for using this application ");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception f) {
			f.printStackTrace();
		}finally {
			JdbcUtil.closeConnection(connection, statement, result);
		}
	}

}
