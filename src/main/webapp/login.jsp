<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>INSERISCI I TUOI DATI</title>
</head>
<body>
</head>
<body>
	<h2>INSERISCI I TUOI DATI</h2>

	<form action="/action_page.php">
		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" required>

			<button type="submit">Login</button>
		</div>

		<div class="container" style="background-color: #f1f1f1"></div>
	</form>

</body>
</html>
</body>