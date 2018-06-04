<%-- 
    Document   : java08-03
    Created on : 2018/06/04, 18:08:29
    Author     : Hamamichi Motoki

変数を宣言し，その値を 0 から 100 までの合計値にしてください。
そして，その変数の値を画面に表示してください。
このとき，変数の値は，for文を利用して， 0 から始まる数値を順番に足しこむことで得るものとします。

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    long total = 0;
    int num = 0;
        for(int i = 0; i<100; i++){
            num += 1;
            total = total + num;
        }
        out.print(total);
%>


