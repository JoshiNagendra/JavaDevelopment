package jdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample2 {
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		PreparedStatement pstmt = null;
		System.out.println("Enter the details to insert inta databse");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int sid = sc.nextInt();
		System.out.println("Enter the name");
		String sname = sc.next();
		System.out.println("Enter the sge ");
		int sage = sc.nextInt();
		System.out.println("Enter the team");
		String steam = sc.next();
		String Query ="insert into cricketteam (sid,sname,sage,steam) values(?,?,?,?)";
		
		try {
			connection=util.JdbcUtil.getConnection();
			if (connection !=null) {
				pstmt =connection.prepareStatement(Query);
			}
			if (pstmt!= null) {
				pstmt.setInt(1, sid);
				pstmt.setString(2,sname);
				pstmt.setInt(3, sage);
				pstmt.setString(4, steam);
				int noOfRowsE =pstmt.executeUpdate();
				System.out.println(noOfRowsE);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception f) {
			f.printStackTrace();
		}finally {
			if(sc!=null) {
				sc.close();
			}
			util.JdbcUtil.closeConnection(null, pstmt, connection);
		}
	}

}

