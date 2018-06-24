/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Categoria_DAO;
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
@WebServlet(name = "AdicionaCategoria", urlPatterns = {"/AdicionaCategoria"})
public class AdicionaCategoria extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            String categoria = request.getParameter("descricao");
            System.out.println("Valores parametro produto: "+ categoria );
            System.out.println("ENTROU NO ADDCATEGORIA SERVLET");
              
            
            if (Categoria_DAO.criar(categoria)){
            Categoria_DAO.criar(categoria);    
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
