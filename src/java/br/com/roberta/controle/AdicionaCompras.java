/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Compras_DAO;
import br.com.roberta.DAO.Produto_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roberta
 */
@WebServlet(name = "AdicionaCompras", urlPatterns = {"/AdicionaCompras"})
public class AdicionaCompras extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no CRIA LOGIN!!!");
        try{    
            String idcliente = request.getParameter("idcliente");
            String idproduto = request.getParameter("idproduto");
            System.out.println("Valores parametro compras: "+ idproduto + " "+ idcliente);
            System.out.println("ENTROU NO ADDCOMPRAS SERVLET");
              
            
            if (Compras_DAO.criar(idcliente,idproduto)){
            Compras_DAO.criar(idcliente,idproduto);    
            RequestDispatcher resposta = request.getRequestDispatcher("/sucesso.jsp");
            resposta.forward(request, response);
            }
            else {RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");}
        }catch (Exception e){
    System.out.println("ERRO NO ADD PRODUTO ADM");
}
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
