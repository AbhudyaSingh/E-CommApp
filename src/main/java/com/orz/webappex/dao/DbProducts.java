package com.orz.webappex.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.orz.webappex.Model.Products;

public interface DbProducts extends JpaRepository<Products, Integer> {
	
	Products findByName(String name);
	@Query(" from Products where name = :name and categoryId= :cid and subCategoryId = :scid and brandId = :bid " )
	Products findProd(@Param("name") String name ,@Param("cid") int cid, @Param("scid") int scid , @Param("bid") int bid  );
	@Query(" from Products where productId = :pid")
	Products find(@Param("pid")int pid );
}
