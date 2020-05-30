<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel = "stylesheet" href="login.css">
<title>E-Comm</title>
<body>
<!--End of navbar     -->
<!--Start of front layout-->
<header class="hero"> 
<div class = "row">    
<div class ="banner" >

<form action="login" class ="form-format" method ="post" >
    <fieldset>
        <legend>Login:</legend>
        <br>
        <p>
            <label for="name">UserId:</label>
            <input id="name" type="text" name = "uid" value ="${uid}" />
        </p>
                <br>

        <p>
            <label for="Password">Password:</label>
            <input type="password" name ="password" value ="${password}" />
        </p>
        <br>
        <p class="submit">
            <input type="submit" value="Submit" />
        </p>
        <br>
    </fieldset>
</form>
    

</div>

<div class= "banner">
<form action="signup" method ="post">
    <fieldset>
        <legend>Sign Up:</legend>
        <br>
        <p>
            <label for="name">Name:</label>
            <input name="name" type="text" value ="${user.name}" />
        </p>
                <br>

        <p>
            <label for="Age">Age</label>
            <input name="age" type="number" value ="${user.age}" />
        </p>
                <br>

        <p>
            <label for="e-mail">Email:</label>
            <input type="email" name ="email" value ="${useremail}" />
        </p>
        
         <p>
             <br>
        <label for="Password">Password:</label>
            <input type="password" name= "password" value ="${user.password}" />
        </p>
        <br>
        <p class="submit">
            <input type="submit" value="Create" />
            
        </p>
        <br>
    </fieldset>
</form>
    
</div>    
</div>    


</header>
</body>
</html>
