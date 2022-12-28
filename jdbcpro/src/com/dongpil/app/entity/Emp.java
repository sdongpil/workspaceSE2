package com.dongpil.app.entity;

public class Emp {
	private String ename ;
	private int empno ;
	private int sal ;
	private String job;
	private int mgr;
	private int comm;
	private int deptno;
	

	
	
	public Emp() {
		
	}
	
	
	
	public Emp(String ename, int empno, int sal, String job, int mgr, int comm, int deptno) {
		
		this.ename = ename;
		this.empno = empno;
		this.sal = sal;
		this.job = job;
		this.mgr = mgr;
		this.comm = comm;
		this.deptno = deptno;
	}



	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
}
