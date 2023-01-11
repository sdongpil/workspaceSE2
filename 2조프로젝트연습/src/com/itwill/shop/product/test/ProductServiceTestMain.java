package com.itwill.shop.product.test;

import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		
		ProductService productService=new ProductService();
	
	
	//1. 상품추가
	Product newProduct=new Product(0, "소설8", 100002 , "image.jpg","상품설명");
//	System.out.println(">> "+productService.addBook(newProduct));
	
	//2. 상품수정
	newProduct.setP_image("이미지변경");
	System.out.println(">>"+ productService.updateBook(newProduct));
	
	//3. 상품삭제
	System.out.println(">> "+productService.deleteBook(10));	
//	
//	//4. 상품 번호로 찾기
//	System.out.println(">> "+productService.bookSearchNumber(2));
//	
//	//5. 상품명으로 찾기
//	System.out.println(">> "+productService.bookSearchName("소설5"));
//	
//	//6. 상품리스트 보기
//	System.out.println(">> "+productService.productList());
	}
}
