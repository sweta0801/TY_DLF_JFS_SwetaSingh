package com.tyss.shoppingapplication.factory;

import com.tyss.shoppingapplication.dao.ProductDAO;
import com.tyss.shoppingapplication.dao.ProductDAOImpl;
import com.tyss.shoppingapplication.service.ProductService;
import com.tyss.shoppingapplication.service.ProductServiceImpl;

public class ProductFactory {
	private ProductFactory() {

	}

	public static ProductDAO instanceOfProductDAOImpl() {
		ProductDAO dao= new ProductDAOImpl();
		
		return dao;

	}

	public static ProductService instanceOfProductService() {
		// TODO Auto-generated method stub
		ProductService service = new ProductServiceImpl();

		return service;
	}

	

}
