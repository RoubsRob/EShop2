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
public class Compras_DAO {

    
    public static boolean criar(String idcliente, String idproduto) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="INSERT INTO COMPRAS VALUES(?,?)"; //sem aspas no ?
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, idcliente);
              sql.setString(2, idproduto);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Erro insert SQL");
          }finally{
           conexao.closeConexao();
       }return deu;
       }

    public static boolean atualizar(String id, String idcliente ,String idproduto) 
            throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="UPDATE COMPRAS SET idcliente = ? , idproduto = ? "
                      + " WHERE ID = ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, idcliente);
              sql.setString(2, idproduto);
              sql.setString(3, id);
              sql.executeUpdate();
              
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }
    
    public static boolean deletar(String idcompras) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="DELETE FROM COMPRAS WHERE ID = ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, idcompras);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }

    public static ListaDeCompras Listar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeCompras admin = new ListaDeCompras();
       
       try{
           String selectSQL= "select * from compras";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosCompras(resultado);
               System.out.println("Entrou no listar compras DAO");
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

    public static ListaDeCompras Consultar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeCompras admin = new ListaDeCompras();
       
       try{
           String selectSQL= "select * from compras";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosCompras(resultado);
               System.out.println("Entrou no consultar compras DAO");
            } 
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }
    
}
