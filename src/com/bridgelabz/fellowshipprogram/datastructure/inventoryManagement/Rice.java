package com.bridgelabz.fellowshipprogram.oops.inventoryManagement;

public class Rice {
String name;
int weight;
int pricePerKg;
public Rice(String name, int weight, int pricePerKg) {
	super();
	this.name = name;
	this.weight = weight;
	this.pricePerKg = pricePerKg;
}
public Rice() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getPricePerKg() {
	return pricePerKg;
}
public void setPricePerKg(int pricePerKg) {
	this.pricePerKg = pricePerKg;
}

}
