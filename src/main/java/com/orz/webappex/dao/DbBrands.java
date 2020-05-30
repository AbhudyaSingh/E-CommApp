package com.orz.webappex.dao;

import org.springframework.data.repository.CrudRepository;

import com.orz.webappex.Model.Brands;



public interface DbBrands extends CrudRepository<Brands, Integer> {

	Brands findBybrandName(String brand);
	Brands findById(int id );
}
