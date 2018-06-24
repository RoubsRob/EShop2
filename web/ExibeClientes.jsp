<%-- 
    Document   : ExibeClientes
    Created on : 16/11/2017, 21:48:22
    Author     : Roberta
--%>

<%@page import="br.com.roberta.DAO.Clientes"%>
<%@page import="br.com.roberta.DAO.ListaDeClientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>

                <h1>Lista de clientes do sistema:</h1>
    
                <table>
                    <tr>
            <%
                ListaDeClientes resultado = (ListaDeClientes) request.getAttribute("listaclientes");
            for (int i=0; i<resultado.getSize();i++){
                Clientes aux= resultado.getClientes(i);
            
           %>
            <tr>
            <td> <%=aux.getId()%></td>
            <td><%=aux.getNome()%> </td>
            <td><%=aux.getEndereco()%> </td>
            <td><%=aux.getBairro()%> </td>
            <td><%=aux.getCep()%> </td>
            <td><%=aux.getCpf()%> </td>
            <td><%=aux.getIdentidade()%> </td>
            <td><%=aux.getReferencia()%> </td>
            <td><%=aux.getTel()%> </td>
            <td><%=aux.getCel()%> </td>
            <td><%=aux.getNumcartaocredito()%> </td>
            <td><%=aux.getBandeiracartao()%> </td>
            
            </tr>
            
            <%
                }
           %>
            
    </table>
            
            <br><br>
        <a href="areaRestritaMenu1.jsp"> Menu Área Restrita </a> <br><br>
        <a href="index.jsp"> Página inicial </a>

    </body>

    </body>
</html>
