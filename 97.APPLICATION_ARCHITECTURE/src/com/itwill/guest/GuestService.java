package com.itwill.guest;

import java.util.List;

public class GuestService {

	private GuestDao guestDao;

	public GuestService() throws Exception {
		this.guestDao = new GuestDao();
	}

	/*
	 * 방명록쓰기
	 */
	public int guestWrite(Guest newGuest) throws Exception {
		int rowCount = guestDao.insert(newGuest);

		/*
		 * << GuestDao객체사용>>
		 */
		return rowCount;
	}

	/*
	 * 방명록번호로 1개보기
	 */
	public Guest guestDetail(int no) throws Exception {
		Guest g = guestDao.findByPrimaryKey(no);
		return g;
	}

	/*
	 * 방명록번호로삭제
	 */
	public int guestDelete(int guest_no) throws Exception {
		int rowCount = guestDao.delete(guest_no);
		return rowCount;
	}

	/*
	 * 방명록 리스트보기
	 */
	public List<Guest> guestList() throws Exception {
		return null;
	}

	/*
	 * 방명록 이름으로 리스트보기
	 */

	public List<Guest> findByGuestName(String GuestName) {
		return null;

	}

}