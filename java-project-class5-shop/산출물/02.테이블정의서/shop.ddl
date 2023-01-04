/**********************************/
/* Table Name: userInfo */
/**********************************/
CREATE TABLE userInfo(
		userId                        		VARCHAR2(50)		 NULL ,
		password                      		VARCHAR2(50)		 NULL ,
		name                          		VARCHAR2(50)		 NULL ,
		email                         		VARCHAR2(50)		 NULL 
);

COMMENT ON TABLE userInfo is 'userInfo';
COMMENT ON COLUMN userInfo.userId is 'userId';
COMMENT ON COLUMN userInfo.password is 'password';
COMMENT ON COLUMN userInfo.name is 'name';
COMMENT ON COLUMN userInfo.email is 'email';


/**********************************/
/* Table Name: product */
/**********************************/
CREATE TABLE product(
		p_no                          		NUMBER(10)		 NULL ,
		p_name                        		VARCHAR2(50)		 NULL ,
		p_price                       		NUMBER(10)		 DEFAULT 0		 NULL ,
		p_image                       		VARCHAR2(100)		 DEFAULT 'default.jpg'		 NULL ,
		p_desc                        		VARCHAR2(200)		 NULL ,
		p_click_count                 		NUMBER(10)		 DEFAULT 0		 NULL 
);

COMMENT ON TABLE product is 'product';
COMMENT ON COLUMN product.p_no is 'p_no';
COMMENT ON COLUMN product.p_name is 'p_name';
COMMENT ON COLUMN product.p_price is 'p_price';
COMMENT ON COLUMN product.p_image is 'p_image';
COMMENT ON COLUMN product.p_desc is 'p_desc';
COMMENT ON COLUMN product.p_click_count is 'p_click_count';


/**********************************/
/* Table Name: cart */
/**********************************/
CREATE TABLE cart(
		cart_no                       		NUMBER(10)		 NULL ,
		cart_qty                      		NUMBER(10)		 NULL ,
		userId                        		VARCHAR2(50)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

CREATE SEQUENCE cart_cart_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;







ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (userId);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (userId) REFERENCES userInfo (userId);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

