/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Categoria_DAO;
import br.com.roberta.DAO.Cliente_DAO;
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

@WebServlet(name = "AtualizaCliente", urlPatterns = {"/AtualizaCliente"})
public class AtualizaCliente extends HttpServlet {
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no VERIFICAR LOGIN!!!");
            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String bairro = request.getParameter("bairro");
            String cep = request.getParameter("cep");
            String estado = request.getParameter("estado");
            String referencia = request.getParameter("referencia");
            String identidade = request.getParameter("identidade");
            String tel = request.getParameter("tel");
            String cpf = request.getParameter("cpf");
            String cel = request.getParameter("cel");
            String ncartao = request.getParameter("ncartao");
            String bcartao = request.getParameter("bcartao");

            System.out.println("ENTROU NO ADDCLIENTE SERVLET");
            

        try{
                String id = request.getParameter("id");
                String categoria = request.getParameter("categoria");
                System.out.println("Login e senha do parametro: " + id + "" + categoria);
            if (Cliente_DAO.atualizar(nome,endereco,bairro,cep,estado,referencia,identidade,tel,cpf,cel,ncartao,bcartao)) {
                Cliente_DAO.atualizar(nome,endereco,bairro,cep,estado,referencia,identidade,tel,cpf,cel,ncartao,bcartao);
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
