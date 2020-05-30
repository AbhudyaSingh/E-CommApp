package com.orz.webappex.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table (name = "subcategory")
public class SubCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subCategoryId; 
	private String subCategoryName;
	
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	public int getSubCategoryId() {
		return subCategoryId;
	}
	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}
	
}
