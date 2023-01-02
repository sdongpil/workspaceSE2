package com.itwill.guest;

import java.util.List;

public class GuestService{
	
		private GuestDao guestDao;
		
		public GuestService() throws Exception{
			this.guestDao=new GuestDao();
		}
		
		/*
		 * 방명록쓰기
		 */
		public int guestWrite(Guest newGuest) throws Exception{
			
			
			/*
			<< GuestDao객체사용>>
			*/
			return 0;
		}
		/*
		 * 방명록번호로 1개보기
		 */
		public Guest guestDetail(int no) throws Exception{
			return null;
		}
		/*
		 * 방명록번호로삭제
		 */
		public int guestDelete(int guest_no) throws Exception{
			return 0;
		}
		/*
		 * 방명록 리스트보기
		 */
		public List<Guest> guestList()throws Exception {
			return null;
		}
		
		/*
		 * 방명록 이름으로 리스트보기
		 */
		
		public List<Guest> findByGuestName(String GuestName) {
			return null;
			
		}
		
		
		
		
		
	}