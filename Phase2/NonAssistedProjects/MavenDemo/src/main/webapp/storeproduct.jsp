<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Enter Values to Store Product</h2>
<form action="ProductStoreController" method="post">
<label>Enter Product Id</label>
<input type="number" name="pid"required/><br/>
<label>Enter Product Name</label>
<input type="text" name="pname"required/><br/>
<label>Enter Product Price</label>
<input type="number" name="price"required/><br/>

<input type="submit" value="Store Product">
<input type="reset" value="reset">
</form>
<br/>


</body>
</html>