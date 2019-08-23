<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>hello this is index page</title>
</head>
<body>
	<form:form
		action="${pageContext.request.contextPath}/authenticateTheUser"
		method="POST">

		<!-- Check for login error -->

		<c:if test="${param.error!=null}">
		<i>
		Invalid user name and password
		</i>
		</c:if>

		<p>
			User name: <input type="text" name="username" />
		</p>

		<p>
			Password: <input type="password" name="password" />
		</p>

		<input type="submit" value="Login" />

	</form:form>
	</form>
</body>
</html>