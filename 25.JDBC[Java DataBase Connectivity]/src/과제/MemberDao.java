package 과제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Dao(Data[DataBase] Access Object)媛앹껜
 * 		- member(�쉶�썝) �뜲�씠��瑜� ���옣�븯怨좎엳�뒗 �뀒�씠釉붿뿉
 *        CRUD(Create,Read,Update,Delete)�옉�뾽�쓣 �븷�닔�엳�뒗 
 *        �떒�쐞硫붿룜�뱶瑜� 媛�吏�怨좎엳�뒗 �겢�옒�뒪
 */
public class MemberDao {

	Member m = new Member();

	public int insert(Member newMember) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";
		

		String insertSQL = "insert into member(m_id,m_password,m_name,m_address,m_age,m_married,m_regdate)"
				+ "values('"+newMember.getM_id()+"','"+newMember.getM_password()
				+"','"+newMember.getM_name()+"','"+newMember.getM_address()+"',"+newMember.getM_age()
				+",'"+newMember.getM_married()+"',sysdate)";
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();

		int rowCount = stmt.executeUpdate(insertSQL);
		stmt.close();
		con.close();

		return rowCount;

	}

	public int update(Member updateMember) throws Exception {
	
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";
		

<<<<<<< HEAD
		String updateSql = "update  member set m_id = '"+ member.getM_id()+"', m_password = '"+ member.getM_password()+"', m_name = '"+member.getM_name()+"'
				
				;
=======
		String updateSql = "update member set m_password='"+updateMember.getM_password()
		+"',m_name='"+updateMember.getM_name()+"',m_address='"+updateMember.getM_address()
		+"',m_age="+updateMember.getM_age()+",m_married='"+updateMember.getM_married()
		+"',m_regdate=sysdate where m_id='"+updateMember.getM_id()+"'";
>>>>>>> branch 'master' of https://github.com/sdongpil/workspaceSE2.git
		

		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);

		Statement stmt = con.createStatement();

		int rowCount = stmt.executeUpdate(updateSql);
		stmt.close();
		con.close();

		return rowCount;
		
	}

	public int delete(String m_id) throws Exception {
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "jdeveloper25";
		String password = "jdeveloper25";
		
		String deleteSQL ="delete member where m_id='"+m_id+"'";
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSQL);
		
		stmt.close();
		con.close();
		return rowCount;
		
	}

	public void findByPrimaryKey() throws Exception {
	}

	public void findAll() throws Exception {
	}
}
