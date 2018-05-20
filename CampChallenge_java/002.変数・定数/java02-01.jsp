<%-- 
    Document   : java02-01
    Created on : 2018/05/20, 15:24:28
    Author     : Hamamichi Motoki

変数を宣言し，変数に自己紹介文（ "私の名前は佐藤一郎です" など）を格納してください。
また，変数の値を画面に表示する処理を記述してください。
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String text = "私の名前は濱道幹です";
    out.print(text);
%>
