package com.itwill.member.test;

import javax.swing.JOptionPane;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception {
		MemberService memberService = new MemberService();
		
		System.out.println("1.회원가입");
	boolean add1=
			memberService.addMember(new Member("xxxx","xxx","엑스","경기도",30,"F",null));
	if(add1) {
		System.out.println("로그인화면이동");
	}else {
		JOptionPane.showMessageDialog(null, "중복아이디");
	}
	
	
	
	
	boolean add2 = 
			memberService.addMember(new Member("bbbb","bbbb","비비","경기도",30,"F",null));
	
	if(add2) {
		System.out.println("로그인화면이동");
	}else {
		JOptionPane.showMessageDialog(null, "중복아이디");
	}
	System.out.println("2.login");
	System.out.println(memberService.login("bbbb", "1234"));
	
	
	
	
	
	

}
}
