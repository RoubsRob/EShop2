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
public class Categoria_DAO {
        public static boolean criar(String categoria) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="INSERT INTO CATEGORIA(DESCRICAO) VALUES (?) "; //sem aspas no ?
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, categoria);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Erro insert SQL");
          }finally{

           conexao.closeConexao();
       }return deu;
       }

        
    public static boolean atualizar(String id, String nome) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              int i = Integer.parseInt(id);
              
              String sqlQ="UPDATE CATEGORIA SET DESCRICAO = ? WHERE ID = ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, nome);
              sql.setInt(2, i);
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
              String sqlQ="DELETE FROM CATEGORIA WHERE DESCRICAO LIKE ? ";
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
    
    
    public static ListaDeCategoria Listar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeCategoria admin = new ListaDeCategoria();
       
       try{
           String selectSQL= "select * from categoria";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosCategoria(resultado);
               System.out.println("Entrou no listar DAO");
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

    public static ListaDeCategoria Consultar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeCategoria admin = new ListaDeCategoria();
       
       try{
           String selectSQL= "select * from categoria";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosCategoria(resultado);
               System.out.println("Entrou no consultar categoria DAO");
            } 
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

}
