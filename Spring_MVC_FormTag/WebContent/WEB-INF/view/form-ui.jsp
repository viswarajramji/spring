<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>

		<form:select path="country">
			<form:option value="BRA" label="Brazil"></form:option>
			<form:option value="IND" label="India"></form:option>
			<form:option value="CAN" label="Canada"></form:option>
			<form:option value="USA" label="United States"></form:option>
		</form:select>

		<form:radiobutton path="phone" value="Java" /> Java
		<form:radiobutton path="phone" value="oracle" /> Oracle
		<form:radiobutton path="phone" value="Google" /> Google
		<form:radiobutton path="phone" value="Microsoft" /> Microsoft
		

		<br>
		<br>



		<input type="submit" value="Submit" />



	</form:form>


</body>

</html>












