// Program as an example of sql injuction

import java.sql.*;
import java.util.*;
public class user {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/Table1";
		String uname="root";
		String pwd1="ritheesh@96#"; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		String user=sc.next();
		System.out.println("enter user password");
		String pass=sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection(url,uname,pwd1);
		Statement s=c.createStatement();
		String query1 = "select count(*) from users where userName = '"+user+"'and pwd='"+pass+"'";
		ResultSet rs1= s.executeQuery(query1);
	    rs1.next();
		System.out.println(rs1.getInt(1));
	    sc.close();
	}

}
