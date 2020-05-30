 
<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading"> ${product.name} </div>
        <div class="panel-body">
        <p>Price : ${product.price}  </p>
		<p>CategoryId:  ${product.categoryId} </p>  
	  	<p>SubCategoryId:  ${product.subCategoryId} </p> 
		<p>Quantity:  ${product.quantity} </p>  
		<p>BrandId:  ${product.brandId} </p>  
		</div>
		
        <div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
           onClick="location.href=' ' ">Buy</button></div>
      </div>
    </div>
   
  </div>
</div><br>

</body>
</html>