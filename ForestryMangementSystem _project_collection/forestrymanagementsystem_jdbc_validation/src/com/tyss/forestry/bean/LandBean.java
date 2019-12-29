package com.tyss.forestry.bean;

public class LandBean {
	
private	int landId;
private int landArea;
private double landCost;

public int getLandId() {
	return landId;
}
public void setLandId(int landId) {
	this.landId = landId;
}
public int getLandArea() {
	return landArea;
}
public void setLandArea(int landArea) {
	this.landArea = landArea;
}
public double getLandCost() {
	return landCost;
}
public void setLandCost(double landCost) {
	this.landCost = landCost;
}
@Override
public String toString() {
	return "LandBean [landId=" + landId + ", landArea=" + landArea + ", landCost=" + landCost + "]";
}

}
