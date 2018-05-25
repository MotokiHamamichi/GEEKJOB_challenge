<%-- 
    Document   : java05-02
    Created on : 2018/05/21, 11:52:03
    Author     : Hamamichi Motoki

変数を宣言し，数値を格納してください。その後，変数の値によって条件分岐し，以下のような画面表示をしてください。
なお，条件分岐には switch 文を利用してください。 

変数の値が１の場合 ... 「one」と表示する 
変数の値が２の場合 ... 「two」と表示する 
それ以外の場合 ... 「想定外」と表示する
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int num = 1;
    switch(num) {
    case 1:
    out.print("one");
    break;
    case 2:
    out.print("two");
    break;
    default:
    out.print("想定外");
    break;
    }
%>

