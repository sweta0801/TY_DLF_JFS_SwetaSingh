package com.tyss.shoppingapplication.bean;

import java.io.Serializable;

public class ProductBean  implements Serializable {
	private int Product_Id;
	private String Product_Name;
	private Double product_cost;
	private String Description;
	private int No_of_product;	
	
	public int getProduct_Id() {
		return Product_Id;
	}
	public void setProduct_Id(int product_Id) {
		Product_Id = product_Id;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public Double getProduct_cost() {
		return product_cost;
	}
	public void setProduct_cost(Double product_cost) {
		this.product_cost = product_cost;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNo_of_prroduct() {
		return No_of_product;
	}
	public void setNo_of_prroduct(int no_of_prroduct) {
		No_of_product = no_of_prroduct;
	}
	@Override
	public String toString() {
		return "Product [Product_Id=" + Product_Id + ", Product_Name=" + Product_Name + ", product_cost=" + product_cost
				+ ", Description=" + Description + ", No_of_product=" + No_of_product + "]";
	}
	
	
	

}
