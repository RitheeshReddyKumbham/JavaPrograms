//Program to perform prepared statment and using mysql connection pool

import java.sql.*;
import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class mysqlpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/peters";
		String uname="root";
		String pwd="ritheesh@96#";
		String query="Update bank set acc_balance=? where acc_name=?";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		MysqlConnectionPoolDataSource ds=new MysqlConnectionPoolDataSource();
		ds.setUrl(url);
		ds.setUser(uname);
		ds.setPassword(pwd);
		Connection c=ds.getConnection();
		c.setAutoCommit(false);
		PreparedStatement pstmt=c.prepareStatement(query);
		pstmt.setInt(1, 17000);
		pstmt.setString(2, "ravi");
		pstmt.executeUpdate();
		c.commit();
        ResultSet rs=pstmt.executeQuery("select * from bank");
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

