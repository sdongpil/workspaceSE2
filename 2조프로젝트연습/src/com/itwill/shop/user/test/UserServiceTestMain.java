package com.itwill.shop.user.test;

import javax.swing.JOptionPane;

import com.itwill.shop.user.User;
import com.itwill.shop.user.UserService;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception {

		UserService userService = new UserService();

		System.out.println("1.회원가입 중복체크");
		User user = new User("book19", "12345678sS!", "손동필", "010-5059", "서울", "naver");
		int i = userService.create(user);

		if (i == -1) {
			JOptionPane.showMessageDialog(null, "이미 사용중이거나 탈퇴한 아이디입니다.");
		} else if (i == -2) {
			JOptionPane.showMessageDialog(null, "비밀번호 8~16 길이로 사용하세요.");
		} else if (i == -3) {
			System.out.println("대소문자 각 하나 이상 사용하세요.");
		} else if (i == -4) {
			System.out.println("특수문자 !,~,@,#,$,*,^ 사용하세요.");

		} else {
			System.out.println("회원가입 성공");
		}
//
//		System.out.println("2.로그인");
//		int a = userService.login("book20", "12345678sS!");
//		if (a == 0) {
//			System.out.println("로그인성공");
//		} else {
//			if (a == 1) {
//				System.out.println("아이디 존재안함");
//			} else if (a == 2) {
//				System.out.println("패스워드 불일치");
//			}
//		}
//
//		/*
//		 * 로그인한 회원의 정보보기
//		 */
//		User findUser = userService.findUser("book1");
//		if (findUser == null) {
//			System.out.println("회원정보가 없습니다");
//		} else {
//
//			System.out.println("회원정보 보기 :" + findUser);
//		}
//		// 회원정보수정
//		User updateUser = new User("book21", "12345", "손동필", "01050596610", "서울시", "sdhjko@naver");
//		int updateCheck = userService.update(updateUser);
//		if (updateCheck == -1) {
//			System.out.println("존재하지 않는 아이디 입니다");
//		} else if (updateCheck == -2) {
//			System.out.println("비밀번호 8~16 길이로 사용하세요");
//		} else if (updateCheck == -3) {
//			System.out.println("대소문자 각 하나 이상 사용하세요.");
//		} else if (updateCheck == -4) {
//			System.out.println("특수문자 !,~,@,#,$,*,^ 사용하세요");
//		} else {
//			System.out.println("회원정보 수정완료" + updateUser);
//		}

		//  회원탈퇴
//		int delete = userService.remove("book21","123");
//		if (delete == 1) {
//			System.out.println("아이디가 삭제되었습니다");
//		} else {
//			System.out.println("존재하지않는 아디이입니다");
//		}
//
//		// 이름과 전화번호로 아이디찾기
//		String findUserID = userService.FindId("손동필", "010-5059");
//		if (findUserID == null) {
//			System.out.println("아이디를 찾을 수 없습니다");
//		} else {
//			System.out.println("회원아이디 :" + findUserID);
//		}
//
//		// 아이디와 이름으로 비밀번호 찾기
//		String findUserPw = userService.FindPw("book1", "정약용");
//		if (findUserPw == null) {
//			System.out.println("비밀번호를 찾을 수 없습니다");
//		} else {
//			System.out.println("비밀번호 : " + findUserPw);
//		}
//
//		// 이메일 중복체크
//		boolean check = userService.emailDuplicateCheck(user);
//		if (check) {
//			System.out.println("이미 사용중인 이메일 입니다.");
//		} else {
//			System.out.println("사용가능한 이메일 입니다.");
//		}

	}

}
