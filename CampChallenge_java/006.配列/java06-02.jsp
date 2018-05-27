<%-- 
    Document   : java06-02
    Created on : 2018/05/27, 13:42:22
    Author     : Hamamichi Motoki

課題「配列の作成」で作成した配列について，要素 "soeda" の値を "33" に書き換えてください。 
また，各要素を順番に表示して，正しく要素が格納されたことを確認してください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import="java.util.ArrayList" %>

<%
    ArrayList<String> data = new ArrayList<String>();
    data.add("10");
    out.print(data.get(0));
    data.add("100");
    out.print(data.get(1));
    data.add("soeda");
    out.print(data.get(2));
    data.add("hayashi");
    out.print(data.get(3));
    data.add("-20");
    out.print(data.get(4));
    data.add("118");
    out.print(data.get(5));
    data.add("end");
    out.print(data.get(6));
    
%>

<%
    data.set(2,"33");
    out.print(data.get(2));
%>
