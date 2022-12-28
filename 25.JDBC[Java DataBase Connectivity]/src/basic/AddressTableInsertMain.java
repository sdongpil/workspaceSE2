package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driverClass = "oracle.jdbc.OracleDriver";
		String user= "scott";
		String password = "tiger";
		String selectSql = "select * from dept order by deptno";

		String insertSQL =
				"insert into address values(address_no_seq.nextval,'손동필','123-4568','경기도 시흥시')";
				
		
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(insert)
		 5.SQL문전송(insert)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int  rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">>insert row count:" + rowCount + "행 insert");
		stmt.close();
		con.close();
		
		
				
	}
}
