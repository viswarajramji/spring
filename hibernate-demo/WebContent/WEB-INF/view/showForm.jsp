<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>List Customers</title>

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<form:form modelAttribute="customer" action="saveForm">
			<form:input path="name" />
			<form:input path="email" />
			<input type="submit" name="submit" />
		</form:form>
	</div>
</body>

</html>









