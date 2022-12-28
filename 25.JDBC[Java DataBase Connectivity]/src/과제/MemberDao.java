package 과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Dao(Data[DataBase] Access Object)객체
 * 		- member(회원) 데이타를 저장하고있는 테이블에
 *        CRUD(Create,Read,Update,Delete)작업을 할수있는 
 *        단위메쏘드를 가지고있는 클래스
 */
public class MemberDao {

	Member m = new Member();

	public int insert(Member member) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";
		

		String insertSql = "insert into member values('" + member.getM_id() + "','" + member.getM_password() + "','"
				+ member.getM_name() + "','" + member.getM_address() + "','" + member.getM_age() + "','"
				+ member.getM_regdate() + "','" + "sysdate" + ")";
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();

		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(">>insert row count : " + rowCount + "행 insert");
		stmt.close();
		con.close();

		return rowCount;

	}

	public int update(Member member) throws Exception {
		
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";
		

		String updateSql = "update set member m_id = '"+ member.getM_id()"'+'",
				;
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();

		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(">>insert row count : " + rowCount + "행 insert");
		stmt.close();
		con.close();

		return rowCount;
		
	}

	public void delete() throws Exception {
	}

	public void findByPrimaryKey() throws Exception {
	}

	public void findAll() throws Exception {
	}
}
