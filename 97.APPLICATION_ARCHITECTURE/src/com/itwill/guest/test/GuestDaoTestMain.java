package com.itwill.guest.test;

import java.util.List;

import com.itwill.guest.GuestDao;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
//		System.out.println("1.insert");
//		Guest insertg = new Guest(0, "김봉선", null, "sdhjko@naver.com", "www.ww", "타이틀", "내용");
//		int a = guestDao.insert(insertg);
//		System.out.println(a);
		
//		System.out.println("2.delete");
//		guestDao.delete(13);
		
//		System.out.println("4.findByPrimarykey");
//		Guest  find = guestDao.findByPrimaryKey(14);
//		System.out.println(find);
//		
//		System.out.println("3.update");
//		find.setGuest_eamil("sdsdhj");
//		System.out.println(find);
//		
//		System.out.println("5.findAll");
//			List a = guestDao.findAll();
//			
		
		System.out.println("6.findbyGuestName");
		List a = guestDao.findByGuestName("김봉선");
		System.out.println(a);
		
	}

}
