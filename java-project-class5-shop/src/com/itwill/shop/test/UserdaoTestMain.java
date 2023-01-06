package com.itwill.shop.test;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserDao;

public class UserdaoTestMain {

	public static void main(String[] args) throws Exception {

		
		UserDao userDao = new UserDao ();
		
		int result = userDao.insert(new User("bb","bb","비비","www."));
		
		System.out.println(result);
	}

}
