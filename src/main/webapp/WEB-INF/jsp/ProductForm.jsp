<%--
  Created by IntelliJ IDEA.
  User: vedantas
  Date: 1/29/2018
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Input Form</title>
    <link href="<c:url value="/resources/css/main.css"/>" rel="stylesheet"/>
</head>
<body>
<h1>Product Input Form</h1>
<div id="global">
    <form action="product_save.action" method="post">
        <fieldset>
            <legend>A Product Form</legend>
            <p>
                <label for="name">Product name:</label>
                <input type="text" id="name" name="name" tabindex="1">
            </p>
            <p>
                <label for="description">Product description:</label>
                <input type="text" id="description" name="description" tabindex="2">
            </p>
            <p>
                <label for="price">Price: </label>
                <input type="text" id="price" name="price" tabindex="3">
            </p>
            <p id="buttons">
                <input type="reset" id="rest" name="reset" tabindex="4">
                <input type="submit" id="submit" name="submit" tabindex="5">
            </p>
        </fieldset>
    </form>
</div>
</body>
</html>
