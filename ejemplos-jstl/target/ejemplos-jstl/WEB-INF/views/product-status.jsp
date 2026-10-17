<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
    </head>
    <body>
        <h1>Estado del producto</h1>
        <h1><c:out value="${productName}"/></h1>
        <c:if test="${stock > 0}">
        <p class="available">Disponible: ${stock} unidades.</p>
        </c:if>
    </body>
</html>