//Program to implement callable statement and  getting more data about table

import java.sql.*;
public class callstmt {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/peters";
		String uname="root";
		String pwd="ritheesh@96#";  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection(url,uname,pwd);
		DatabaseMetaData d=c.getMetaData();
		System.out.println(d.getDatabaseProductName()+" "+d.getDatabaseProductVersion()+" "+d.getDriverName()+" "+d.getUserName());
	    CallableStatement cs=c.prepareCall("{call DML_OPS1()}");
	    cs.execute();
        ResultSet rs=cs.executeQuery("select * from Student");
		while(rs.next()){
		int id=rs.getInt("stu_id");
	 	String name=rs.getString("stud_name");
		int marks=rs.getInt("marks");
		String skill=rs.getString("skills");
        
		System.out.println(id +" "+name+" "+marks+" "+skill);
		}
		rs.close();
		c.close();
		

	}

}

