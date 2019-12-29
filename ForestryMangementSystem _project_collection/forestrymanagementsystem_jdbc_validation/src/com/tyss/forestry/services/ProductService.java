package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.ProductBean;

public interface ProductService {
	
	List <ProductBean> getAllProduct();
	 
	 boolean insertProduct(ProductBean product);
	boolean deleteproduct(int productId);
	 boolean  updateProduct(int productId,double productPrice );


}
