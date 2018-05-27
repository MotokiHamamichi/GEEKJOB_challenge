<%-- 
    Document   : java06-01
    Created on : 2018/05/27, 13:40:04
    Author     : Hamammichi Motoki

配列型か ArrayList 型の変数を宣言してください（なお，要素の型は，文字列型とします）。
そして変数を，下記の要素が順番に格納された状態にしてください。 
また，各要素を順番に表示して，正しく要素が格納されたことを確認してください。 

"10"， "100"， "soeda"， "hayashi"， "-20"， "118"， "END"
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

