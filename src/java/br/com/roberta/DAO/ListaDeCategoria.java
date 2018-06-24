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
public class ListaDeCategoria {
    private ArrayList<Categoria> ListaDeCategoria;
    
    public ListaDeCategoria(){
        this.ListaDeCategoria = new ArrayList();
    }
    public void adicionarCategoria(Categoria categoria){
        ListaDeCategoria.add(categoria);
    }
    public void adicionarTodosCategoria(ResultSet resultado) throws SQLException{
        while (resultado.next()){
            Categoria categoria;
            categoria = new Categoria(resultado.getInt("id"),resultado.getString("descricao"));
            this.adicionarCategoria(categoria);
            
            System.out.println("Entrou na lista de categoria");
            
        }
    }
    public ArrayList<Categoria> getListaDeCategoria(){
        return this.ListaDeCategoria;
    }
   
    public int getSize(){
        return this.ListaDeCategoria.size();
    }
    public Categoria getCategoria(int i){
        return this.ListaDeCategoria.get(i);
    }
 

}
