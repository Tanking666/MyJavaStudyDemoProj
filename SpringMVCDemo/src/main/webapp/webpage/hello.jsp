<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 43735
  Date: 2019/12/13
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <c:forEach items="${videos}" var="item">
            <tr>
                <td><a href="${item.path}">${item.name}</a></td>
                <td>${item.pName}</td>
                <td>${item.path}</td>
                <td></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
