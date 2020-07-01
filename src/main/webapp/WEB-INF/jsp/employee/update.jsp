<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改员工信息 </title>
</head>
<body>
<br/>
<form action="/emp/employee" method="post">
    <input type="hidden" name="_method" value="PUT">
    <table border="1">
        <tr>
            <th>员工ID</th>
            <td><input type="text" name="eid" value="${UpdateEmp.eid }"></td>
            <form:errors path="UpdateEmp.eid" cssStyle="color:red"></form:errors>
        </tr>
        <tr>
            <th>姓名</th>
            <td><input type="text" name="empname"
                       value="${UpdateEmp.empname }"></td>
            <form:errors path="UpdateEmp.empname" cssStyle="color:red"></form:errors>
        </tr>
        <tr>
            <th>性别</th>
            <td><input type="text" name="sex"
                       value="${UpdateEmp.sex }"></td>
            <form:errors path="UpdateEmp.sex" cssStyle="color:red"></form:errors>
        </tr>
        <tr>
            <th>年龄</th>
            <td><input type="text" name="age"
                       value="${UpdateEmp.age }"></td>
            <form:errors path="UpdateEmp.age" cssStyle="color:red"></form:errors>
        </tr>
        <tr>
            <th>地址</th>
            <td><input type="text" name="address"
                       value="${UpdateEmp.address}"></td>
            <form:errors path="UpdateEmp.address" cssStyle="color:red"></form:errors>
        </tr>
        <tr>
            <td><input type="submit" value="修改信息"></td>

        </tr>
    </table>
</form>
</body>
</html>