package com.orz.webappex.dao;

import org.springframework.data.repository.CrudRepository;

import com.orz.webappex.Model.SubCategory;


public interface DbSubCategory extends CrudRepository<SubCategory, Integer> {

	SubCategory findBysubCategoryName(String subcategory);
	SubCategory findById(int id );
	
}
