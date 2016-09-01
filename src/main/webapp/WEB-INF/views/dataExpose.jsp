<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
Session的所有属性<br/>
<%
    Enumeration sessionAttributeNames = request.getSession().getAttributeNames();
    while (sessionAttributeNames.hasMoreElements()) {
        String sessionAttrName = (String)sessionAttributeNames.nextElement();
        out.print(sessionAttrName + "=" + request.getSession().getAttribute(sessionAttrName));
    }
%>
<hr/>
数据格式化测试<br/>
${name}<br/>
======
${user.birthday}

======



<hr/>
Request的所有属性<br/>
<%
    Enumeration attributeNames = request.getAttributeNames();
    while (attributeNames.hasMoreElements()) {
        String reqAttrName = (String)attributeNames.nextElement();
        out.print(reqAttrName + "=" + request.getAttribute(reqAttrName));
        out.print("<br/>");
    }
%>
</body>
</html>
