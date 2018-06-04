<%-- 
    Document   : java08-01
    Created on : 2018/05/28, 13:56:07
    Author     : Hamamichi Motoki

8 の 20 乗を計算し，計算結果を表示してください。
この計算は，for文によって実現してください。
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    long total = 1;
    for(long i =0; i<20; i++){
        total = total * 8;
    }
    out.print(total);
%>

