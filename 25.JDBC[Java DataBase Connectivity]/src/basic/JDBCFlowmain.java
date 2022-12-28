package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowmain {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driverClass = "oracle.driver.OracleDriver";
		String user= "scott";
		String password = "tiger";
		String selectSql = "select * from dept order by deptno";
		
		
		/*
		 *1,.driverclass loading
		 *  A.diverclass 생성
		 *  B.drivercManager 객체등록 
		 */
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1.Driver class loading");

		/*
		 * 2.Connection 객체생성
		 * -DB sever 와 연결객체
		 */
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		System.out.println("2.connection객체 생성:" + con);

		/*
		 * 3.statement 객체생성
		 *  -sql전송객체생성
		 *  
		 */
		Statement stmt = con.createStatement();
		System.out.println("3.statement 객체생성" + stmt);

		/*
		 * 4.sql문 전송
		 * 5.resultset 객체얻기(select)
		 */

		ResultSet rs = stmt.executeQuery("select * from dept");
		System.out.println("4,5. resultset 객체얻기" + rs);

		while (rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno + "\t" + dname + "\t" + loc);

		}
		
		/*
		 * 6.연결객체해지(resource) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6.연결객체닫기");

	}

}
