package com.itwill.shop.user;

/*
 * 		user_id                       		VARCHAR2(20)		 NOT NULL,
		user_pw                       		VARCHAR2(20)		 NOT NULL,
		user_name                     		VARCHAR2(50)		 NOT NULL,
		user_phone                    		VARCHAR2(50)		 NOT NULL,
		user_address                  		VARCHAR2(50)		 NOT NULL,
		user_email                    		VARCHAR2(100)		 NOT NULL
)
 */
public class UserSQL {
	
	
	public static final String USERINFO_INSERT = "insert into userinfo(user_id,user_pw,user_name,user_phone,user_address,user_email) values (?,?,?,?,?,?)";

	public static final String USERINFO_UPDATE = "update userinfo set user_pw = ?,user_name =?,user_phone = ?,user_address =?,user_email =? where user_id =?";

	public static final String USERINFO_DELETE = "delete from userinfo where user_id =? ";
	
	public static final String USERINFO_SELECT_BY_ID = "select * from userinfo where user_id =?";
	
	public static final String USERINFO_SELECT_ALL = "select * from userinfo ";

}
