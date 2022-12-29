package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Dao(Data Access Object) Ŭ����
 *    - address���̺� CRUD(Create,Read,Update,Delete)�۾����ϴ�
 *      �����޽�带 �������ִ� Ŭ����
 *    
 * 
 */
public class AddressDao {
	
	/*****************����Ÿ���̽���������***********/
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	/***********************************************/
	public AddressDao() {
	}
	
	public int insert(Address newAddress) throws Exception{
	
		
		String insertSQL=
				"insert into address values(address_no_seq.nextval,'"
							+newAddress.getName()+"','"
							+newAddress.getPhone()+"','"
							+newAddress.getAddress()+"')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSQL);
		//System.out.println(">>insert row count:"+rowCount+" �� insert");
		stmt.close();
		con.close();
		return rowCount;
	}
	
	public int update(Address updateAddress) throws Exception{
	
		String updateSQL="update address set name='"
						+updateAddress.getName()+"',phone='"
						+updateAddress.getPhone()+"',address='"
						+updateAddress.getAddress()+"' where no ="+updateAddress.getNo();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSQL);
		//System.out.println(">> "+rowCount+" �� update");
		
		stmt.close();
		con.close();
		return rowCount;
	}
	public int delete(int no)throws Exception {
	
		String deleteSQL="delete address where no="+no;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSQL);
		//System.out.println(">> "+rowCount+ "�� delete" );
		stmt.close();
		con.close();
		return rowCount;
	}
	public Address findByPrimaryKey(int no) throws Exception{
		
		String selectSQL="select no,name,phone,address from address where no="+no;
		
		Address findAddress=null;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		if(rs.next()) {
			int n=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			findAddress=new Address(no, name, phone, address);
			
		}else {
			//System.out.println("���ǿ� �����ϴ� �ּҷ� �������");
			findAddress=null;
		}
		
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
		
	}
	public List<Address> findAll() throws Exception{
		
		String selectSQL="select no,name,phone,address from address";
		
		List<Address> addressList=new ArrayList<Address>();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		if(rs.next()) {
			do{
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String addr=rs.getString("address");
				Address address=new Address(no, name, phone, addr);
				addressList.add(address);
			}while(rs.next());
		}else {
			//System.out.println("���ǿ� �����ϴ� �ּҷ� �������");
			
		}
		
		rs.close();
		stmt.close();
		con.close();
		return addressList;
	}
	
}