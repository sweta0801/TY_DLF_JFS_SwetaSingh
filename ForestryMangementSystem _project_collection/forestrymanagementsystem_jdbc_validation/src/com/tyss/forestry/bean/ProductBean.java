package com.tyss.forestry.bean;

import java.io.Serializable;

public class ProductBean implements Serializable{

	private int productId;
	private String productName;
	private double ProductPrice;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", ProductPrice=" + ProductPrice
				+ "]";
	}
	
	
	
}
