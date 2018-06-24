/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Produto_DAO;
import br.com.roberta.DAO.ListaDeProduto;
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
 @WebServlet(name = "ExibirProdutos", urlPatterns = {"/ExibirProdutos"})
public class ExibirProdutos extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            Produto_DAO Produto_DAO = new Produto_DAO();
            ListaDeProduto listaproduto = Produto_DAO.Listar();
            
            if (listaproduto != null){
                //request.
                HttpSession session = request.getSession();
                session.setAttribute("listaproduto", listaproduto);
                
                request.setAttribute("listaproduto",listaproduto);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/ExibeProduto.jsp");
                resposta.forward(request, response);
            }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
            }
          }catch (Exception e){
    System.out.println("ERRO NA CONSULTA DE produto ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}

