<%-- 
    Document   : challenge1-7 連想配列
    Created on : 2017/07/06, 13:52:31
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
        <%@page import="java.util.*" %>
        <%
        //連想配列の作成
        HashMap<String,String> mojiretu = 
                new HashMap<String,String>();
        
        
        //要素"1"に"AAA"を追加
        mojiretu.put("1","AAA");
        
        //要素"hello"に"world!"を追加
        mojiretu.put("hello","world");
        
        //要素"soeda"に"33"を追加
        mojiretu.put("soeda", "33");
        
        //要素を追加"20"に"20"
        mojiretu.put("20", "20");
        
        //要素の表示
        out.print(mojiretu.get("1"));
        out.print(mojiretu.get("hello"));
        out.print(mojiretu.get("soeda"));
        out.print(mojiretu.get("20"));
        
        //要素数取得
        out.print(mojiretu.size());
        %>
    </body>
</html>
