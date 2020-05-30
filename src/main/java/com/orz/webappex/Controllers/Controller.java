package com.orz.webappex.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.orz.webappex.Model.Product;
import com.orz.webappex.Model.Products;
import com.orz.webappex.Model.Users;
import com.orz.webappex.Service.AdminService;
import com.orz.webappex.Service.CartService;
import com.orz.webappex.Service.ProductService;
import com.orz.webappex.Service.UserService;

@RestController
public class Controller   {
	@Autowired
	UserService service;
	@Autowired
	AdminService adminService;
	@Autowired
	ProductService productService; 
	@Autowired
	CartService cartService; 
@GetMapping(value="home")
public ModelAndView home() {
	ModelAndView mv = new ModelAndView("home");
	 System.out.println("**************You are Viewing Home********");

	return  mv ; 
			
}
	
@PostMapping("login" )	
 public ModelAndView login( @RequestParam("uid") int uid ,@RequestParam("password") String password )
{	 
	 ModelAndView mv = new ModelAndView();
	 System.out.println("***************Login Request Received********");
	 Users user = service.findUser(uid);
	 String []res = new String[2];
	 res = service.grantAcess(user, password);
	 mv.setViewName(res[0]);
	 mv.addObject("mssg",res[1] );
	 return mv ;

	 }
	 
@PostMapping("signup" )	
public ModelAndView signUp(@ModelAttribute Users user, BindingResult bindingResul)  {
	 ModelAndView mv = new ModelAndView("loggedin");
	 System.out.println("*************Sign Up Request received ********");
	 String mssg = service.addUser(user);
	 mv.addObject("mssg" , mssg);
	 return mv ; 
}	
//@GetMapping("admin")	
//public ModelAndView adminPage() {
//	ModelAndView mv = new ModelAndView("admin");
//	System.out.println("**************************************Admin Page************************");
//	return mv;
//}
@GetMapping("index")
ModelAndView addCart(){
ModelAndView mv = new ModelAndView("index");
return  mv ;
}
@PostMapping("addproduct")	
public ModelAndView addProduct(@RequestParam("name") String name, 
		@RequestParam("category") String category ,
		@RequestParam("subcategory") String subcategory ,
		@RequestParam("brand") String brand ,
		@RequestParam("price") int price ,
		@RequestParam("quantity") int quantity   ){
		
		ModelAndView mv = new ModelAndView("admin");
		String mssg = ""; 
		mssg = adminService.addProduct(name, category, subcategory, brand, price, quantity);
		mv.addObject("mssg", mssg);
		return mv;
}
@GetMapping("allproduct")
ModelAndView getProducts(){
List<Products> products =  productService.getAllProducts();
ModelAndView mv = new ModelAndView("allproduct");
mv.addObject("products",products); 
return  mv ;
}
@GetMapping("usercart")
ModelAndView userCart(){
List<Product> products =  cartService.getCart();
ModelAndView mv = new ModelAndView("cart");
mv.addObject("products",products); 
mv.addObject("total" , cartService.getTotal());
return  mv ;
}
@GetMapping("{pid}")
ModelAndView addCart(@PathVariable("pid")int pid ){
cartService.addCart(pid);
List<Products> products =  productService.getAllProducts();
ModelAndView mv = new ModelAndView("allproduct");
mv.addObject("products",products); 

return  mv ;
}
@GetMapping("remove/{pid}")
ModelAndView removeCart(@PathVariable("pid") int pid  ){
cartService.removeCart(pid);
List<Products> products =  productService.getAllProducts();
ModelAndView mv = new ModelAndView("/allproduct");
mv.addObject("products",products); 

return  mv ;
}


}
