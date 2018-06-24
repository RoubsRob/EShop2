/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Roberta
 */
public class Administrador {
    
    private int id;
    private String login;
    private String senha;

    public Administrador(int id,String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
    }
    
    public Administrador(){
        
    }

    public Administrador(String login, String senha){
        this.login = login;
        this.senha = senha;
        
    }
    
    
    public String getLogin() {
        return login;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String Consulta(Administrador administrador) throws SQLException{
       Conexao conexao = new Conexao();
       String s = "";
       try{
           PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT senha FROM Administrador2 WHERE LOGIN LIKE ?%");
           sql.setString(1, administrador.getLogin());
           ResultSet resultado = sql.executeQuery();
           System.out.println(resultado);
            while (resultado.next()){
                s = resultado.getString("senha");
                administrador.setSenha(s);
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return s;
    }

    
}