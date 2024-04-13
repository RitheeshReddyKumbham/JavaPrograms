// Program to perform insert,update,delete and select operations in mysql using Statement method 

import java.sql.*;
public class tesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/peters";
		String uname="root";
		String pwd="ritheesh@96#";  
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection(url,uname,pwd);
		DatabaseMetaData d=c.getMetaData();
		System.out.println(d.getDatabaseProductName()+" "+d.getDatabaseProductVersion()+" "+d.getDriverName()+" "+d.getUserName());
		Statement s=c.createStatement();
		String sqlInsertQuery = "insert into Student(stu_id,stud_name,marks,skills) values(4,'sravan',89,'java')";
		String sqlUpdateQuery = "update Student set marks=86 where stud_name='sravan'";
		String sqlDeleteQuery = "delete from Student where marks=89";
        
        s.executeUpdate(sqlUpdateQuery);
        s.executeUpdate(sqlInsertQuery);
        s.executeUpdate(sqlDeleteQuery);
        ResultSet rs=s.executeQuery("select * from Student");
		while(rs.next()){
		int id=rs.getInt("stu_id");
		String name=rs.getString("stud_name");
		int marks=rs.getInt("marks");
		String skill=rs.getString("skills");
        
		System.out.println(id +" "+name+" "+marks+" "+skill);
		}
		rs.close();
		s.close();
		c.close();
		}
		catch (Exception e){
		System.out.println(e);
		}

	}

}

