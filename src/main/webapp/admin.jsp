<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style = " align:center" > Welcome Admin </h1>
<br>
<div>
<form  action ="addproduct" method = "post" >
 Product Name <input type = "text" name = "name" value = "${name} "/><br>
 Category <input type = "text" name = "category" value = "${category} "/><br>
 Sub-Category <input type = "text" name = "subcategory" value = "${subcategory} "/><br>
 Brand <input type = "text" name ="brand" value = "${brand} "/><br>
 Price<input type = "number"  name ="price" value = "${price}"/><br>
 quantity<input type = "number" name = "quantity" value = "${quantity}"><br>
 <br>
<input type = "submit" name ="Add product" >
<br>
</form> 

</div>
<h1>${mssg}<</h1>
</body>
</html>