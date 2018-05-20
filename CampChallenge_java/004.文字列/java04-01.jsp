<%-- 
    Document   : java04-01
    Created on : 2018/05/20, 17:38:55
    Author     : Hamamichi Motoki

「groove」「-」「gear」の３つの文字列を連結することで，「groove-gear」と画面に表示してください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String name1 = "groove";
    String mark = "-";
    String name2 = "gear";
    out.print(name1 + mark +name2);
%>

