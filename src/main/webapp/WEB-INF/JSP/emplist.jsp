<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1px">
<tr>
<td>id</td>
<td>姓名</td>
<td>地点</td>
</tr>
<c:forEach items="${el}" var="emp">
<tr>
<td>${emp.eid}</td>
<td>${emp.ename}</td>
<td>${emp.eredd}</td>
<td><a href="update? eid{emp.eid}" >修改</a> </td>
</tr>
</c:forEach>
</table>

<form action="update">
<input type="text" name="ename" value="emp.ename"/>
</form>
</body>
</html>