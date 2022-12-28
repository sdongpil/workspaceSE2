package com.dongpil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.dongpil.app.entity.Emp;

public class EmpService {

	public List<Emp> getlist() throws Exception{

		
		
	
				
				String url = "jdbc:oracle:thin:@182.237.126.19:1521/xe";
				String selectsql = 
						"select * from emp";	
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url,"jdeveloper25","jdeveloper25");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(selectsql);
				
				List<Emp> list = new ArrayList<Emp>();
				
				while(rs.next()) {
					String ename = rs.getString("ename");
					String empno = rs.getString("empno");
					int sal = rs.getInt("sal");
					String job = rs.getString("job");
					int mgr = rs.getInt("mgr");
					int comm = rs.getInt("comm");
					int deptno = rs.getInt("deptno");
					
					Emp emp = new Emp(
							ename,empno,sal,job,mgr,comm,deptno
							);
					
					list.add(emp);
					
					
				}
				
				
				rs.close();
				st.close();
				con.close();
		
			
				 return list;
				
				 
	}
	
	
	public int insert(Emp emp) throws SQLException, ClassNotFoundException {
		int empno = emp.getEmpno();
		String ename = emp.getEname();
		String job = emp.getJob();
		int mgr = emp.getMgr();
		
		
		
		String url = "jdbc:oracle:thin:@182.237.126.19:1521/xe";
		String insertsql = 
				"insert into emp values(empno,ename,job,15,'1994-06-16',1500,200,20)";
		Class.forName("oracle.jdbc.driver.OracleDriver");	
		Connection con = DriverManager.getConnection(url,"jdeveloper25","jdeveloper25");
		Statement st = con.createStatement();
		int rs = st.executeUpdate(insertsql);
		
		
		
		
		System.out.println(rs );
		st.close();
		con.close();
		
		return  rs;
	}
	
	public int update(Emp emp) {
		return 0 ;
	}
	
	public int delete(int ename) {
		return 0 ;
	}
	
}


