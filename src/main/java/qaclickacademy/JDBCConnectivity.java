package qaclickacademy;
import java.sql.*;

/*
1.import java.sql
2.load and register the driver->com.mysql.jdbc.Driver
3.Create connection
4.Create a statement
5.Execute the query
6.Process the results
7.Close


*/
public class JDBCConnectivity {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/abc";
		String uname="root";
		String pass="12345";
		String query="select * from abc.student";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, uname, pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
		String name=rs.getString("sname");
		String roll=rs.getString("rollno");
		
		System.out.println("Name is: "+name+" Roll is: "+roll);
		}
		
		st.close();
		con.close();
	}

}
