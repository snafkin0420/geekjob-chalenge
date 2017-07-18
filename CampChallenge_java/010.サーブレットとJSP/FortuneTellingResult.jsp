<%-- 
    Document   : newjsp
    Created on : 2017/07/12, 15:19:35
    Author     : keita0
--%>
<%@page import="org.mypackage.sample.ResultData" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            ResultData data = (ResultData)request.getAttribute("DATA");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (data != null) {
            out.print("<h>あなたの" + data.getD() + "の運勢は、" + data.getLuck() + "です!</h>");
        }
           
        %>  
    </body>
</html>
