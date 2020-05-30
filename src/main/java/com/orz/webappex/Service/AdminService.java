package com.orz.webappex.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orz.webappex.Model.Brands;
import com.orz.webappex.Model.Category;
import com.orz.webappex.Model.Products;
import com.orz.webappex.Model.SubCategory;
import com.orz.webappex.dao.DbBrands;
import com.orz.webappex.dao.DbCategory;
import com.orz.webappex.dao.DbProducts;
import com.orz.webappex.dao.DbSubCategory;

@Service
public class AdminService {
	@Autowired
	private DbBrands dbBrand;
	@Autowired
	private DbCategory dbCategory;
	@Autowired
	private DbSubCategory dbSubCategory;
	@Autowired
	private DbProducts dbProduct;
	@Autowired
	private Category cat;
	@Autowired
	private Brands bra;
	@Autowired
	private SubCategory sub ;
	@Autowired
	private Products product ;
	
	public String addProduct(String name, String category, String subcategory, String brand, int price, int quantity) {
		int cid, scid , bid;
		String descrip = "";
		String mssg = "Product Added";
		cat = dbCategory.findBycategoryName(category);
		bra = dbBrand.findBybrandName(brand);
		sub = dbSubCategory.findBysubCategoryName(subcategory);	
		if (cat == null) {
		Category addC = new Category();
		addC.setCategoryName(category);
		dbCategory.save(addC);
		cat = dbCategory.findBycategoryName(category);			
		}
		if (bra == null) {
			Brands addB = new Brands();
			addB.setBrandName(brand);
			dbBrand.save(addB);
			bra = dbBrand.findBybrandName(brand);
		}
		if(sub == null )
		{
		SubCategory addS = new SubCategory(); 
		addS.setSubCategoryName(subcategory);
		dbSubCategory.save(addS);
		sub = dbSubCategory.findBysubCategoryName(subcategory);
		}
		cid = cat.getCategoryId();
		bid = bra.getBrandId();
		scid = sub.getSubCategoryId();
		product.setCategoryId(cid);
		product.setSubCategoryId(scid);
		product.setBrandId(bid);
		product.setPrice(price);
		product.setQuantity(quantity);
		product.setDescription(descrip);
		product.setName(name);
		Products pr = dbProduct.findProd(name, cid, scid, bid); 	
//		System.out.println("***************" +pr  );
		
		
		dbProduct.save(product);
		
	
		
		
		
		
		return mssg ;

	}

}
