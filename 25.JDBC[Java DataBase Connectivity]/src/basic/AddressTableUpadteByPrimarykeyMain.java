package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableUpadteByPrimarykeyMain {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driverClass = "oracle.jdbc.OracleDriver";
		String user= "scott";
		String password = "tiger";
		String selectSql = "select * from dept order by deptno";

		String insertSQL ="update address set name = '김경' ,phone ='899-123', address = ' 서울' where no =2";
				
		
		/*
		 1.Driver class loading
	     2.Connection 객체생성
		 3.Statement객체생성
		 4.SQL문전송(update)
		 5.SQL문전송(update)결과 영향받은행의수 반환
		 6.연결객체해지(resource해지) close
		 */
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		int  rowCount = stmt.executeUpdate(insertSQL);
		System.out.println(">>update row count:" + rowCount + "행 update");
		stmt.close();
		con.close();
	}

}
