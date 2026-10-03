
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h1>Preencha formulario</h1>

<form action="<c:url value="novaEmpresa"/>" method="Post">
	Nome: <input type="text" name="nome"/>
	Data: <input type="text" name="data"/>
	<input type="submit">
	
</form>
</body>
</html>