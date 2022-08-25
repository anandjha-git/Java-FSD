<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<style>
table, td, th {
	border: 1px solid #ddd;
	text-align: left;
}

table {
	border-collapse: collapse;
	width: 80%;
}

th, td {
	padding: 15px;
}

.center {
	margin-left: auto;
	margin-right: auto;
}

.container {
	margin: auto;
	width: 30%;
	border: 3px solid green;
	padding-left: 50px;

}
</style>
<body>

	<h2>User Detail</h2>

	<table class="center">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		<tr>
			<td>${userSearch.id}</td>
			<td>${userSearch.name}</td>
			<td>${userSearch.email}</td>
			<td>${userSearch.password}</td>
		</tr>
	</table>
	<br>
	<div class="container">
		<form:form action="update" method="post" commandName="update">
			<h3>Update User..</h3>
			<p>User ID: ${userSearch.id}</p>
			<input type="hidden" name="id" id="id" value="${userSearch.id}"
				required />
			<label for="name">Name:</label>
			<br />
			<input type="text" name="name" id="name" value="${userSearch.name}"
				required />
			<br />
			<label for="email">Email:</label>
			<br />
			<input type="text" name="email" id="email"
				value="${userSearch.email}" required />
			<br />
			<label for="password">Password: </label>
			<br />
			<input type="text" name="password" id="password"
				value="${userSearch.password}" required />
			<br />
			<br />
			<input type="submit" value="Save" />
		</form:form>
		<br /> <br /> <a href="/"><b>Back</b></a>
	</div>
</body>
</html>
