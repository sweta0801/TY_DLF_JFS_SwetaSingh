package com.tyss.forestry.dao;

import java.util.List;
import com.tyss.forestry.bean.ProductBean;

public interface ProductDAO {
	List <ProductBean> getAllProduct();
	 
	 boolean insertProduct(ProductBean product);
	boolean deleteproduct(int productId);
	 boolean  updateProduct(int productId , double productPrice );


	
}
