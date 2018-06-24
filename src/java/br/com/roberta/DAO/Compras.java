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
 *id int idcliente int idproduto int
 * @author Roberta
 */
public class Compras {

    private int id;
    private int idcliente;
    private int idproduto;    

    public Compras(int id, int idcliente, int idproduto) {
        this.id = id;
        this.idcliente = idcliente;
        this.idproduto = idproduto;

        }
    
        /**
         * @return the id
         */
        public int getId() {
            return id;
        }

        /**
         * @param id the id to set
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * @return the idcliente
         */
        public int getIdcliente() {
            return idcliente;
        }

        /**
         * @param idcliente the idcliente to set
         */
        public void setIdcliente(int idcliente) {
            this.idcliente = idcliente;
        }

        /**
         * @return the idproduto
         */
        public int getIdproduto() {
            return idproduto;
        }

        /**
         * @param idproduto the idproduto to set
         */
        public void setIdproduto(int idproduto) {
            this.idproduto = idproduto;
        }
    
     public String Consulta(br.com.roberta.DAO.Compras compras) throws SQLException{
       Conexao conexao = new Conexao();
       String s = "";
       try{
           PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT senha FROM Compras WHERE id LIKE ?%");
           sql.setInt(1, compras.getId());
           ResultSet resultado = sql.executeQuery();
           System.out.println(resultado);
            while (resultado.next()){
                s = resultado.getString("id");
                //compras.setId(s);
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return s;
    }
   
}

