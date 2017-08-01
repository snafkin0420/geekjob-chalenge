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
public class hikisuumodorichi3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
       String[] allprofile(int id) {
//        プロフィールが入った配列を作成(ID,名前,生年月日,住所)
        String[] error = {"error"};
        String[] profile1 = {"ID1", "名前①", "生年月日①", "住所①"};
        String[] profile2 = {"ID2", "名前②", "生年月日②", null};
        String[] profile3 = {"ID3", "名前③", "生年月日③", "住所③"};
        switch (id) {
            case 1:
                return profile1;
            case 2:
                return profile2;
            case 3:
                return profile3;
            default:
                return error;
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            //            ストリング配列を宣言し、メソッドを呼び出す
            String[] a = allprofile(1);
            
            //            拡張for文でメソッドに入っている配列1から3まで順番に表示する
            int limit = 1;
            for(int j = 1; j<=limit; j++){
                for (String s : allprofile(j)) {
                    if(s == null){
                       continue; 
                    }
                      
                    
                    out.print(s + " ");
                }
                out.print("<br>");
            }
            
            
            
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisuumodorichi3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisuumodorichi3 at " + request.getContextPath() + "</h1>");
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
