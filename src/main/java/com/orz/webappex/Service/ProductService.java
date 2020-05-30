package com.orz.webappex.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orz.webappex.Model.Products;
import com.orz.webappex.dao.DbProducts;

@Service
public class ProductService {
	
	@Autowired
	private DbProducts dbProduct;

	public List<Products> getAllProducts(){
		List<Products> products = dbProduct.findAll();
		return products; 
		
	}
	
//	public List<Product> getAllProducts(){
//		
//		List<Products> products = dbProduct.findAll();
//		List<Product> prod = new ArrayList<Product>();
//		for(Products product : products){
//		String cat = dbC.findById(product.getCategoryId()).getCategoryName();
//		String scat = 	dbS.findById(product.getSubCategoryId()).getSubCategoryName();
//		String brand =	dbB.findById(product.getBrandId()).getBrandName();
//		Product pro = new Product(pid,product.getName(),cat ,scat , brand, product.getPrice(),1,product.getDescription()); ; 
//		prod.add(pro);
//		}
//		return prod; 
//		
//	}
	
	
}
