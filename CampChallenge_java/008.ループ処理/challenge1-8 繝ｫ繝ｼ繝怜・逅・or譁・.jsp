<%-- 
    Document   : challenge1-8 ループ処理for文1
    Created on : 2017/07/10, 9:53:04
    Author     : keita0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        
        long y = 1;    
        for (int x=0;x<20;x++){
            
            y *= 8;
            
        }
        
        out.print(y);
        
        
        
        
        
        
        %>
    </body>
</html>
