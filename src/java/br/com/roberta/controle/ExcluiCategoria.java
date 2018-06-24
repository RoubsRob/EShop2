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
@WebServlet(name = "ExcluiCategoria", urlPatterns = {"/ExcluiCategoria"})
public class ExcluiCategoria extends HttpServlet {
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no CRIA LOGIN!!!");
        try{    
            String nome = request.getParameter("nome");
            System.out.println("Nome da categoria: "+ nome );
            if(Categoria_DAO.deletar(nome)){
                Categoria_DAO.deletar(nome);    
                RequestDispatcher resposta = request.getRequestDispatcher("/sucesso.jsp");
                resposta.forward(request, response);
                }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
                }
          }catch (Exception e){
    System.out.println("ERRO NA EXCLUSAO DA CATEGORIA");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
