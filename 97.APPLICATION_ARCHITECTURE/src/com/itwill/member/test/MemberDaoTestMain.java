package com.itwill.member.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.itwill.member.Member;
import com.itwill.member.MemberDao;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		int rowCount = 0;
	
		MemberDao memberDao=new MemberDao();
		
//		System.out.println("0.delete   --> ");
//		rowCount = memberDao.delete("aaaa");
//		System.out.println(rowCount);
		
		
//		
//		System.out.println("1.insert   --> ");
//		Member m = new Member("fff","asd","www.","asd",20,"T",null);
//		rowCount = memberDao.insert(m);
//		System.out.println(rowCount);
		
		
		
//		System.out.println("2.update   --> ");
//		Member m =  new Member("fff","1234","dongpil","seoul",2,"F",null);
//		memberDao.update(m);
		
		
		
		System.out.println("3.selectById-> ");
		Member mm = memberDao.findByPrimaryKey("fff");
		System.out.println(mm);
		
		System.out.println("4.selectAll--> ");
		List memberList = new ArrayList();
		memberList = memberDao.findAll();
		System.out.println(memberList);
		
	}

}
