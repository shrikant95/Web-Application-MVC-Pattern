<%@page import="java.util.List"%>
<%@page import="com.javawebtutor.service.LoginService"%>
<%@page import="java.util.Date"%>
<%@page import="com.javawebtutor.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Result Page</title>
</head>
<body>
	<div id="container">
		<h1>Result Page</h1>
		<b>This is Sample Result Page</b><br>
		 <b>Welcome</b>
		<br> <a href="logout.jsp">Logout</a>
		<table>
			<thead>
				<tr>
					<th>First Name</th>
					<th>Middle Name</th>
					<th>Last Name</th>
					<th>email</th>
					<th>mobile</th>
					<th>password</th>
					<th>ID</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody>
			<c:if test="${!empty user}">
					<tr>
						<td>${user.firstName }</td>
						<td>${user.middleName }</td>
						<td>${user.lastName }</td>
						<td>${user.email }</td>
						<td>${user.mobile }</td>
						<td>${user.password }</td>
						<td>${user.id }</td>
						
						<td><a href="edit.jsp?ID=${user.id }">Edit</a></td>
					</tr>
				</c:if>
			</tbody>
		</table>
		<a href="allusers">Show All Users</a> <br />
	</div>
</body>
</html>
