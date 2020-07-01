<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>所有员工 </title>
</head>
<body>
    <a href="add">添加员工</a>
    <br/>
    <table border="1" >
        <tr>
            <th>员工ID</th>
            <th>员工姓名</th>
            <th>员工年龄1</th>
            <th>员工性别</th>
            <th>员工住址</th>
            <th colspan="2">操作</th>
        </tr>
        <c:forEach items="${requestScope.AllEmp }" var="emp" >
            <tr>
                <td>${emp.eid }</td>
                <td>${emp.empname }</td>
                <td>${emp.age }</td>
                <td>${emp.sex }</td>
                <td>${emp.address }</td>
                <td><a href="/emp/employee/${emp.eid }">修改员工信息</a></td>
                <td><form action="/emp/employee/${emp.eid }" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除员工信息">
                </form></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>