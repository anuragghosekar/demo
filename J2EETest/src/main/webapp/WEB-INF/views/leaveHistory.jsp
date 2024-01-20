<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leave History</title>
</head>
<body>
<div style="display:grid; align-items:center; justify-content:center;">
	
	<h1 style="text-align:center;">Leave History</h1>
	<table border="1">
		<thead align="center" style="padding:3px;">
			<tr>
				<th style="padding:5px;">Leave ID</th>
				<th style="padding:5px;">Leave Applied On</th>
				<th style="padding:5px;">Start Date</th>
				<th style="padding:5px;">End Date</th>
				<th style="padding:5px;">Leave Type</th>
				<th style="padding:5px;">Leave Reason</th>
				<th style="padding:5px;">Employee No</th>
			</tr>
		</thead>
		<tbody align="center" style="padding:3px;">
			<c:forEach var="l" items="${lList}"> 
				<tr align="center" style="padding:3px;">
					<td style="padding:5px;">${l.leave_id}</td>
					<td style="padding:5px;">${l.leave_applied_on}</td>
					<td style="padding:5px;">${l.start_date}</td>
					<td style="padding:5px;">${l.end_date}</td>
					<td style="padding:5px;">${l.leave_type}</td>
					<td style="padding:5px;">${l.leave_reason}</td>
					<td style="padding:5px;">${l.empno}</td>
					</tr>
			</c:forEach>
		</tbody>
	</table>
	<p style="text-align:center;">${msg}</p>
	<br/>
	<br/>
</div>
</body>
</html>