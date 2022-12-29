package dao.address;
/*
 * VO(Value Object),DTO(Data Transfer Object)
 * 	- address���̺� 1�� row�� ����Ÿ�� ���� �����°�ü
 *  - address���̺� 1�� row�� ����Ÿ���� ����(�Ķ��Ÿ,���ϵ���Ÿ)��Ű�����Ѱ�ü
 *  - address���̺��� �÷��� �����Ѽ��� ����ʵ带 �����°�ü
 */
/*
�̸�      ��?       ����           
------- -------- ------------ 
NO      NOT NULL NUMBER(4)    
NAME             VARCHAR2(50) 
PHONE            VARCHAR2(50) 
ADDRESS          VARCHAR2(60)
 */
public class Address {
	private int no;
	private String name;
	private String phone;
	private String address;
	public Address() {
	}
	public Address(int no, String name, String phone, String address) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [no=" + no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]\n";
	}
	
}













