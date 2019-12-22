package com.tyss.shoppingapplication.controller;

import java.util.List;
import java.util.Scanner;
import com.tyss.shoppingapplication.bean.ProductBean;
import com.tyss.shoppingapplication.factory.ProductFactory;
import com.tyss.shoppingapplication.service.ProductService;



public class ShoppingApp {
public static void main(String[] args) {
	ProductService productservice = ProductFactory.instanceOfProductService();
	Scanner sc = new Scanner(System.in);
	while (true) {
		System.out.println("1.press 1 for  All product :");
		System.out.println("2.press 2 for  search for  product");
		System.out.println( "3.press 3 for add the product");
		System.out.println("enter the choice: ");

		int productchoice = sc.nextInt();
		switch (productchoice) {
		case  1:
		      List<ProductBean> list = productservice.showAllProduct();
		        if (list != null) {    		
		} 
		       else {
			System.out.println(" Product List is empty");
		}
		break;
		case 2:
			ProductBean product;
		product = new ProductBean();
		System.out.println("enter the product name:");
		product.setProduct_Name(sc.next());

		if (productservice.searchProduct(product.getProduct_Name())) {
			System.out.println("searched");
		} else {
			System.err.println("something went wrong");
		}
		break;
		
		
		case 3:
			product = new ProductBean();
			System.out.println("enter the Product id:");
			product.setProduct_Id(sc.nextInt());
			
			System.out.println("enter the product name:");
			product.setProduct_Name(sc.next());
			
			System.out.println("enter the product cost");
			product.setProduct_cost(sc.nextDouble());
			
			System.out.println("enter the Description");
			product.setDescription(sc.next());
			
			System.out.println("enter the no of product");
			product.setNo_of_prroduct(sc.nextInt());

			if (productservice.addProduct(product)){
					
				System.out.println("inserted");
			} else {
				System.err.println("something went wrong");
			}

			break;
			
		}
		
		
		
		
		}//main switch case.
	
}//main while loop

	
	
}//end f main method
//ennd of class

