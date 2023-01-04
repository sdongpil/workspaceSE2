package com.emp;
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
public class EmpSql{

	public static final String EMP_INSERT = "insert into emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) values (?,?,?,?,?,?,?,?)";
			            

	public static final String EMP_UPDATE = "update emp set empno = ?,ename = ?,job =?,mgr = ?,hiredate =?,sal =?,comm = ?,deptno= ? where empno =?";

	public static final String EMP_DELETE = "delete from emp where empno =?";
	public static final String EMP_SELECT_BY_ID = "select * from emp where empno =?";
	public static final String EMP_SELECT_ALL = "select * from emp ";

}

	
	


