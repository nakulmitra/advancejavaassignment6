<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.nagarro.flight.search.model.Flight,java.util.List"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
input[type=text], select {
  padding: 12px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}
h2{
margin-left: 150px;
}
.form1{
 background-color: #f1f1f1;
        width: 470px;
        height: 480px;
        margin: 1em auto;
        border-radius: 1em;
        box-shadow: 0px 11px 35px 2px rgba(0, 0, 0, 0.14);
        
   /* only for demonstration, should be removed 
float: center;
  padding: 70px;
  background-color: #f1f1f1;
  height: 300px;*/
}
.form-popup {
	display: none;
	position: top;
	right: 15px;
	border: 3px solid #f1f1f1;
	z-index: 9;
}

.form-container {
	max-width: 10px;
	padding: 10px;
	background-color: white;
}
#all{
margin-left: 20px;
}
</style>
<title>Flight Search</title>
</head>
<body style="background-color: #eeeeee;">
<hr>
<div style="background-color: #82b1ff;">
	<form action="all_flights" method="post">
		<input type="submit" id="all" value="All Flights List"></button>
	</form>
</div>
	
	<hr>
	<div style="background-color: #00e5ff;">
	<form class="form1" action="sort_flight" method="post">
	<hr><h2><b>Flight Search</b></h2><hr>
	<table>
	<tr>
		<td><div style="padding-left: 10px;">
			<b>Depature Location</b>
			</div>
		</td>
		<td>
		<input type="text"  name="departure"> 
		</td>
	</tr>
	<tr>
		<td><div style="padding-left: 10px;">
			<b>Arrival Location</b></div>
		</td>
		<td>
			<input type="text" name="arrival"> 
		</td>
	</tr>
	<tr>
		<td><div style="padding-left: 10px;">
			<b>Flight Date</b></div>   
		</td>
		<td>
			<input type="text" name="date"><br>
		</td>
	</tr>
	<tr>
		<td><div style="padding-left: 10px;">
			<b>Flight Class</b></div>
		</td>
		<td>
			<pre>
<input type="radio" id="ee" name="clas" value="E"><label for="ee">Economic </label>     <input type="radio" id="eeb" name="clas" value="EB"> <label for="eeb">Business</label>
			</pre>
		</td>
	</tr>
	<tr>
		<td><div style="padding-left: 10px;">
			<b>Result Preference</b></div>
		</td>
		<td>
			<pre>
<input type="radio" id="e" name="pref" value="fare"></input><label for="e">Sort by fare </label> <input type="radio" id="eb" name="pref" value="Duration"> <label for="eb">Sort by Duration & fair</label>
	    	</pre>
	    </td>
	</tr>
	<tr>
		<td>
		</td>
		<td>
		<pre>
        <input type="submit" Value="Search">
		</pre>
		</td>
	</tr>
	</table>
	
	</form>
	</div>
</body>
</html>