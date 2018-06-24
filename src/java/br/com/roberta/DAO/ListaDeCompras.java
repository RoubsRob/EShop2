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
public class ListaDeCompras {
    private ArrayList<Compras> ListaDeCompras;
    
    public ListaDeCompras(){
        this.ListaDeCompras = new ArrayList();
    }
    public void adicionarCompras(Compras compras){
        ListaDeCompras.add(compras);
    }
    public void adicionarTodosCompras(ResultSet resultado) throws SQLException{
        while (resultado.next()){
            Compras compras;
            compras = new Compras(resultado.getInt("id"),resultado.getInt("idcliente"),resultado.getInt("idproduto"));
            this.adicionarCompras(compras);
            System.out.println("Entrou na lista de compras");
            
        }
    }
    public ArrayList<Compras> getListaDeCompras(){
        return this.ListaDeCompras;
    }
   
    public int getSize(){
        return this.ListaDeCompras.size();
    }
    public Compras getCompras(int i){
        return this.ListaDeCompras.get(i);
    }
 

}
