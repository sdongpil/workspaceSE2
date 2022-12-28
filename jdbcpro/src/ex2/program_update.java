package ex2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class program_update {

	public static void main(String[] args) throws Exception{
		
		
		
		String url = "jdbc:oracle:thin:@182.237.126.19:1521/xe";
		String insertsql = 
				"update emp set empno = 9003,ename='이순',job='st',mgr =13,hiredate='1994-07-16',sal =150,comm = 50,deptno = 10 where ename= '이순신' ";
	            
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con = DriverManager.getConnection(url,"jdeveloper25","jdeveloper25");
		Statement st = con.createStatement();
		int rs = st.executeUpdate(insertsql);
		
		
		
		
		System.out.println(rs );
		st.close();
		con.close();
			
			
			
			
			
	}

}
