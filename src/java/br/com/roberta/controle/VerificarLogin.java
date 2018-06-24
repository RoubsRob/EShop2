/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Administrador;
import br.com.roberta.DAO.Administrador_DAO;
import br.com.roberta.DAO.ListaDeAdmin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Roberta
 */


@WebServlet(name = "VerificarLogin", urlPatterns = {"/VerificarLogin"})
public class VerificarLogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no VERIFICAR LOGIN!!!");
try{
        Administrador administrador = new Administrador();
        ListaDeAdmin admin = Administrador_DAO.Listar();
       
        String nome_user = request.getParameter("nome");
        String senha_user = request.getParameter("senha");
        System.out.println("Login e senha do parametro: "+ nome_user + ""+ senha_user);
        
        administrador.setLogin(nome_user);
        
        
        
        try {
            //if (Administrador_DAO.SenhaCorreta(nome_user, senha_user)){
              if(Administrador_DAO.SenhaCorreta(nome_user, senha_user)){  

//    senha_user.equals(administrador.Consulta(administrador))
                HttpSession session = request.getSession();
                session.setAttribute("NomeUsuarioLogado", nome_user);
                session.setAttribute("logado", "ok");
                
                
                Cookie meuCookie = new Cookie("Nome", nome_user);
                meuCookie.setMaxAge(60*30);
                response.addCookie(meuCookie);
                
                RequestDispatcher resposta = request.getRequestDispatcher("/areaRestritaMenu1.jsp");
                resposta.forward(request, response);
            } else {
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(VerificarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }catch (Exception e){
    System.out.println("ERRO NO LOGIN");
}
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
