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
 * @author Thamira
 */
public class NewServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<div class=\"box box-primary\">\n" +
"                                \n" +
"                                <div class=\"box-body\">\n" +
"                                    <ul class=\"todo-list\">\n" +
"                                        <li>\n" +
"                                            <span class=\"handle\">\n" +
"                                                <i class=\"fa fa-ellipsis-v\"></i>\n" +
"                                                <i class=\"fa fa-ellipsis-v\"></i>\n" +
"                                            </span>\n" +
"                                            \n" +
"                                            <span class=\"text\">Design a nice theme</span>\n" +
"                                            <small class=\"label label-danger\"><i class=\"fa fa-clock-o\"></i> 2 mins</small>\n" +
"                                            <div class=\"tools\">\n" +
"                     \n" +
"                                                <i class=\"fa fa-trash-o\"></i>\n" +
"                                            </div>\n" +
"                                        </li>\n" +
"                                      \n" +
"                                    </ul>\n" +
"                                </div>\n" +
"                                \n" +
"                            </div>");
            out.println("<div class=\"box box-primary\">\n"
                    + "            <div class=\"box-body box-danger\">\n"
                    + "                <img class=\"profile-user-img img-responsive img-circle\" src=\"dist/img/user4-128x128.jpg\" alt=\"User profile picture\">\n"
                    + "                <h3 class=\"profile-username text-center\">Short Name</h3>\n"
                    + "                <p class=\"text-muted text-center\">Address</p>\n"
                    + "                <ul class=\"list-group list-group-unbordered\">\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>NIC</b> <a class=\"pull-right\">1,322</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Full Name</b> <a class=\"pull-right\">543</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Short Name</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Mobile Number</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Date of Birth</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Age</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Sex</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Height</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Weight</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                    <li class=\"list-group-item\">\n"
                    + "                        <b>Blood Group</b> <a class=\"pull-right\">13,287</a>\n"
                    + "                    </li>\n"
                    + "                </ul>\n"
                    + "<div class=\"row\">"
                    + "                    <div class=\"col-xs-6\">  <a href=\"#\" class=\"btn btn-primary btn-block\"><b>Edit</b></a></div>"
                    + "                    <div class=\"col-xs-6\">  <a href=\"#\" class=\"btn btn-danger btn-block\"><b>Delete</b></a></div>\n"
                    + "                </div>");
            out.println("<a id=\"regnumber\"><i class=\"fa fa-trash-o\"></i></a>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("<tr>\n"
                    + "                                <td></td>\n"
                    + "                                <td></td>\n"
                    + "                                <td></td>\n"
                    + "                                <td></td>\n"
                    + "\n"
                    + "                            </tr>");
        } finally {
            out.close();
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
