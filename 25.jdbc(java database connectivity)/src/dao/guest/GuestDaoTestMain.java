package dao.guest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GuestDaoTestMain {

	public static void main(String[] args) throws Exception {
		int rowCount = 0;
		GuestDao guestDao = new GuestDao();

		Guest guest1 = new Guest(0, "dongpil", new SimpleDateFormat("yyyy/MM/dd").parse("2022/12/12"), "pi@nave.com",
				"www.www", "qmfqk", "dmdmdmdm");
		rowCount = guestDao.insert(guest1);
		System.out.println("1.insert" + rowCount);

		rowCount = guestDao.delete(4);
		System.out.println("2.delete" + rowCount);

		rowCount = guestDao.update(new Guest(4, "김경호", new SimpleDateFormat("yyyy/MM/dd").parse("2022/12/25"),
				"naver@naver.com", "zz", "zzz", "zz"));
		System.out.println("3.update" + rowCount);

		System.out.println("4.findByPrimarykey");
		System.out.println("5.findAll");
	}

}
