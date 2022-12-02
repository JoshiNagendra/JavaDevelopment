package jdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) throws SQLException {
	     Connection connection = null;
	     PreparedStatement statement = null;
	     ResultSet result = null;
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the sid");
	     int sid = sc.nextInt();
	     String query = "select sid,sname,sage,steam from cricketteam where sid =?";
	     
	      try {
	    	  connection=util.JdbcUtil.getConnection();
	    	  if(connection != null) {
	    		  statement =connection.prepareStatement(query);
	    	  }
	    		  if(statement != null) {
	    			 statement.setInt(1, sid);
	    			 result =statement.executeQuery();
	    		  }
	    		  if(result != null) {
	    			  if (result.next()) {
	  					System.out.println("SID\tSNAME\tSAGE\tSADDR");
	  					System.out.println(result.getInt(1) + "\t" + result.getString(2) + "\t" + result.getInt(3)
	  							+ "\t" + result.getString(4));
	  				} else {
	  					System.out.println("Record not available for the given id:: " + sid);
	  				}
	    		  }
	    	  
	      }catch(SQLException e) {
	    	  e.printStackTrace();

	      }catch(Exception f) {
	    	  f.printStackTrace();
	      }finally {
	    	  if(sc != null) {
	    		  sc.close();
	    	  }
	    	  util.JdbcUtil.closeConnection(result, statement, connection);
	      }
	}
}


