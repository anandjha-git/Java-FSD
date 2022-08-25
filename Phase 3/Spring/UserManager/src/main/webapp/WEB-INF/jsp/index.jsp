<html>
<head>
<style type="text/css">
div {
	margin: auto;
	width: 50%;
	border: 3px solid green;
	padding: 10px;
}
</style>
</head>
<body><br>
	<div class="container">
		<h2>Search User By Id AND Update</h2>
		
		<form action="search/{id}" method="post">
			Enter ID : <input name="id" type="text" id="id" placeholder="Enter Id Like 1 or 2 or.."
				required /> <input name="Submit" type="submit" />
		</form>
		<br>
		<a href="users"><b>See the All Users</b></a><br><br>
	</div>
</body>
</html>
