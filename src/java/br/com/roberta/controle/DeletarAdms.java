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

/**
 *
 * @author Roberta
 */
@WebServlet(name = "DeletarAdms", urlPatterns = {"/DeletarAdms"})
public class DeletarAdms extends HttpServlet {
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no CRIA LOGIN!!!");
        try{    
            String nome_user = request.getParameter("delLogin");
            System.out.println("Login e senha do parametro: "+ nome_user );
            if(Administrador_DAO.deletar(nome_user)){

                RequestDispatcher resposta = request.getRequestDispatcher("/sucesso.jsp");
                resposta.forward(request, response);
                }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
                }
          }catch (Exception e){
    System.out.println("ERRO NO DEL LOGIN ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
