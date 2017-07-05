<%-- 
    Document   : challenge1-6 配列2
    Created on : 2017/07/05, 14:12:27
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
        //文字列の配列を作成配列を作成
        String array[] = {"10","100","soeda","hayashi","-20","118","END"};
        
        //文字列3番目の要素を"33"に置き換える
        array[2] = "33";
        //文字列3番目の要素を表示
        out.print(array[2]);
        %>
    </body>
</html>
