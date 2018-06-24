/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Administrador_DAO;
import br.com.roberta.DAO.Categoria_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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


@WebServlet(name = "AtualizaCategoria", urlPatterns = {"/AtualizaCategoria"})
public class AtualizaCategoria extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no VERIFICAR LOGIN!!!");
        try{
                String id = request.getParameter("id");
                String categoria = request.getParameter("categoria");
                System.out.println("Login e senha do parametro: " + id + "" + categoria);
            if (Categoria_DAO.atualizar(id, categoria)) {
                Categoria_DAO.atualizar(id, categoria);
                RequestDispatcher resposta = request.getRequestDispatcher("/sucesso.jsp");
                resposta.forward(request, response);
            } else {
                response.sendRedirect("/Erro.jsp");
            }
    
        } catch (SQLException ex) {
            Logger.getLogger(VerificarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
        }

}
