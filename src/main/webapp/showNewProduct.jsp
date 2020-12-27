<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Products</title>
</head>

<body>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:choose>
        <c:when test="${not empty products}">
            <h1>Products</h1>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>
                    <c:out value="${product.getId()}" />
                </td>
                <td>
                    <c:out value="${product.getName()}" />
                </td>
                <td>
                    <c:out value="${product.getFormattedPrice()}" />
                </td>
                <td>
                    <c:out value="${product.getQuantity()}" />
                </td>
            </tr>
        </c:forEach>
    </table>
        </c:when>
        <c:otherwise>
            <h1>Product Table is Empty</h1>
        </c:otherwise>
    </c:choose>
    <br>
    <a href="index.jsp"><button>Add Product</button></a>
</body>

</html>