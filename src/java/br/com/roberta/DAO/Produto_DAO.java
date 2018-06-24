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
public class Produto_DAO {
    
    public static boolean criar(String produto, String nome,String descricao, String valor) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="INSERT INTO PRODUTO VALUES(?,?,?,?)"; //sem aspas no ?
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, produto);
              sql.setString(2, nome);
              sql.setString(3, descricao);
              sql.setString(4, valor);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Erro insert SQL");
          }finally{
           conexao.closeConexao();
       }return deu;
       }

    public static boolean atualizar(String produto, String nome,String descricao, String valor) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="UPDATE PRODUTO SET IDCATEGORIA = ? , DESCRICAO= ?, VALOR = ? "
                      + " WHERE NOME = ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, produto);
              sql.setString(2, descricao);
              sql.setString(3, valor);
              sql.setString(4, nome);
              sql.executeUpdate();
              
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }
    
    public static boolean deletar(String nome) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="DELETE FROM PRODUTO WHERE NOME LIKE ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, nome);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }

    
    public static ListaDeProduto Listar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeProduto admin = new ListaDeProduto();
       
       try{
           String selectSQL= "select * from produto";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosProduto(resultado);
               System.out.println("Entrou no listar produto DAO");
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

    public static ListaDeProduto Consultar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeProduto admin = new ListaDeProduto();
       
       try{
           String selectSQL= "select * from produto";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosProduto(resultado);
               System.out.println("Entrou no consultar produto DAO");
            } 
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

}
