package jdbcStatement;

import java.sql.SQLException;
import java.util.Scanner;

public class TestApp {
	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to JDBC operations");
		System.out.println("****************************");
		System.out.println("You hava four options to choose");
		System.out.println("--------------------------------");
		System.out.println("1 - Create");
		System.out.println("2 - Update");
		System.out.println("3 - Delete");
		System.out.println("4 - Read");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any option in int format ::");
		int option = sc.nextInt();
		if(option==1) {
			Insert i = new Insert();
			i.InsertData();
		}else if(option ==2) {
			Update u = new Update();
			u.updateData();
		}else if(option ==3) {
			Delete d = new Delete();
			d.deleteData();
		}else if(option ==4) {
			Read r = new Read();
			r.getData();
		}
		System.out.println();
		System.out.println("Thank you for using");
	}

}
