package jdbcStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Read {
	public void getData() throws SQLException {
		Connection connection = null;
		Statement  statement=null;
		ResultSet result=null;
	    
		 
		 try {
			 Driver driver = new Driver();
			 DriverManager.registerDriver(driver);
			 String url="jdbc:mysql://localhost:3306/javademo";
			 String Username ="root";
			 String password ="admin";
			 connection =DriverManager.getConnection(url,Username,password);
			 if(connection != null) {
				 statement =connection.createStatement();
				 if(statement !=null) {
					 String selectQuery ="select sid,sname,sage,steam from cricketteam";
					 result= statement.executeQuery(selectQuery);
					 if(result!=null) {

						 while(result.next()) {
							 int id =result.getInt("sid");
							 String name = result.getString("sname");
							 int age = result.getInt("sage");
							 String team = result.getString("steam");
							 System.out.println(id+"\t"+name+"\t"+age+"\t"+team); 
						 }
						 
					 }
				 }
				 
			 }
			 
			 
		 }catch(SQLException e){
			 e.printStackTrace();
			 
		 }
		 catch(Exception f) {
			 f.printStackTrace();
		 }
		 finally {
			 if(result != null) {
				 result.close();
			 }
			 if(statement !=null) {
				 result.close();
			 }
			 if(connection !=null) {
				 connection.close();
			 }
		 }
	
	}

}
