package com.itwill.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.common.DataSource;
import com.itwill.guest.Guest;
import com.itwill.guest.GuestSql;

import oracle.net.aso.m;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD
import java.util.List;(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	DataSource data ;
	
	public MemberDao() throws Exception {
		this.data = new DataSource();
	}

	public int insert(Member m) throws Exception {
		Connection con = data.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSql.MEMBER_INSERT);
		
		pstmt.setString(1,m.getM_id());
		pstmt.setString(2,m.getM_password());
		pstmt.setString(3,m.getM_name());
		pstmt.setString(4,m.getM_address());
		pstmt.setInt(5,m.getM_age());
		pstmt.setString(6, m.getM_married());
		
		int rowCount = pstmt.executeUpdate();
		
		pstmt.close();
		data.close(con);
		
		return rowCount;
		
	}

	public int update(Member m) throws Exception {
		Connection con = data.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSql.MEMBER_UPDATE);
		
		pstmt.setString(1,m.getM_password());
		pstmt.setString(2,m.getM_name());
		pstmt.setString(3,m.getM_address());
		pstmt.setInt(4,m.getM_age());
		pstmt.setString(5, m.getM_married());
		pstmt.setString(6,m.getM_id());
		
		int count = pstmt.executeUpdate();
		
		pstmt.close();
		data.close(con);
		
		return count;
	}
	
	public int delete(String id) throws Exception{
		Connection con = data.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSql.MEMBER_DELETE);
		
		pstmt.setString(1,id);
		
		int count = pstmt.executeUpdate();
		
		pstmt.close();
		data.close(con);
		return count;
		
		
	}
	


	public Member findByPrimaryKey(String id) throws Exception {
		Member findMember = null;
		
		Connection con = data.getConnection();
		PreparedStatement pstmt = con.prepareStatement(MemberSql.MEMBER_SELECT_BY_ID);
		pstmt.setString(1,id);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			findMember = new Member(rs.getString("m_id"),
					rs.getString("m_password"),
					rs.getString("m_name"),
					rs.getString("m_address"),
					rs.getInt("m_age"),
					rs.getString("m_married"),
					rs.getDate("m_regdate"));
		
			
	}
		
		
		return findMember;
	}

	public List<Member> findAll() throws Exception {
		
		List<Member> memberList = new ArrayList<>();
		
		Connection con = data.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(MemberSql.MEMBER_SELECT_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
		Member newMember  = new Member(rs.getString("m_id"),
				rs.getString("m_password"),
				rs.getString("m_name"),
				rs.getString("m_address"),
				rs.getInt("m_age"),
				rs.getString("m_married"),
				rs.getDate("m_regdate")
				
				);
		
			memberList.add(newMember);
			
		}
		return memberList ;
		
	}
}
