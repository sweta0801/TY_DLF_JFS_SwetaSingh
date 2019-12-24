package com.tyss.app.factory;

import com.tyss.app.dao.ProductDAO;
import com.tyss.app.dao.ProductDAOImpl;
import com.tyss.app.services.ProductService;
import com.tyss.app.services.ProductServiceImpl;

public class ProductFactory {

private  ProductFactory() {
	
		}

public static ProductDAO instanceOfProductDAOImpl() {
	
	ProductDAO dao = new ProductDAOImpl();
	return dao;

}
public static ProductService instanceOfProductService() {
	ProductService  services = new ProductServiceImpl();
	return services;
	
}


}
