<%-- 
    Document   : challenge1-8 ループ処理 for文3
    Created on : 2017/07/10, 13:47:13
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
        int num = 0;
        //回数を表す変数を宣言;変数が100になるまで繰り返す条件;変数に1を足す
        for (int i=0;i<=100;i++){
        //変数numに1～100まで足して、足した数を変数に入れてまた足す作業を繰り返す処理
            num += i;
        }
        //変数の値を表示
        out.print(num);
        
        
        
        
        
        
        
        
        
        
        %>
    </body>
</html>
