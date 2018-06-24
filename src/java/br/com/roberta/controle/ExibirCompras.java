/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Compras_DAO;
import br.com.roberta.DAO.ListaDeCompras;
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
@WebServlet(name = "ExibirCompras", urlPatterns = {"/ExibirCompras"})
public class ExibirCompras extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            Compras_DAO Compras_DAO = new Compras_DAO();
            ListaDeCompras listacompras = Compras_DAO.Listar();
            
            if (listacompras != null){
                //request.
                HttpSession session = request.getSession();
                session.setAttribute("listacompras", listacompras);
                
                request.setAttribute("listacompras",listacompras);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/ExibeCompras.jsp");
                resposta.forward(request, response);
            }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
            }
          }catch (Exception e){
    System.out.println("ERRO NA CONSULTA DE compras ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}

