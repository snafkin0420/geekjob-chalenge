<%-- 
    Document   : challenge1-8-4
    Created on : 2017/07/10, 16:20:29
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
        //変数を宣言
        int key =1000;
        //変数の値が100以下になるまで2にで割る処理を繰り返す
        while(key<100 == false){
            key = key / 2;
        }
            
       
        
        //変数の値を表示
        out.print(key);
        
        
        
        
        
        
        %>
    </body>
</html>
