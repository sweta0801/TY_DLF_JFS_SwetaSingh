package com.tyss.shoppingapplication.service;

import java.util.List;
import com.tyss.shoppingapplication.bean.ProductBean;
import com.tyss.shoppingapplication.dao.ProductDAO;
import com.tyss.shoppingapplication.factory.ProductFactory;

public class ProductServiceImpl  implements ProductService{
	ProductDAO dao = ProductFactory.instanceOfProductDAOImpl();

	@Override
	public List<ProductBean> showAllProduct() {
		// TODO Auto-generated method stub
		return dao.showAllProduct();
	}

	@Override
	public boolean searchProduct(String Product_Name) {
		// TODO Auto-generated method stub
		return dao.searchProduct(Product_Name);
	}

	@Override
	public boolean addProduct(ProductBean product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}
	

}
