package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.common.DataSource;

public class AccountService {
		private DataSource dataSource;
		public AccountService() {
			dataSource=new DataSource();
		}
		/*
		 * 모든계좌의 잔고를 balance만큼 갱신
		 */
		public void updateBalance(int balance) {
			
			Connection con=null;
			PreparedStatement pstmt=null;
			String updateSql="update accounta set acc_balance=acc_balance + ? where acc_no=?";
			
			try {
				con=dataSource.getConnection();
				System.out.println("-------updateBalance transaction  start-------------");
				con.setAutoCommit(false);
				
				pstmt = con.prepareStatement(updateSql);
				
				/**********************1000번계좌 update*********************/
				int acc_no=1000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				int rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				/**********************2000번계좌 update*********************/
				acc_no=2000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				/**********************3000번계좌 update*********************/
				acc_no=3000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				/**********************4000번계좌 update*********************/
				acc_no=4000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				/**********************5000번계좌 update*********************/
				acc_no=5000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				/**********************6000번계좌 update*********************/
				acc_no=6000;
				pstmt.setInt(1, balance);
				pstmt.setInt(2, acc_no);
				rowCount=pstmt.executeUpdate();
				System.out.println(acc_no +"번 계좌 "+rowCount+" 행 update");
				con.commit();
				
				
			}catch (Exception e) {
				System.err.println("99.예외발생 "+e.getMessage());
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}finally {
				/*
				 * exception발생유무와관계없이항상실행
				 *   - 리소스해지
				 */
				try {
					dataSource.close(con);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
	