package com.itwill.shop.user;

import java.util.ArrayList;
import java.util.List;


public class UserTestMain {

	public static void main(String[] args) throws Exception {
			System.out.println("a");
		
		int row =0;
		UserDao userdao = new UserDao();
		
		User  user = new User("kim", "12311", "dongpil11", "01011", "서11", "s1d1hjko"); 
		 row = userdao.insert(user);
		System.out.println(row);
//		
////		
//		User user2 = new User("dp", "1231112", "dongp21i", "02110", "서22", "2sdjko"); 
//		row = userdao.update(user2);
//		System.out.println(row);
////		
////		
//		
//		int row2 = userdao.delete("dp");
//		System.out.println(row2);
//		
		System.out.println("3.selectById-> ");
		User mm = userdao.select_by_id("dp");
		System.out.println(mm);
//		
//		System.out.println("4.selectAll--> ");
//		List memberList = new ArrayList();
//		memberList = memberDao.findAll();
//		System.out.println(memberList);
//		
		
	}

}
