/**********************************/
/* Table Name: userInfo */
/**********************************/
CREATE TABLE userInfo(
		userId                        		VARCHAR2(50)		 NOT NULL,
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



COMMENT ON TABLE cart is 'cart';
COMMENT ON COLUMN cart.cart_no is 'cart_no';
COMMENT ON COLUMN cart.cart_qty is 'cart_qty';
COMMENT ON COLUMN cart.userId is 'userId';
COMMENT ON COLUMN cart.p_no is 'p_no';


/**********************************/
/* Table Name: orders */
/**********************************/
CREATE TABLE orders(
		o_no                          		NUMBER(10)		 NULL ,
		o_desc                        		VARCHAR2(20)		 NULL ,
		o_date                        		DATE		 DEFAULT sysdate		 NULL ,
		o_price                       		NUMBER(10)		 NULL ,
		userId                        		VARCHAR2(50)		 NULL 
);

CREATE SEQUENCE orders_o_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE orders is 'orders';
COMMENT ON COLUMN orders.o_no is 'o_no';
COMMENT ON COLUMN orders.o_desc is 'o_desc';
COMMENT ON COLUMN orders.o_date is 'o_date';
COMMENT ON COLUMN orders.o_price is 'o_price';
COMMENT ON COLUMN orders.userId is 'userId';


/**********************************/
/* Table Name: order_item */
/**********************************/
CREATE TABLE order_item(
		oi_no                         		NUMBER(10)		 NULL ,
		oi_qty                        		NUMBER(10)		 NULL ,
		o_no                          		NUMBER(10)		 NULL ,
		p_no                          		NUMBER(10)		 NULL 
);

CREATE SEQUENCE order_item_oi_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



COMMENT ON TABLE order_item is 'order_item';
COMMENT ON COLUMN order_item.oi_no is 'oi_no';
COMMENT ON COLUMN order_item.oi_qty is 'oi_qty';
COMMENT ON COLUMN order_item.o_no is 'o_no';
COMMENT ON COLUMN order_item.p_no is 'p_no';



ALTER TABLE userInfo ADD CONSTRAINT IDX_userInfo_PK PRIMARY KEY (userId);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (cart_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (userId) REFERENCES userInfo (userId);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK0 FOREIGN KEY (userId) REFERENCES userInfo (userId);

ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_PK PRIMARY KEY (oi_no);
ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_FK0 FOREIGN KEY (o_no) REFERENCES orders (o_no);
ALTER TABLE order_item ADD CONSTRAINT IDX_order_item_FK1 FOREIGN KEY (p_no) REFERENCES product (p_no);

