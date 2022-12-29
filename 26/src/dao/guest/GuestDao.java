
package dao.guest;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * Dao(Data[DataBase] Access Object)객체(클래스)
 *   - guest테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
 *     단위메쏘드를 가지고있는 객체(클래스)
 */
public class GuestDao {
	public int insert(Guest guest) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";

		String insertSql = "insert into guest values(guest_guest_no_seq.nextval,?,?,?,?,?,?)";

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(insertSql);

		pstmt.setString(1, guest.getGuest_name());
		pstmt.setDate(2, new java.sql.Date(guest.getGuest_date().getTime()));
		pstmt.setString(3, guest.getGuest_email());
		pstmt.setString(4, guest.getGuest_homepage());
		pstmt.setString(5, guest.getGuest_title());
		pstmt.setString(6, guest.getGuest_content());

		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();

		return rowCount;

	}

	public int update(Guest updateGuest) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";

		String updateSql = "update guest set guest_no=?, guest_name=?, guest_date=?, guest_email=?, "
				+ "guest_homepage=?, guest_title=?, guest_content=? where guest_no=?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(updateSql);

		pstmt.setInt(1, updateGuest.getGuest_no());
		pstmt.setString(2, updateGuest.getGuest_name());
		pstmt.setDate(3, new java.sql.Date(updateGuest.getGuest_date().getTime()));
		pstmt.setString(4, updateGuest.getGuest_email());
		pstmt.setString(5, updateGuest.getGuest_homepage());
		pstmt.setString(6, updateGuest.getGuest_title());
		pstmt.setString(7, updateGuest.getGuest_content());
		pstmt.setInt(8, updateGuest.getGuest_no());
		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();

		return rowCount;

	}

	public int delete(int guest_no) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";

		String deleteSql = "delete from guest where guest_no = ?";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(deleteSql);

		pstmt.setInt(1, guest_no);
		int rowCount = pstmt.executeUpdate();

		pstmt.close();
		con.close();
		return rowCount;

	}

	public void findByPrimaryKey() throws Exception {
	}

	public void findAll() throws Exception {
	}
}
