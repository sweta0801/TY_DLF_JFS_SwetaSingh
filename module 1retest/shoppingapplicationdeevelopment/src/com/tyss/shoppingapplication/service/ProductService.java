package com.tyss.shoppingapplication.service;

import java.util.List;

import com.tyss.shoppingapplication.bean.ProductBean;

public interface ProductService {
	
List<ProductBean> showAllProduct();
	
	boolean searchProduct(String Product_Name);
	boolean addProduct(ProductBean  product);

}
