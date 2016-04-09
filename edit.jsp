<html>
<head>
<title>After Edit Student Registration Form</title>
<style type="text/css">
h3{font-family: Calibri; font-size: 22pt; font-style: normal; font-weight: bold; color:SlateBlue;
text-align: center; text-decoration: underline }
table{font-family: Calibri; color:white; font-size: 11pt; font-style: normal;width: 50%;
text-align:; background-color: SlateBlue; border-collapse: collapse; border: 2px solid navy}
table.inner{border: 0px}
</style>
</head>
 
<body>
<h3>You can Update Entries</h3>
<form action="update" method="POST">
 
<table align="center" cellpadding = "10">
<tr>
<td>First Name</td>
<td><input type="text" name="firstName"  value="${user.firstName }"  maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
<tr>
<td>Middle Name</td>
<td><input type="text" name="middleName" value="${user.middleName }"   maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" value="${user.lastName }"   maxlength="30"/>
(max 30 characters a-z and A-Z)
</td>
</tr>
 
<tr>
<td>Email</td>
<td><input type="text" name="email" value="${user. email}"  maxlength="100" /></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="${user.mobile}"   maxlength="10" /></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" value="${user.password}"   maxlength="100" /></td>
</tr>
<tr>
<td>User ID</td>
<td><input type="text" name="id" value="${user.id}"/></td>
<tr>
<td colspan="4" align="center">
<input type="submit" value="update">
edit ? id="${user.id }"
<a href="UpdateServlet ? id=${user.id }">Edit</a>
</td>

</tr>
</table>
 
</form>
 
</body>
</html>