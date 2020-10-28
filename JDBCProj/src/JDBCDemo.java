import java.sql.*;
public class JDBCDemo {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/db_student","root","1234");  
		//here test_schema is database name, root is username and password is 1234 
		//Ref URL :https://www.javatpoint.com/example-to-connect-to-the-mysql-database 
		int id=4;
		String S_firstname="Gunddu";
		String S_lastname="M";
		long S_phno=998844;
		
		String query="insert into tb_studentdetails values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(query); 
		stmt.setInt(1,id);
		stmt.setString(2,S_firstname);
		stmt.setString(3,S_lastname);
		stmt.setLong(4,S_phno);
		int count =stmt.executeUpdate();  
		 
		System.out.println(count+" rows Affected");  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
	
	
	/*//Another way of  Insertion data process (using PreparedStaement)
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/test_schema","root","1234");  
		//here test_schema is database name, root is username and password is 1234 
		//Ref URL :https://www.javatpoint.com/example-to-connect-to-the-mysql-database 
		int rollno=6;
		String username="kaleen";
		
		String query="insert into test_table values(?,?)";
		PreparedStatement stmt=con.prepareStatement(query); 
		stmt.setInt(1,rollno);
		stmt.setString(2,username);
		int count =stmt.executeUpdate();  
		 
		System.out.println(count+" rows Affected");  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
	
	
	*/
	
	/*//Basic Insertion data process (using statement)
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test_schema","root","1234");  
	//here test_schema is database name, root is username and password is 1234 
	//Ref URL :https://www.javatpoint.com/example-to-connect-to-the-mysql-database 
	Statement stmt=con.createStatement();  
	int count =stmt.executeUpdate("insert into test_table values(5,'Azeez')");  
	 
	System.out.println(count+" rows Affected");  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	
	*/
	
	
	/*  Select query mean DQL
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.cj.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/test_schema","root","1234");  
	//here test_schema is database name, root is username and password is 1234 
	//Ref URL :https://www.javatpoint.com/example-to-connect-to-the-mysql-database 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from test_table where rollno=1");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
	 
	*/
	
/*//telusukoo code
	public static void main(String[] args)throws Exception {
		String url="jdbc:mysql://localhost:3306//test_schema";
		String uname="root";
		String pass="1234";
		String query="select Name from test_table where rollid=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        rs.next();
        String name=rs.getString("Name");
        
        System.out.println(name);
        
        st.close();
        con.close();
	}
*/
}
