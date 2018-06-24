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
public class Cliente_DAO {
    
            public static boolean criar(String nome,String endereco,String bairro,String cep,String estado,String referencia,
                    String identidade,String tel,String cpf,String cel,String ncartao,String 
                            bcartao) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="INSERT INTO CLIENTES(ENDERECO, BAIRRO, CEP, ESTADO, REFERENCIA, "
                      + "CPF, IDENTIDADE, TEL, CEL, NUMCARTAOCREDITO, BANDEIRACARTAO, NOME) "
                      + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?) "; //sem aspas no ?
              //nome,endereco,bairro,cep,estado,referencia,identidade,tel,cpf,cel,ncartao,bcartao
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, endereco);
              sql.setString(2, bairro);
              sql.setString(3, cep);
              sql.setString(4, estado);
              sql.setString(5, referencia);
              sql.setString(6, cpf);
              sql.setString(7, identidade);
              sql.setString(8, tel);
              sql.setString(9, cel);
              sql.setString(10, ncartao);
              sql.setString(11, bcartao);
              sql.setString(12, nome);
              
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
                e.printStackTrace();
                System.out.println("Erro insert SQL");
          }finally{

           conexao.closeConexao();
       }return deu;
       }

    public static boolean atualizar(String nome,String endereco,String bairro,String cep,
                        String estado,String referencia,
                    String identidade,String tel,String cpf,String cel,String ncartao,String 
                            bcartao) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              /*
              //cep cpf identidade tel cel ncartao
              int i = Integer.parseInt(cep);
              int f = Integer.parseInt(cpf);
              int g = Integer.parseInt(identidade);
              int h = Integer.parseInt(tel);
              int r = Integer.parseInt(cel);
              int j = Integer.parseInt(ncartao);
              */
              
              String sqlQ="UPDATE CLIENTES SET endereco = ? , bairro = ? , "
                      + "cep = ? , estado = ? , referencia = ?, identidade = ? , "
                      + "tel = ? , cel = ? , numcartaocredito = ? , bandeiracartao = ? , nome = ? "
                      + " WHERE cpf = ? ";
              
              

              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, endereco);
              sql.setString(2, bairro);
              sql.setString(3, cep);
              sql.setString(4, estado);
              sql.setString(5, referencia);
              sql.setString(6, identidade);
              sql.setString(7, tel);
              sql.setString(8, cel);
              sql.setString(9, ncartao);
              sql.setString(10, bcartao);
              sql.setString(11, nome);
              sql.setString(12, cpf);
              
              sql.executeUpdate();
              
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }
    

    public static boolean deletar(String cpf) throws SQLException{
          Conexao conexao = new Conexao();
          boolean deu = false;
          try{
              String sqlQ="DELETE FROM CLIENTES WHERE CPF LIKE ? ";
              PreparedStatement sql = conexao.getConexao().prepareStatement(sqlQ);
              sql.setString(1, cpf);
              sql.executeUpdate();
              deu = true;
           }catch (SQLException e){
              e.printStackTrace();
          }finally{

           conexao.closeConexao();
       }return deu;
       }


    public static ListaDeClientes Listar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeClientes admin = new ListaDeClientes();
       
       try{
           String selectSQL= "select * from clientes";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosClientes(resultado);
               System.out.println("Entrou no listar clientes DAO");
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

    public static ListaDeClientes Consultar() throws SQLException{
       Conexao conexao = new Conexao();
       ListaDeClientes admin = new ListaDeClientes();
       
       try{
           String selectSQL= "select * from clientes";
           PreparedStatement preparedStatement;
           preparedStatement = conexao.getConexao().prepareStatement(selectSQL);
           ResultSet resultado = preparedStatement.executeQuery();
           if (resultado!= null){
               admin.adicionarTodosClientes(resultado);
               System.out.println("Entrou no consultar clientes DAO");
            } 
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return admin;
    }

    
}
