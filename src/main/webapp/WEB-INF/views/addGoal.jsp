<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Goal</title>
    <style>
        .error{
            color: red;
        }
        .errorblock{
            color:#000;
            background-color: #ffEEEE;
            border: 3px solid red;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<form:form commandName="goal">
    <form:errors path="*" cssClass="errorblock" element="div"/>
    <table>
        <tr>
            <td>Enter Minutes</td>
            <td><form:input path="minutes" cssErrorClass="error"/></td>
            <td><form:errors path="minutes" cssClass="error"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
