/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.roberta.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Roberta
 */
public class ListaDeProduto {
    private ArrayList<Produto> ListaDeProduto;
    
    public ListaDeProduto(){
        this.ListaDeProduto = new ArrayList();
    }
    public void adicionarProduto(Produto produto){
        ListaDeProduto.add(produto);
    }
    public void adicionarTodosProduto(ResultSet resultado) throws SQLException{
        while (resultado.next()){
            Produto produto;
            produto = new Produto(resultado.getInt("id"),resultado.getInt("idcategoria"),resultado.getString("nome"),resultado.getString("descricao"),resultado.getInt("valor"));
            this.adicionarProduto(produto);
   
            System.out.println("Entrou na lista de produto");
            
        }
    }
    public ArrayList<Produto> getListaDeProduto(){
        return this.ListaDeProduto;
    }
   
    public int getSize(){
        return this.ListaDeProduto.size();
    }
    public Produto getProduto(int i){
        return this.ListaDeProduto.get(i);
    }
 

}

