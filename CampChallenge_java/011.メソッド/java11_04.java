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
　method4.java　※サーブレットで作成してください
　
▼メソッド名
　calculation

　引数：
　　なし
　
　戻り値：
　　数値型

　処理内容：
　　メソッド内で計算した結果を戻り値として呼び出し元へ返却します。
　　
メソッドを作成したら，処理が正しく実装されているか確認するため、
このメソッドを呼び出す処理を記述してください。

呼び出した後、受け取った値に応じて以下の条件分岐処理&表示を行って下さい。

200以上 ... 「200以上です。」と表示
100以上200未満 ... 「100以上200未満です。」と表示
100未満 ... 「100未満です。」と表示


▼豆知識
　呼び出し元で以下の様な記述をすると変数として使い回すことができるのでオススメです。

　//メソッドから返却された値が変数に格納される
　型 変数名 = メソッド名();
　
　※変数の型はメソッドから返却される型と合わせるようにしましょう。

 */
public class java11_04 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
int calculation(){
    int x = 250;
    return x;
}

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int num = calculation();
            if(num >=200){
            out.print("200以上です。");
            } else if(num>=100){
            out.print("100以上200未満です。");
            } else {
            out.print("100未満です。");
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
