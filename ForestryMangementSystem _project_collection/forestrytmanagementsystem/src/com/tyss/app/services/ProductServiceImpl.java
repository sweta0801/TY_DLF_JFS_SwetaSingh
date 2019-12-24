package com.tyss.app.services;

import java.util.List;

import com.tyss.app.bean.ProductBean;
import com.tyss.app.dao.ProductDAO;
import com.tyss.app.factory.ProductFactory;

public class ProductServiceImpl implements ProductService {

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
