<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!Doctype html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<link rel="stylesheet" href="${ctx}/<spring:theme code='styleSheet'/>" type="text/css"/>

</head>
<body>
	<center><div class="list-group w-50 p-3" >
	<form method="post" >
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input name="email" type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input name="password" type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
  </div>
  <div class="form-group form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Check me out</label>
  </div>
  <button type="submit" class="btn btn-primary" >Submit</button>
</form>
	<center><div class="list-group w-50 p-3" >
		<a href="/EconomicFaculté"" class="list-group-item list-group-item-action ">
			Faculté des Sciences Juridiques, Economiques et Sociales </a>
			 <a href="ScienceFaculté"
			class="list-group-item list-group-item-action">Faculté des
			Sciences</a>
			<a href="/LettreFaculté" class="list-group-item list-group-item-action">Faculté
			des Lettres et des Sciences Humaines </a>
			 <a href="/ENCG"
			class="list-group-item list-group-item-action">Ecole Nationale de
			Commerce et Gestion</a>
			 <a href="/ENSA"
			class="list-group-item list-group-item-action ">Ecole
			Nationale des Sciences Appliquées</a>
	</div></center>
	
</body>


</html>