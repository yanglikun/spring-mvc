<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        tr, td {
            border-collapse: collapse;
            border: 1px solid;
        }

        table {
            border-collapse: collapse;
        }

        td {
            width: 80px;
            text-align: center;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>modelAndView</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>model</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>modelAttribute</td>
        <td>${user.name}</td>
    </tr>
    <tr>
        <td>defaultTest</td>
        <td>${user.name},${user.age}</td>
    </tr>
</table>

<hr/>
Request的所有属性<br/>
<%
    Enumeration attributeNames = request.getAttributeNames();
    while (attributeNames.hasMoreElements()) {
        Object o = attributeNames.nextElement();
        out.print(o + "=" + request.getSession().getAttribute((o.toString())));
        out.print("<br/>");
    }
%>

<hr/>
Session的所有属性<br/>
<%
    Enumeration sessionAttributeNames = request.getSession().getAttributeNames();
    while (sessionAttributeNames.hasMoreElements()) {
        Object o1 = sessionAttributeNames.nextElement();
        out.print(o1 + "=" + request.getSession().getAttribute((o1.toString())));
    }
%>
</body>
</html>
