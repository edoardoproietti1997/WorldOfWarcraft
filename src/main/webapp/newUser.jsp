<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<html>
<body>
<form action ="registrazione" method = "GET">

	username:<br>
  <input type="text" name="username"><br>
  nome:<br>
  <input type="text" name="nome"><br>
  cognome:<br>
  <input type="text" name="cognome"><br>
  passworld:<br>
  <input type="text" name="firstname"><br>
  mail:<br>
  <input type="text" name="Email"><br>
  
  <input type="radio" name="classe" value="castello"><img src="https://www.pinclipart.com/picdir/middle/88-883659_fantasy-city-clipart-castle-medieval-city-icon-transparent.png" alt="castello" width="75" height="100" >castello<br>
<input type="radio" name="classe" value="guerriero"><img src="https://cdn.iconscout.com/icon/premium/png-512-thumb/shield-arrow-myth-legend-halloween-fantasy-1-34610.png" alt="guerriero" width="75" height="100" >guerriero<br>
<input type="radio" name="classe" value="mago"><img src="https://cdn3.iconfinder.com/data/icons/halloween/512/magic_hat-512.png" alt="mago" width="75" height="100" >mago<br>
 
<br>
<br>  
<input type = "submit" value ="crea il tuo personaggio">
</form>
</body>
</html>