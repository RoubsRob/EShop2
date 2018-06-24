/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Roberta
 */
public class Conexao {

    private Connection conexao;

    public Conexao() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//load driver
            conexao = DriverManager.getConnection("jdbc:sqlserver://ROB-PC\\SQLEXPRESS;databaseName=dw_trab4", "sa", "kaka123");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Nao foi possivel efetuar uma conexao com o BD!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Nao foi possivel encontrar a classe referente! Verifique o driver!");
        }
    }
    
    public Connection getConexao(){
        return this.conexao;
    }
    
    public void closeConexao(){
        try {
            this.conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

 
}
