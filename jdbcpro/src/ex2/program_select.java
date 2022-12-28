package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.dongpil.app.entity.Emp;

public class program_select {

	public static void main(String[] args) throws Exception{
		
		
		
		String url = "jdbc:oracle:thin:@182.237.126.19:1521/xe";
		String selectsql = 
				"select * from emp";	
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"jdeveloper25","jdeveloper25");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(selectsql);
		
		
		while(rs.next()) {
			String ename = rs.getString("ename");
			String empno = rs.getString("empno");
			int sal = rs.getInt("sal");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int comm = rs.getInt("comm");
			int deptno = rs.getInt("deptno");
			
			
			System.out.println(ename+"\t"+empno+"\t"+sal);
			
		}
		
		
		
		
		
		rs.close();
		st.close();
		con.close();
		
			
			
			
			
	}

}
