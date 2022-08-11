<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Data</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  text-align:center;
  font-size:25px;
}
table{
width:50%;
}
</style>
</head>
<body>
	<h1 style="text-align:center;">Product Details</h1>
	<table  align="center">
		<tr bgcolor="gray">
			<th>Components</th>
			<th>Value</th>
		</tr>
		<tr>
			<td>Name</td>
			<td><%=session.getAttribute("Pname")%></td>
		</tr>
		<tr>
			<td>Quantity</td>
			<td><%=session.getAttribute("Quantity")%></td>
		</tr>
		<tr>
			<td>Price</td>
			<td><%=session.getAttribute("Price")%></td>
		</tr>

	</table>
</body>
</html>

