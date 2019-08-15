<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>

<html>

<head>
<title>Student Registration Form</title>
<style type="text/css">
.error {
	color: red
}
</style>
</head>

<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />

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

		<form:checkbox path="company" value="Google" /> Google
		<form:checkbox path="company" value="MS" /> Microsoft
		<form:checkbox path="company" value="facebook" /> FaceBook
		<form:checkbox path="company" value="Amazon" /> Amazon
		
		<input type="submit" value="Submit" />



	</form:form>


</body>

</html>












