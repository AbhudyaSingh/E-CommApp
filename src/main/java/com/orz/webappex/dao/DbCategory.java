package com.orz.webappex.dao;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.orz.webappex.Model.Category;

public interface DbCategory extends CrudRepository< Category, Integer>{
	
	@Query("select * from category_name = :category")
	public Category findBycategoryName(@Param("category")String category);
	
	Category findById(int id );
}
