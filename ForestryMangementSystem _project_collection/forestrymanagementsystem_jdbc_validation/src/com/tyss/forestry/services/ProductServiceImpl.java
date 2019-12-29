package com.tyss.forestry.services;

import java.util.List;

import com.tyss.forestry.bean.ProductBean;
import com.tyss.forestry.dao.CustomerDAO;
import com.tyss.forestry.dao.ProductDAO;
import com.tyss.forestry.factory.CustomerFactory;
import com.tyss.forestry.factory.ProductFactory;

public class ProductServiceImpl  implements ProductService{
	 
	ProductDAO dao = ProductFactory.instanceOfProductDAOImpl();
	

	@Override
	public List<ProductBean> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public boolean insertProduct(ProductBean product) {
		
		return dao.insertProduct(product);
	}

	@Override
	public boolean deleteproduct(int productId) {
		
		return dao.deleteproduct(productId);
	}

	@Override
	public boolean updateProduct(int productId, double productPrice) {
		
		return dao.updateProduct(productId, productPrice);
	}
	
	

}
