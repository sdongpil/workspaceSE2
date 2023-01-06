package com.itwill.shop.user.test;

import javax.swing.JOptionPane;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception {

		UserService userService = new UserService();
		
		
		//회원가입중복체크
		User u = new User("dp", "115", "DNDN", "DK", "AL", "1123@");
		boolean add1 = userService.addUser(u);
		
		if(add1) {
			System.out.println("사용가능아이디");
		}else {
			System.out.println("중복된 아이디");
		}
		
		
		//로그인
		int a = userService.login("dp", "1215");
		if(a==0) {
			System.out.println("로그인성공");
		}else {
			if(a==1) {
				System.out.println("아이디 존재안함");
			}else if(a==2) {
				System.out.println("패스워드 불일치");
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
