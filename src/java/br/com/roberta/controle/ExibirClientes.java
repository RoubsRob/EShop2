/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Cliente_DAO;
import br.com.roberta.DAO.ListaDeClientes;
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
@WebServlet(name = "ExibirClientes", urlPatterns = {"/ExibirClientes"})
public class ExibirClientes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            Cliente_DAO Clientes_DAO = new Cliente_DAO();
            ListaDeClientes listaclientes = Clientes_DAO.Listar();
            
            if (listaclientes != null){
                //request.
                HttpSession session = request.getSession();
                session.setAttribute("listaclientes", listaclientes);
                
                request.setAttribute("listaclientes",listaclientes);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/ExibeClientes.jsp");
                resposta.forward(request, response);
            }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
            }
          }catch (Exception e){
    System.out.println("ERRO NA CONSULTA DE clientes ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}

