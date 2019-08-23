<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>hello this is home page</title>
</head>
<body>
	welcome to home page
	<form:form action="${pageContext.request.contextPath}/logout">
		<input type="submit" name="logout" />
	</form:form>
</body>
</html>