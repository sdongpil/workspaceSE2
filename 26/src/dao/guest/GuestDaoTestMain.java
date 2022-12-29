package dao.guest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
		GuestDao guestDao=new GuestDao();
		
		Guest insert = new Guest(0, "dongpil", new SimpleDateFormat("yyyy/MM/dd").parse("2022/12/12"), "pi@nave.com", "www.www", "qmfqk", "dmdmdmdm");
		guestDao.insert(insert);
		System.out.println("1.insert");
		
		
		
		
		System.out.println("2.delete");
		System.out.println("3.update");
		System.out.println("4.findByPrimarykey");
		System.out.println("5.findAll");
	}
	
}
