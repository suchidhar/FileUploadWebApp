<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload File</title>
</head>
<body>
	<h3>File Upload:</h3>
	Select a file to upload:
	<br />
	<form action="./upload" method="post" enctype="multipart/form-data">
		<fieldset>
			<legend>Upload Your File</legend>

			<legend>Name : </legend>
			<input type="text" name="name" maxlength="20"
				placeholder="Enter name"> <br>

			<legend>Email : </legend>
			<input type="email" name="email" maxlength="30"
				placeholder="Enter email"><br>

			<legend>Browse Files to Upload : </legend>
			<input type="file" name="file" size="45" /> <br /> <input
				type="submit" name="" value="submit" />
		</fieldset>
	</form>

</body>
</html>
