package com.emp;
import java.util.Date;

public class Emp {
	

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
	
		
		private int empno;
		private String ename;
		private String job;
		private int mgr;
		private Date hiredate;
		private int sal;
		private int common;
		private int deptno;
		
		
		public Emp() {
			
		}
		
		
		public Emp(int empno, String ename, String job, int mgr, Date hiredate, int sal, int common, int deptno) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.mgr = mgr;
			this.hiredate = hiredate;
			this.sal = sal;
			this.common = common;
			this.deptno = deptno;
		}
		

		public int getEmpno() {
			return empno;
		}

		public void setEmpno(int empno) {
			this.empno = empno;
		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public int getMgr() {
			return mgr;
		}

		public void setMgr(int mgr) {
			this.mgr = mgr;
		}

		public Date getHiredate() {
			return hiredate;
		}

		public void setHiredate(Date hiredate) {
			this.hiredate = hiredate;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}

		public int getCommon() {
			return common;
		}

		public void setCommon(int common) {
			this.common = common;
		}

		public int getDeptno() {
			return deptno;
		}

		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}

		@Override
		public String toString() {
			return "EmpSql [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
					+ hiredate + ", sal=" + sal + ", common=" + common + ", deptno=" + deptno + "]";
		}








		
		
		

}
