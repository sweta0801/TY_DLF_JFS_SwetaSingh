package com.tyss.forestry.factory;

import com.tyss.forestry.dao.CustomerDAO;
import com.tyss.forestry.dao.CustomerDAOImpl;
import com.tyss.forestry.dao.ProductDAO;
import com.tyss.forestry.dao.ProductDAOImpl;
import com.tyss.forestry.services.CustomerService;
import com.tyss.forestry.services.CustomerServiceImpl;
import com.tyss.forestry.services.ProductService;
import com.tyss.forestry.services.ProductServiceImpl;

public class ProductFactory {
	
	
private ProductFactory() {
		
	}

	public static ProductDAO instanceOfProductDAOImpl() {
		
		ProductDAO dao = new ProductDAOImpl();
		return dao;
		
	}
	public static ProductService instanceOfProductService(){
		ProductService service = new ProductServiceImpl();
		return service;
		
	}

}
