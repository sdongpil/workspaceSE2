package com.itwill.shop.user;

import java.io.IOException;
import java.util.Arrays;

public class UserService {

	private UserDao userDao;

	public UserService() throws Exception {
		this.userDao = new UserDao();
	}

	String alphabet1 = ".*[a-z].*";
	String alphabet2 = ".*[A-Z].*";
	String specialCharacters = ".*[!,~,@,#,$,*,^].*";

	public int create(User user) throws Exception {
		String pw = user.getUser_pw();
		String[] splitPw = pw.split("");

		// 아이디 중복체크
		if (userDao.countByUserId(user.getUser_id()) >= 1) {
			return -1;
			// 비밀번호 유효성체크
		} else if (user.getUser_pw() == null || 
				user.getUser_pw().length() < 8 || 
				user.getUser_pw().length() > 16) {
			return -2;
			//대소문자 체크
		} else if (!user.getUser_pw().matches(alphabet1) ||
				!user.getUser_pw().matches(alphabet2)) {
			return -3;
			//특수문자 체크
		} else if (!user.getUser_pw().matches(specialCharacters)) {
			return -4;
		}
		else {
			int rowCount = userDao.insert(user);
			return rowCount;
		}

	}

	public int login(String id, String pw) throws Exception {
		int loginResult = -999;
		User findUser = userDao.findByPrimaryKey(id);
		if (findUser == null) {
			loginResult = 1;
		} else {
			if (pw.equals(findUser.getUser_pw())) {
				loginResult = 0;
			} else {
				loginResult = 2;
			}
		}
		return loginResult;
	}

	/*
	 * 로그인한 회원의 정보보기
	 */
	public User findUser(String userId) throws Exception {
		return userDao.findByPrimaryKey(userId);
	}

	/*
	 * 회원수정
	 */
	public int update(User user) throws Exception {
		return userDao.update(user);
	}



	/*
	 * 회원탈퇴
	 */
	public int remove(String userId) throws Exception {
		return userDao.delete(userId);
	}

	// 아이디 찾기
	public String FindId(String user_name, String user_phone) throws Exception {
		return userDao.findByUserId(user_name, user_phone);

	}

	// 비밀번호 찾기
	public String FindPw(String user_id, String user_name) throws Exception {
		return userDao.findByUserPw(user_id, user_name);
	}

}
