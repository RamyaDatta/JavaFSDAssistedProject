<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Flight</title>
</head>
<body>

<br>
<a href=PageHome.jsp style="color:black;text-decoration:none;font-size:35px;fontweight:bold;">AirLines</a>
<br><br>
<%
@SuppressWarnings("unchecked")
List<String[]> flights=(List<String[]>)session.getAttribute("flights");
if(flights!=null){
%>
<h1>Available Flights</h1>
<table border="1">
<tr>
<th>Name</th>
<th>Time</th>
<th>Price</th>
</tr>
<%
for(String[] flight:flights){
%>
<tr>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>
</table>
<a href=FlightBooking.jsp>Book Now</a>
<%
}
%>
<%
}
else{
%>
<h1>There are no available flights</h1>
<%
}
%>


</body>
</html>