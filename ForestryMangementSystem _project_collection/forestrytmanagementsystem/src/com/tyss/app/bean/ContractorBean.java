package com.tyss.app.bean;

import java.io.Serializable;
import java.sql.Date;

public class ContractorBean implements Serializable {
		private int contractno;
	private int customerId;
	private int productId;
	private int haulierId;
	private Date  deliveryDate;
	
	 public int getContractno() {
		return contractno;
	}
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getHaulierId() {
		return haulierId;
	}
	public void setHaulierId(int haulierId) {
		this.haulierId = haulierId;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	private int quality;
	@Override
	public String toString() {
		return "ContractorBean [contractno=" + contractno + ", customerId=" + customerId + ", productId=" + productId
				+ ", haulierId=" + haulierId + ", deliveryDate=" + deliveryDate + ", quality=" + quality + "]";
	}

	

}
