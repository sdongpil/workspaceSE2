package 과제;

import java.util.Date;
public class Member {
	
	/*
	VO(Value Object),DTO(Data Transfer Object)
		- member �뀒�씠釉� 1媛� row�쓽 �뜲�씠���쓽 媛믪쓣 媛�吏��뒗媛앹껜
		- member �뀒�씠釉� 1媛� row�쓽 �뜲�씠��媛믪쓣 �씠�룞(�뙆�씪硫뷀�,由ы꽩�뜲�씠��)�떆�궎湲곗쐞�븳媛앹껜 
		- member �뀒�씠釉붿쓽 而щ읆怨� �룞�씪�븳�닔�쓽 硫ㅻ쾭蹂��닔瑜쇨�吏��뒗媛앹껜
	*/
	/*
	�씠由�         �꼸?       �쑀�삎            
	---------- -------- ------------- 
	M_ID       NOT NULL VARCHAR2(20)  
	M_PASSWORD          VARCHAR2(20)  
	M_NAME              VARCHAR2(50)  
	M_ADDRESS           VARCHAR2(100) 
	M_AGE               NUMBER(3)     
	M_MARRIED           CHAR(1)       
	M_REGDATE           DATE     
	 */
	
	
	
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_address;
	private int m_age;
	private char m_married;
	public char getM_married() {
		return m_married;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Member(String m_id, String m_password, String m_name, String m_address, int m_age, char m_married,
			Date m_regdate) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_address = m_address;
		this.m_age = m_age;
		this.m_married = m_married;
		this.m_regdate = m_regdate;
	}

	public void setM_married(char m_married) {
		this.m_married = m_married;
	}
	private Date m_regdate;
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_password() {
		return m_password;
	}
	public void setM_password(String m_password) {
		this.m_password = m_password;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public int getM_age() {
		return m_age;
	}
	public void setM_age(int m_age) {
		this.m_age = m_age;
	}
	public Date getM_regdate() {
		return m_regdate;
	}
	public void setM_regdate(Date m_regdate) {
		this.m_regdate = m_regdate;
	}
	
	
}
