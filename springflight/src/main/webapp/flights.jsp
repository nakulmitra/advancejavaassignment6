<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.nagarro.flight.search.model.Flight,java.util.List"%>
	
<%@page isELIgnored="false"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<STYLE >

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

</STYLE>
<title>Flights</title>
</head>
<body style="background-color: #69f0ae;">

	
	<form action="search_option" method="post" style="background-color: #82b1ff;">
		<div style="margin:5px;">
			<input type="submit" value="Search Another Flight"></button>
		</div>
	</form>
	<h2>
	<div style="background-color: #80d8ff;">
	<div align="center">List of Flights</div>
	</div>
	</h2>
	
	<div class="form-popup" align="center">
		<table class="form-container" border="1" style="background-color: #fff59d">
			<thead>
				<th>S.no.</th>
				<th>FLIGHT_NO</th>
				<th>DEP_LOC</th>
				<th>ARR_LOC</th>
				<th>VALID_TILL</th>
				<th>FLIGHT_TIME</th>
				<th>FLIGHT_DUR</th>
				<th>FARE</th>
				<th>SEAT_AVAILABILITY</th>
				<th>CLASS</th>
			</thead>
			<tbody>

				<%
					List<Flight> lflights = (List<Flight>) request.getAttribute("mmm");

					int i = 0;
					try {
						if (!lflights.isEmpty()) {
							for (Flight flight : lflights) {
								i++;
				%>
				<tr>
					<td><%=i%></td>
					<td><%=flight.getFlight_no()%></td>
					<td><%=flight.getDeparture()%></td>
					<td><%=flight.getArrival()%></td>
					<td><%=flight.getDate()%></td>
					<td><%=flight.getTime()%></td>
					<td><%=flight.getDuration()%></td>
					<td><%=flight.getFare()%></td>
					<td><%=flight.getAval()%></td>
					<td><%=flight.getClas()%></td>
				</tr>
				<%
					}
						}
						else{
							%>
							<h1> No Flight Available</h1>
							<%
						}
					} catch (Exception e) {
					}
				%>
			
		</table>
	</div>

</body>
</html>
