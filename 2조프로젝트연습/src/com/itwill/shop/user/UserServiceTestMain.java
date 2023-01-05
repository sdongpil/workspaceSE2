package com.itwill.shop.user;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception {

		UserService userService = new UserService();
		
		
		//회원가입중복체크
		User add = new User("dp", "115", "DNDN", "DK", "AL", "1123@");
		boolean add1 = userService.addUser(add);
		
		if(add1) {
			System.out.println("성공");
		}else {
			System.out.println("중복");
		}
		
		
		
	}

}
