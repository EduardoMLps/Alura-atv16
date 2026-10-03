<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empresa criada</title>
</head>
<body>
	<c:if test="${not empty nome }">
		A empresa ${ nome } foi cadastrada	
	</c:if>
	<c:if test="${empty nome }">
		Nenhuma empresa foi cadastrada	
	</c:if>

</body>
</html>