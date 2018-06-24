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
public class ListaDeClientes {
    private ArrayList<Clientes> ListaDeClientes;
    
    public ListaDeClientes(){
        this.ListaDeClientes = new ArrayList();
    }
    public void adicionarClientes(Clientes clientes){
        ListaDeClientes.add(clientes);
    }
    public void adicionarTodosClientes(ResultSet resultado) throws SQLException{
        while (resultado.next()){
            Clientes clientes;
            clientes = new Clientes(resultado.getInt("id"),resultado.getString("endereco"),resultado.getString("bairro"),resultado.getInt("cep"),resultado.getString("estado"),resultado.getString("referencia"),resultado.getInt("cpf"),resultado.getInt("identidade"),resultado.getInt("tel"),resultado.getInt("cel"),resultado.getInt("numcartaocredito"),resultado.getString("bandeiracartao"),resultado.getString("nome"));
            this.adicionarClientes(clientes);
            
            System.out.println("Entrou na lista de clientes");
            
            //
        }
    }
    public ArrayList<Clientes> getListaDeClientes(){
        return this.ListaDeClientes;
    }
   
    public int getSize(){
        return this.ListaDeClientes.size();
    }
    public Clientes getClientes(int i){
        return this.ListaDeClientes.get(i);
    }
 

}
