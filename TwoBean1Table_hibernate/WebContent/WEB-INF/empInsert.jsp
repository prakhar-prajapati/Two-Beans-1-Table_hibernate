<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Insert</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
<div class="col-sm-4">
<h1 >Employee Details</h1>
<h3>${msg}</h3>
<form action="insertEmpDetails">


<div class="form-group">
 <label >NAME:</label>
<input type="text" name="name" class="form-control" />
</div>

<div class="form-group">
 <label >Salary:</label>
<input type="text" name="salary" class="form-control" />
</div>

<div class="form-group">
 <label >City:</label>
<input type="text" name="address.city" class="form-control" />
</div>

<div class="form-group">
 <label >State:</label>
<input type="text" name="address.state" class="form-control" />
</div>

<div class="form-group">
 <label >Country:</label>
<input type="text" name="address.country" class="form-control" />
</div>

<input type="submit" value="REGISTER" class="btn btn-primary">
</form>
</div>
</div>

</body>
</html>