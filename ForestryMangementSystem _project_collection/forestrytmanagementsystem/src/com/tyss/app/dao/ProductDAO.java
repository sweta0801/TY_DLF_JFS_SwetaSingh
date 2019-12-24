package com.tyss.app.dao;

import java.util.List;

import com.tyss.app.bean.ProductBean;



public interface ProductDAO {
	List <ProductBean> getAllProduct();
	 
	 boolean insertProduct(ProductBean product);
	boolean deleteproduct(int productId);
	 boolean  updateProduct(int productId , double productPrice );

}
