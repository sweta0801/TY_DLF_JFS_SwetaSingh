package com.tyss.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.tyss.app.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {

	private List<ProductBean> productbean = new ArrayList<ProductBean>();

	@Override
	public List<ProductBean> getAllProduct() {

		return productbean;
	}

	@Override
	public boolean insertProduct(ProductBean product) {
		for (ProductBean productBean2 : productbean) {

			if (product.getProductId() == productBean2.getProductId()) {
				return false;
			}

		}
		productbean.add(product);
		return true;
	}

	@Override
	public boolean deleteproduct(int productId) {

		for (ProductBean productBean2 : productbean) {

			if (productBean2.getProductId() == productId) {

				productbean.remove(productBean2);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean updateProduct(int productId, double newproductprice) {

		for (ProductBean productBean2 : productbean) {
			if (productBean2.getProductId() == productId) {

				productBean2.setProductPrice(newproductprice);
				return true;
			}
		}
		return false;
	}

}
