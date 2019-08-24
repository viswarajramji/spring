<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>testing</title>
</head>
<body>
	<security:authentication property="principal.authorities"/>
	<a href="${pageContext.request.contextPath}/employee">employee</a>
	<a href="${pageContext.request.contextPath}/manager">Manager</a>
	<form:form action="${pageContext.request.contextPath}/logout">
		<input type="submit" name="submit" />
	</form:form>
</body>
</html>