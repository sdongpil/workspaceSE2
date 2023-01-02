package com.itwill.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.itwill.common.DataSource;

import oracle.jdbc.proxy.annotation.Pre;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {  
	
	private DataSource dataSource;
	
	public GuestDao() throws Exception {
		dataSource = new DataSource();
		
	}
	
	public int insert(Guest g) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_INSERT);
		
		/*
		 * 파라메타 세팅
		 */
		pstmt.setString(1, g.getGuest_name());
		pstmt.setString(2,g.getGuest_eamil());
		pstmt.setString(3,g.getGuest_homepage());
		pstmt.setString(4,g.getGuest_title());
		pstmt.setString(5,g.getGuest_content());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	
	public int delete(int no) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_DELETE);
		
		/*
		 * 파라메타 세팅
		 */
		pstmt.setInt(1,no);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
		
		
	}
	
	public int update(Guest g) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_UPDATE);
		
		/*
		 * 파라메타 세팅
		 */
		
		pstmt.setString(1, g.getGuest_name());
		pstmt.setString(2,g.getGuest_eamil());
		pstmt.setString(3,g.getGuest_homepage());
		pstmt.setString(4,g.getGuest_title());
		pstmt.setString(5,g.getGuest_content());
		pstmt.setInt(6, g.getGuest_no());
		
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		dataSource.close(con);
		
		return rowCount;
	}
	
	public Guest findByPrimaryKey (int guest_no) throws Exception{
		Guest findGuset = null;
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_SELECT_BY_NO);
		pstmt.setInt(1, guest_no);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			findGuset = new Guest(rs.getInt("guest_no"),
					rs.getString("guest_name"),
					rs.getDate("guest_date"),
					rs.getString("guest_email"),
					rs.getString("guest_homepage"),
					rs.getString("guest_title"),
					rs.getString("guest_content"));
			
		}
		
		return findGuset;
		
		
	}
	
	public List<Guest> findAll () throws Exception{
		List<Guest> guestList = new ArrayList();
		
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_SELECT_BY_ALL);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
		Guest findGuset = new Guest(rs.getInt("guest_no"),
					rs.getString("guest_name"),
					rs.getDate("guest_date"),
					rs.getString("guest_email"),
					rs.getString("guest_homepage"),
					rs.getString("guest_title"),
					rs.getString("guest_content"));
		
			guestList.add(findGuset);
		}
		
		return guestList;
		
	}
	
	public List<Guest> findByGuestName (String name) throws Exception{
	List<Guest> guestList = new ArrayList();
		
		Connection con = dataSource.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(GuestSql.GUEST_SELECT_BY_NAME);
		pstmt.setString(1, name);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
		Guest findGuset = new Guest(rs.getInt("guest_no"),
					rs.getString("guest_name"),
					rs.getDate("guest_date"),
					rs.getString("guest_email"),
					rs.getString("guest_homepage"),
					rs.getString("guest_title"),
					rs.getString("guest_content"));
		
			guestList.add(findGuset);
		}
		
		return guestList;
		
	}
	
}
