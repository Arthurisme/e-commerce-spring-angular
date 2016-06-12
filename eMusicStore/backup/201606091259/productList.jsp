<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Arthur
  Date: 2016-06-09
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<table class="table table-striped table-hover">
    <thead>
    <tr class="bg-success">
        <th>Product Name</th>
        <th>Category</th>
        <th>Condition</th>
        <th>Price</th>
    </tr>
    </thead>
        <tr>

            <td>${product.productName}</td>
            <td>${product.productCategory}</td>
            <td>${product.productCondition}</td>
            <td>${product.productPrice} USD</td>

        </tr>
 </table>

</body>
</html>
