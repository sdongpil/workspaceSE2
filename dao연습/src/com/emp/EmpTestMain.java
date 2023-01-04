package com.emp;

public class EmpTestMain {
	public static void main(String[] args) throws Exception {
		
		EmpDao empdao = new EmpDao();
		
		Emp insert  = new Emp(20, "철수", "목수", 500, null, 3000, 50, 20);
		System.out.println(empdao.insert(insert));
	}

}
