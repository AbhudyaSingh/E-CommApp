package com.orz.webappex.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table (name = "brands")
public class Brands {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brandId;
	private String brandName; 
	public Brands() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBrandId() {
		return brandId;
	}
	public void setBrandid(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
	
	
}
