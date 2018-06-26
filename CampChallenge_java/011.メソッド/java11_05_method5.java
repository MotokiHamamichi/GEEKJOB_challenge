/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamamichi Motoki

以下の仕様を参考にユーザー定義メソッドを作成してください。

▼ファイル名
　method5.java　※サーブレットで作成してください
　
▼メソッド名
　user_profile
　
　引数：
　　なし
　
　戻り値：
　　文字列型を要素に持つ配列型 （ArrayListでも可）
　
　処理内容：
　　メソッド内で以下の値を要素とする配列を作成し、呼び出し元へ返却します。
　　値 ... ["1","技育太郎","東京","男","プログラマー"]

メソッドを作成したら、処理が正しく実装されているか確認するため、
このメソッドを呼び出す処理を記述してください。

呼び出した後、返却された要素の表示を行って下さい。
・返却された要素は反復処理(for)によって順番に指定し、IDは表示しないでください。

 */
public class java11_05_method5 extends HttpServlet {
    String[] user_profile(){
        String x[] ={"1","技育太郎","東京","男","プログラマー"};
        return x;
    } 
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String data[]= user_profile(); 
            for (int i = 0; i < 5; i++){
                out.print(data[i] + "<br>");    
            }
            } 
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
