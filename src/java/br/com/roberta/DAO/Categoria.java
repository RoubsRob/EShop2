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
public class Categoria {
    
    private int id;
    private String descricao;

    public Categoria(int id,String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    public Categoria(){
        
    }
    
    
    public String getDescricao() {
        return descricao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String Consulta(Categoria categoria) throws SQLException{
       Conexao conexao = new Conexao();
       String s = "";
       try{
           PreparedStatement sql = conexao.getConexao().prepareStatement("SELECT senha FROM Categoria WHERE id LIKE ?%");
           sql.setInt(1, categoria.getId());
           ResultSet resultado = sql.executeQuery();
           System.out.println(resultado);
            while (resultado.next()){
                s = resultado.getString("descricao");
                categoria.setDescricao(s);
            }
       }catch (SQLException e){
           e.printStackTrace();
       }finally{
        
        conexao.closeConexao();
    }
       return s;
    }
}

    
