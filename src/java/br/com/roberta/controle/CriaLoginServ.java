/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.controle;

import br.com.roberta.DAO.Administrador_DAO;
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
@WebServlet(name = "CriaLoginServ", urlPatterns = {"/CriaLoginServ"})
public class CriaLoginServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
/*    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
  */      
        
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        System.out.println("Entrou no CRIA LOGIN!!!");
        try{    

            String nome_user = request.getParameter("addLogin");
            String senha_user = request.getParameter("senha");
            System.out.println("Login e senha do parametro: "+ nome_user + ""+ senha_user);
            
            
            
            System.out.println("ENTROU NO ADDNOME");
            
            if (Administrador_DAO.criar(nome_user, senha_user)){
           
            RequestDispatcher resposta = request.getRequestDispatcher("/sucesso.jsp");
            resposta.forward(request, response);
            }
            else {RequestDispatcher resposta = request.getRequestDispatcher("/Erro.jsp");}

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
            Logger.getLogger(VerificarLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
 */     }catch (Exception e){
    System.out.println("ERRO NO ADD LOGIN ADM");
}
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.sendRedirect("index.jsp");
    }

}
