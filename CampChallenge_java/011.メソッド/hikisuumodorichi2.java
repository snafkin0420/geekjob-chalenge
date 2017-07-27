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
public class hikisuumodorichi2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    課題「引数、戻り値1」の3人分のプロフィールのうち、1人だけ住所の値をnullで定義し、
//    ループ処理で全員分のプロフィールをid以外表示する処理を作成してください。
//    この際、nullになっているデータはcontinueで飛ばしながら表示してください。
    
    
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
// -----------------------------------------------------------------------------
//           String[] profile1 = {"1","名前1","生年月日1","住所1"};
//           String[] profile2 = {"2","名前2","生年月日2", null};
//           String[] profile3 = {"3","名前3","生年月日3","住所3"};
//           if(id.equals(profile1[0])){
//               return profile1;
//           }else if(id.equals(profile2[0])){
//               return profile2;
//           }else if(id.equals(profile3[0])){
//               return profile3;
//           }else{
//               return null;
//           }
//    }
    
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

//            ストリング配列を宣言し、メソッドを呼び出す
            String[] a = allprofile(1);
            
            //            拡張for文でメソッドに入っている配列1から3まで順番に表示する
            for(int j = 1; j<= 3; j++){
                for (String s : allprofile(j)) {
                    if(s == null){
                       continue; 
                    }
                      
                    
                    out.print(s + " ");
                }
                out.print("<br>");
            }
//         
//            配列aに入れたメソッドで呼び出した配列の中のデータを0から3まで順番に表示させる
//            for (int i = 1; i <= 3; i++) {
////            配列のデータがnullの時は、飛ばして次のデータを表示
////                
//                out.print(a[i] + "<br>");
//            }
//-----------------------------------------------------------------------------
//          allprofileに引数(1)を渡し、戻り値をArrayに格納する
//            String[] array = allprofile("1");
//          arrayに格納された戻り値を1から順番に表示
//                for(int i=1;i < array.length; i++){
//                    out.print(array[i] + "<br>");
//                }
//                for(int j=1; j <=3; j++){
//                    out.print(array[j]);
//                }
            
            
            
                
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisuumodorichi2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisuumodorichi2 at " + request.getContextPath() + "</h1>");
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
