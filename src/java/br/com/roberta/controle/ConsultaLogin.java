/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Administrador_DAO;
import br.com.roberta.DAO.ListaDeAdmin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Roberta
 */
 @WebServlet(name = "ConsultaLogin", urlPatterns = {"/ConsultaLogin"})
public class ConsultaLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            Administrador_DAO Administrador_DAO = new Administrador_DAO();
            ListaDeAdmin listaadmin = Administrador_DAO.Listar();
            
            if (listaadmin != null){
                //request.
                HttpSession session = request.getSession();
                session.setAttribute("listaadmin", listaadmin);
                
                request.setAttribute("listaadmin",listaadmin);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/listaAdm.jsp");
                resposta.forward(request, response);
            }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
            }
          }catch (Exception e){
    System.out.println("ERRO NA CONSULTA DE LOGIN ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}

