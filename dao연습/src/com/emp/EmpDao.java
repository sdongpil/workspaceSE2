package com.emp;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;


/*
 * 이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)   
 */

public class EmpDao {
	
	
	DataSource datasource;
	
	public EmpDao() throws Exception {
		datasource = new DataSource();
	}
	
	public int insert(Emp emp) throws Exception {
		Connection con = datasource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(EmpSql.EMP_INSERT);
		
		pstmt.setInt(1, emp.getEmpno());
		pstmt.setString(2, emp.getEname());
		pstmt.setString(3, emp.getJob());
		pstmt.setInt(4, emp.getMgr());
		pstmt.setDate(5, (Date) emp.getHiredate());
		pstmt.setInt(6, emp.getSal());
		pstmt.setInt(7, emp.getCommon());
		pstmt.setInt(8, emp.getDeptno());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		datasource.close(con);
		
	
		
		
		return rowCount;
		
	}

}
