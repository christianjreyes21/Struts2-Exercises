<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll Application Form</title>
</head>
<body>
	<h1>Welcome to Payroll Application</h1>
	<p><i>Please fill-out the required fields.</i>
	
	<form action="hr/compute"method="post">
		<p>Hours Worked: <input type="number" name="hoursWorked" id="hoursWorked" size="10"></p>
		<p>Pay Rate: <input type="number" name="payRate" id="payRate" size="10"></p>
		
		<input type="submit" value="Compute Salary">
		<br/>
		<input type="reset">
	</form>
</body>
</html>