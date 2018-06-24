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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Roberta
 * VER COMO RETORNAR STRING PELO PARAMETRO COM JSON
 */
@WebServlet(name = "ConsultaAdms", urlPatterns = {"/ConsultaAdms"})
public class ConsultaAdms extends HttpServlet {
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no CRIA LOGIN!!!");
        try{    

            ListaDeAdmin admin = new ListaDeAdmin();
            System.out.println("ENTROU NO CONSULTA ADMS");
            admin = Administrador_DAO.Consultar();
            
            
//            for (int i=; i<Administrador_DAO.Consultar() ; i++){
            
            System.out.println("Nomes de atributos da request "+request.getAttributeNames());
            System.out.println("Cookies: "+ request.getCookies());
            request.setAttribute("listaadmin",admin);
            
//            HttpSession session = request.getSession();
  //          session.setAttribute("admin", admin);
            
            RequestDispatcher resposta = request.getRequestDispatcher("/listaAdm.jsp");
            resposta.forward(request, response);
            
        /*String nome_user = request.getParameter("nome");
        String senha_user = request.getParameter("senha");
        System.out.println("Login e senha do parametro: "+ nome_user + ""+ senha_user);
        
        administrador.setLogin(nome_user);
        
        
        try {
            //if (Administrador_DAO.SenhaCorreta(nome_user, senha_user)){
              if(!Administrador_DAO.SenhaCorreta(nome_user, senha_user)){  

//    senha_user.equals(administrador.Consulta(administrador))
                HttpSession session = request.getSession();
                session.setAttribute("NomeUsuarioLogado", nome_user);
                session.setAttribute("logado", "ok");
                
                RequestDispatcher resposta = request.getRequestDispatcher("/areaRestritaMenu1.jsp");
                resposta.forward(request, response);
            } else {
                response.sendRedirect("index.jsp");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaAdms.class.getName()).log(Level.SEVERE, null, ex);
        }*/
          }catch (Exception e){
    System.out.println("ERRO NO CONSULTA LOGIN ADM");
}
    }    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
