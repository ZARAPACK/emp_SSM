<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>所有员工 </title>
</head>
<body>
<br/>
<sf:form method="post" modelAttribute="employee" action="/emp/addEmployee">
    员工姓名:<sf:input path="empname"/><sf:errors path="empname"/><br/>
    员工性别:<sf:input path="sex"/><sf:errors path="sex"/><br/>
    员工年龄:<sf:input path="age"/><sf:errors path="age"/><br/>
    员工地址:<sf:input path="address"/><sf:errors path="address"/><br/>
    <input type="submit" value="添加员工"/>
</sf:form>
</body>
</html>