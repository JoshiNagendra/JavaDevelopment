package jdbcWithDateInsertionAndDeletion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InsertDetails {
	public static void main(String[] args) throws ParseException, SQLException {
		Connection connection=null;
		PreparedStatement statement = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to jdbc application");
		System.out.println("------------------------------");
		System.out.println("Enter the details to store in the database");
		System.out.println("```````````````````````````````````````````");
		System.out.println("Enter the name of the employee");
		String name = sc.next();
		System.out.println("Enter the address of th employee");
		String address = sc.next();
		System.out.println("Enter the gender");
		String gender = sc.next();
		System.out.println("Enter the date of birth");
		String dob = sc.next();
		System.out.println("Enter the date of joining");
		String doj = sc.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = sdf.parse(dob);
		long l=udate.getTime();
		java.sql.Date dob1 = new java.sql.Date(l);
		java.util.Date date=sdf.parse(doj);
		long l1 = date.getTime();
		java.sql.Date doj1 = new java.sql.Date(l1);
		String query ="insert into employeedetails (`name`,`address`,`gender`,`dob`,`doj`) values(?,?,?,?,?)";
		try {
			connection =JdbcUtil.getConnection();
			if(connection !=null) {
				statement =connection.prepareStatement(query);
			}
			if(statement !=null) {
				statement.setString(1, name);
				statement.setString(2,address);
				statement.setString(3, gender);
				statement.setDate(4, dob1);
				statement.setDate(5, doj1);
				int rowsAffected =statement.executeUpdate();
				System.out.println("Rows Affected :"+rowsAffected);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception f) {
			f.printStackTrace();
		}finally {
			JdbcUtil.closeConnection(connection, statement, null);
		}
		
	}

}
