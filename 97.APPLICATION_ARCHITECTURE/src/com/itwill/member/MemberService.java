package com.itwill.member;

public class MemberService {

	private MemberDao memberDao;

	public MemberService() throws Exception {
		this.memberDao = new MemberDao();
	}

	/*
	 * 회원가입 - 아이디가 중복된 경우에는 메세지를 띄운다.
	 */
	public boolean addMember(Member newMember) throws Exception {

		boolean isSucces = false;

		/*
		 * 아이디의 존재여부 체크 -존재하면 메세지 -존재안하면 가입
		 */

		if (memberDao.findByPrimaryKey(newMember.getM_id()) == null) {
			int rowCount = memberDao.insert(newMember);
			isSucces = true;
		}

		return isSucces;

	}

	/*
	 * 회원로그인
	 */
	public int login(String id, String pw) throws Exception {

		/*
		 * 0:성공 1:아이디존재안함 2:패스워드 불일치
		 * 
		 */
		int loginResult = -999;

		Member findM = memberDao.findByPrimaryKey(id);

		if (findM == null) {
			loginResult = 1;
		} else {
			if (pw.equals(findM.getM_password())) {
				loginResult = 0 ;
				
			}else {
				loginResult = 2;
			}
		}

		return loginResult;
	}

	/*
	 * 회원아이디 중복체크
	 */
	public boolean isDuplicateId(String m_id) throws Exception {
		
		Member findMember = memberDao.findByPrimaryKey(m_id);	
		
		if(findMember == null) {
			return false;
		}else {
			
			return false;
		}
	}
	
	/*
	 * 회원상세보기
	 */
	
	public Member memberDetail(String m_id) throws Exception {
		return memberDao.findByPrimaryKey(m_id);
	
	}
	
	

	/*
	 * 회원아이디로 수정
	 */
	
	public int memberUpdate(Member m)throws Exception {
		
		return memberDao.update(m);
		
	}

	/*
	 * 회원탈퇴
	 */
	
	public int memberDelete(String id) throws Exception {
		return memberDao.delete(id);
	}
	
	/* admin
	 * 회원전체검색
	 * 회원이름으로검색
	 * 회원주소로검색
	 * 회원나이로검색
	 * 회원결혼여부로검색
	 * 회원가입일로검색
	 */

}
