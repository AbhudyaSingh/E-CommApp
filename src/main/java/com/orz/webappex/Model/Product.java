package com.orz.webappex.Model;


public class Product {
	private int 	pid ; 
	private String name ;	
	private String category;
	private String subCategory ; 
	private String brand;
	private int	   price ; 
	private int    quantity;
	private String description;
	public Product(int pid, String name, String category, String subCategory, String brand, int price, int quantity,
			String description) {
		super();
		this.pid = pid;
		this.name = name;
		this.category = category;
		this.subCategory = subCategory;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	

	
}