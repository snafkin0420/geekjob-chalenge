/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author keita0
 */
public class hikisuumodorichi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//      引数が１つのメソッドを作成してください。
//      メソッドの中の処理は、３人分のプロフィール（項目は戻り値2と同様）を作成し、
//      引数として渡された値と同じIDを持つ人物のプロフィールを返却する様にしてください。
//      それ以降は課題「戻り値2」と同じ処理にしてください。
//          ID1であればprofile1、ID2であればprofile2、ID3であればprofile3を
//          返す情報を変えるメソッドを作成
    String[] allprofile(int id) {
//        プロフィールが入った配列を作成(ID,名前,生年月日,住所)
        String[] error = {"error"};
        String[] profile1 = {"ID1", "名前①", "生年月日①", "住所①"};
        String[] profile2 = {"ID2", "名前②", "生年月日②", "住所②"};
        String[] profile3 = {"ID3", "名前③", "生年月日③", "住所③"};
        if (id == 1) {
            return profile1;
        } else if (id == 2) {
            return profile2;
        } else if (id == 3) {
            return profile3;
        } else {
            return error;
        }
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//           メソッドを呼び出す
            String[] a = allprofile(2);
            for (int i = 0; i < 4; i++) {
                out.print(a[i] + "<br>");
            }

           

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisuumodorichi</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisuumodorichi at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
