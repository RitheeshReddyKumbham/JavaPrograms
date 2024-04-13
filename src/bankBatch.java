// Program to implement add batch method

import java.sql.*;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class bankBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/peters";
		String uname="root";
		String pwd="ritheesh@96#";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
		ds.setUrl(url);
		ds.setUser(uname);
		ds.setPassword(pwd);
		Connection c=ds.getConnection();
		c.setAutoCommit(false);
		Statement stmt=c.createStatement();
		stmt.addBatch("insert into bank values('manoj',5700)");
		stmt.addBatch("insert into bank values('raju',6000)");
		stmt.executeBatch();
		c.commit();
        ResultSet rs=stmt.executeQuery("select * from bank");
		while(rs.next()){
		String name=rs.getString("acc_name");
		int balance=rs.getInt("acc_balance");
	
        
		System.out.println(name+" "+balance);
		}
		rs.close();
	
		c.close();
		}
		catch (Exception e){
		System.out.println(e);
		}

	}

}

