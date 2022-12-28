package 과제;

import java.util.Date;

public class MemberDaoTestMain {

	public static void main(String[] args) throws Exception {
		MemberDao memberDao=new MemberDao();
		int rowCount = 0;
//		int rowCount = memberDao.delete("bbbb");
//		System.out.println("0.delete   --> ");
//		
//		Member member = new Member("ffff","1234","dongpil","서울시",29,'F',null);
//		rowCount = memberDao.insert(member);
//		System.out.println("1.insert   --> "+rowCount);
		
		Member member2 = new Member("ffff","1234","dong22","서울22",23,'F',null);
		rowCount = memberDao.update(member2);
		System.out.println("2.update   --> "+rowCount);
		
		
		System.out.println("3.selectById-> ");
		System.out.println("4.selectAll--> ");
		
		
	}

}


