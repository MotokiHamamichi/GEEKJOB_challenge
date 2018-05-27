<%-- 
    Document   : java07-01
    Created on : 2018/05/27, 14:48:16
    Author     : Hamamichi motoki

以下の順で、連想配列を作成してください。
"1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.HashMap" %>

<%
    HashMap <String, String> date = new HashMap <String,String>();
    date.put("1","AAA");
    out.print(date.get("1"));
    date.put("hello","world");
    out.print(date.get("hello"));
    date.put("soeda","33");
    out.print(date.get("soeda"));
    date.put("20","20");
    out.print(date.get("20"));
%>

    