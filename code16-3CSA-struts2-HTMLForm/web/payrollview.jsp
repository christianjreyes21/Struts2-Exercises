<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll View Page</title>
</head>
<body>
	<h1>
		payroll computational details
	</h1>
	
	<p>Hours Worked: ${hoursWorked}</p>
	<p>Pay Rate: ${payRate}</p>
	<p>GrossPayment: ${grossPay}</p>
	
	<form action="../payrollform.jsp" method="post">
		<p><input type="submit" value"Compute Another"></p>
	</form>
	
</body>
</html>