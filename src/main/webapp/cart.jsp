<%@ include file="header.jsp" %>

<div class="container">    
  <div class="row">
  <c:forEach items="${products}" var="product">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading"> ${product.name} </div>
        <div class="panel-body">
        <p>Price : ${product.price}  </p>
		<p>Category:  ${product.category} </p>  
	  	<p>SubCategory:  ${product.subCategory} </p> 
		<p>Quantity:  ${product.quantity} </p>  
		<p>Brand:  ${product.brand} </p>  
        </div>
          <div class="panel-footer"> <button class="btn btn-primary btn-md"
         onClick="location.href='remove/${product.pid}'"   >Remove</button></div>
      </div>
    </div>
    </c:forEach>
  </div>
</div><br>
<h1> Cart value = ${total}</h1>
</body>
</html>