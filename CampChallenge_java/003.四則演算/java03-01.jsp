<%-- 
    Document   : java03-01
    Created on : 2018/05/20, 15:45:41
    Author     : Hamamichi Motoki

変数と定数を宣言し，それぞれ数値を格納してください。
また，変数と定数を使って四則演算を行い，計算結果を画面に表示してください。
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int num1= 100;
    final int num2 = 50;
    num1 *= num2;  
    out.print( num1 );
    out.print(++num1);
%>

