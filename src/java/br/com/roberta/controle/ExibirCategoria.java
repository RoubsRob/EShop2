/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Administrador_DAO;
import br.com.roberta.DAO.Categoria_DAO;
import br.com.roberta.DAO.ListaDeAdmin;
import br.com.roberta.DAO.ListaDeCategoria;
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
 @WebServlet(name = "ExibirCategoria", urlPatterns = {"/ExibirCategoria"})
public class ExibirCategoria extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{    
            Categoria_DAO Categoria_DAO = new Categoria_DAO();
            ListaDeCategoria listacategoria = Categoria_DAO.Listar();
            
            if (listacategoria != null){
                //request.
                HttpSession session = request.getSession();
                session.setAttribute("listacategoria", listacategoria);
                
                request.setAttribute("listacategoria",listacategoria);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/ExibeCategoria.jsp");
                resposta.forward(request, response);
            }else {
                RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");
                resposta.forward(request, response);
            }
          }catch (Exception e){
    System.out.println("ERRO NA CONSULTA DE categoria ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}

