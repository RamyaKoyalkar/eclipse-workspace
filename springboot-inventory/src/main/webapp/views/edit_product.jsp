<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Product</title>
</head>
<body>
<div align="center">
        <h1>Edit Product</h1>
        <br />
         <form:form id="productform" action="save" method="post" modelAttribute="product">
       

            <table border="0" cellpadding="10">
                <tr>            
                    <td>Product ID:</td>
                    <td>
                        <input type="text" name="id" value=${product.id} readonly="readonly" />
                        </td>
                </tr>       
                <tr>            
                    <td>Product Name:</td>
                    <td>
                        <input type="text" name="name" value=${product.name} readonly="readonly" >
                    </td>
                </tr>
                <tr>
                    <td>Brand:</td>
                    <td><input type="text" name="brand" value=${product.brand} readonly="readonly"></td>
                </tr>
                <tr>
                    <td>Made In:</td>
                    <td><input type="text" name="madein" value=${product.madein} readonly="readonly" ></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><input type="text" name="price" value=${product.price}></td>
                </tr>                           
                <tr>
                    <td colspan="2"><button type="submit">Save</button> </td>
                    </tr>
            </table>
       </form:form>
    </div>
</body>
</html>