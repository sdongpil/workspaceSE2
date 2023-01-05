package com.itwill.shop.cart;

import com.itwill.shop.product.Product;

public class Cart {
	
	private int cart_no;
	private int cart_qty;
	
	
	private String userid;//FK
	
	
//	private int p_no;//FK 
	private Product product;
	
	
	
	public Cart() {

	}

	

	public Cart(int cart_no, int cart_qty, String userid, Product product) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.userid = userid;
		this.product = product;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", userid=" + userid + ", p_no=" + p_no + "]";
	}
	
	
	

}
