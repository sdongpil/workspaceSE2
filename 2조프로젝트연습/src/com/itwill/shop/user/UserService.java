package com.itwill.shop.user;

import java.io.IOException;


public class UserService {
	
	private UserDao userDao;
	
	public UserService() throws Exception {
		this.userDao = new UserDao();
	}
	
	public boolean addUser(User newUser) throws Exception {

		boolean isSucces = false;

		/*
		 * 아이디의 존재여부 체크 -존재하면 메세지 -존재안하면 가입
		 */

		if (userDao.select_by_id(newUser.getUser_id()) == null) {
			int rowCount = userDao.insert(newUser);
			isSucces = true;
		}

		return isSucces;

	}

}
