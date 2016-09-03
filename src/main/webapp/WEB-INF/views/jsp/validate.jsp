<%@ page import="java.util.Enumeration" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>数据校验</title>
    <style type="text/css">
        table,tr,td{
            border-collapse: collapse;
            border:1px solid;
        }
    </style>
</head>
<body>
数据校验<br/>
<form:form modelAttribute="user">
    <form:errors path="*"/>
</form:form>
姓名错误信息:<form:errors path="myUser.name"/><br/>
年龄错误信息:<form:errors path="myUser.age"/><br/>
姓名错误==:<form:errors path="userValidateRet.name"/><br/>
年龄错误==:<form:errors path="userValidateRet.age"/><br/>



<hr/>
Request的所有属性<br/>
<table class="tableCols">
    <%
        Enumeration attributeNames = request.getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String reqAttrName = (String) attributeNames.nextElement();
    %>
    <tr>
        <td><%=reqAttrName%>
        </td>
        <td><%=request.getAttribute(reqAttrName)%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
