package com.itwill.shop.user.test;

public class ExamTest {

	public static void main(String[] args) {
			
		String[]  a = {"a,b,c,d,e,f,g,h,i,"};
		String ab ="abcdefg123456";
		String s = "Az1";
		
		
		
		for(int i = 0 ; i < s.length(); i++) {
	     	System.out.println(s.matches(".*[a-z].*"));
	     	System.out.println(s.matches(".*[A-Z].*"));
			
		}
		
	}

}
