<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>luv2code Company Home Page</title>
</head>
<body>
	<h2>luv2code Company Home Page</h2>
	<hr>
	Welcome to the luv2code company home page!
</body>
<form:form method="post"
	action="${pageContext.request.contextPath}/logout">
	<input type="submit" name="submit" />
</form:form>
</body>

</html>