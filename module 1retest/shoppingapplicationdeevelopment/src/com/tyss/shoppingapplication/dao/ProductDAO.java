package com.tyss.shoppingapplication.dao;

import java.util.List;

import com.tyss.shoppingapplication.bean.ProductBean;


public interface ProductDAO {
	
	List<ProductBean> showAllProduct();
	
	boolean searchProduct(String Product_Name);
	boolean addProduct(ProductBean  product);
 
	
	
}
