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
public class ListaDeAdmin {
    private ArrayList<Administrador> ListaDeAdmin;
    
    public ListaDeAdmin(){
        this.ListaDeAdmin = new ArrayList();
    }
    public void adicionarAdmin(Administrador administrador){
        ListaDeAdmin.add(administrador);
    }
    public void adicionarTodosAdmin(ResultSet resultado) throws SQLException{
        while (resultado.next()){
            Administrador administrador;
            administrador = new Administrador(resultado.getInt("id"),resultado.getString("login"),resultado.getString("senha"));
            this.adicionarAdmin(administrador);
            
            System.out.println("Entrou na lista de adm");
            
        }
    }
    public ArrayList<Administrador> getListaDeAdmin(){
        return this.ListaDeAdmin;
    }
   
    public int getSize(){
        return this.ListaDeAdmin.size();
    }
    public Administrador getAdministrador(int i){
        return this.ListaDeAdmin.get(i);
    }
    
}
