package com.itwill.guest.test;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args)  throws Exception{
		GuestService guestService=new GuestService();
		System.out.println("1.방명록쓰기");
		Guest g = new Guest(35, "손",null , "@naver", "aa", "bb", "cc");
		guestService.guestWrite(g);
		
		
		System.out.println("2.방명록수정");
		
		
		
		System.out.println("3.방명록삭제");
		guestService.guestDelete(16);
		
		System.out.println("4.방명록1개보기");
		 Guest g2 = guestService.guestDetail(18);
		 System.out.println(g2);
		
		
		System.out.println("5.방명록이름으로검색 보기");
		guestService.
		System.out.println("6.방명록 리스트보기");
		
		
	}

}