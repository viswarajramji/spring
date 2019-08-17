<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<html>
<head>
<title>luv2code Company Home Page</title>
</head>
<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	Welcome to the luv2code company home page!
</body>
<security:authentication property="principal.username" />
<security:authentication property="principal.authorities" />

<form:form method="post"
	action="${pageContext.request.contextPath}/logout">
	<input type="submit" name="submit" />
</form:form>
</body>

</html>