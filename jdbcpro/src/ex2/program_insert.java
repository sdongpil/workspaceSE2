package ex2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class program_insert {

	public static void main(String[] args) throws Exception{
		
		
		
		String url = "jdbc:oracle:thin:@182.237.126.19:1521/xe";
		String insertsql = 
				"insert into emp values(1,'kim','stu',15,'1994-06-16',1500,200,20)";
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con = DriverManager.getConnection(url,"jdeveloper25","jdeveloper25");
		Statement st = con.createStatement();
		int rs = st.executeUpdate(insertsql);
		
		
		
		
		System.out.println(rs );
		st.close();
		con.close();
			
			
			
			
			
	}

}
