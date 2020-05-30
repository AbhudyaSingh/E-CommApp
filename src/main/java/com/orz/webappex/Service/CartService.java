package com.orz.webappex.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orz.webappex.Model.Category;
import com.orz.webappex.Model.Product;
import com.orz.webappex.Model.Products;
import com.orz.webappex.Model.SubCategory;
import com.orz.webappex.dao.DbBrands;
import com.orz.webappex.dao.DbCategory;
import com.orz.webappex.dao.DbProducts;
import com.orz.webappex.dao.DbSubCategory;
@Service
public class CartService {
private List<Product> cart ;
private int total; 
@Autowired
DbProducts dbP;
@Autowired
DbBrands dbB;
@Autowired
DbCategory dbC;
@Autowired
DbSubCategory dbS;
public CartService() {
	super();
	cart = new ArrayList<Product>();
	total = 0 ; 
}
public void addCart(int pid  ) {
	Products product = dbP.find(pid); 
String cat = dbC.findById(product.getCategoryId()).getCategoryName();
String scat = 	dbS.findById(product.getSubCategoryId()).getSubCategoryName();
String brand =	dbB.findById(product.getBrandId()).getBrandName();
Product pro = new Product(pid,product.getName(),cat ,scat , brand, product.getPrice(),1,product.getDescription()); ; 
			
			
			cart.add(pro);
			total += product.getPrice();
}
public void removeCart(int pid) {
	 Iterator<Product> itr = cart.iterator();

     // remove all even numbers
     while (itr.hasNext()) {
         Product pro = itr.next();

         if (pro.getPid()== pid) {
             cart.remove(pro);
             total -= pro.getPrice() ;
         }
     }
	total = Math.max(0, total);
}

public int getTotal() {
	return total;
}
public List<Product> getCart() {
	return cart;
}



}
