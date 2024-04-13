import java.sql.*;  
import java.io.*;  
public class InsertImage {  
public static void main(String[] args) {  
try{  
	String url="jdbc:mysql://localhost:3306/peters";
	String uname="root";
	String pwd="ritheesh@96#";  
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c= DriverManager.getConnection(url,uname,pwd);            
    PreparedStatement ps=c.prepareStatement("insert into imgtable values(?,?)");  
    ps.setString(1,"sonoo");  
  
    FileInputStream fin=new FileInputStream("C:\\Users\\K Ajay Reddy\\OneDrive\\Pictures\\Eren-1.webp");  
    ps.setBinaryStream(2,fin);  
    int i=ps.executeUpdate();  
    System.out.println(i+" records affected");  
          
    c.close();  
    }
    catch (Exception e) {
    e.printStackTrace();
    }  
}  
}  
