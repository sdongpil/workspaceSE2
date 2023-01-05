package com.itwill.shop.user;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {

	DataSource dataSource;

	public UserDao() throws IOException {
		this.dataSource = new DataSource();
	}

	public int insert(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_INSERT);

		pstmt.setString(1, user.getUser_id());
		pstmt.setString(2, user.getUser_pw());
		pstmt.setString(3, user.getUser_name());
		pstmt.setString(4, user.getUser_phone());
		pstmt.setString(5, user.getUser_address());
		pstmt.setString(6, user.getUser_email());

		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;

	}
	
	public int update(User user) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_UPDATE);

//		pstmt.setString(1, user.getUser_id());
		pstmt.setString(1, user.getUser_pw());
		pstmt.setString(2, user.getUser_name());
		pstmt.setString(3, user.getUser_phone());
		pstmt.setString(4, user.getUser_address());
		pstmt.setString(5, user.getUser_email());
		pstmt.setString(6, user.getUser_id());
		
		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;
	}
	
	public int delete(String s) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_DELETE);

		pstmt.setString(1, s);
		
		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		dataSource.close(con);

		return rowCount;
		
	}
	
	public User select_by_id(String user_id) throws Exception {
		
		
		User findUser = null;
		
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USERINFO_SELECT_BY_ID);
		pstmt.setString(1,user_id);
		ResultSet rs = pstmt.executeQuery();
		
		if(rs.next()) {
			findUser = new User(rs.getString("user_id"),
					rs.getString("user_pw"),
					rs.getString("user_name"),
					rs.getString("user_phone"),
					rs.getString("user_address"),
					rs.getString("user_email"));				
		
	}
		return findUser;


	}
}
	

