
<%@page import="br.com.roberta.DAO.Administrador"%>
<%@page import="br.com.roberta.DAO.ListaDeAdmin"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : listaAdm
    Created on : 15/11/2017, 22:04:40
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import= "java.util.*" %>
<%@page import= "br.com.*" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Lista de logins do sistema</title>
    </head>
    <body>
        <h1>Lista de logins do sistema:</h1>
    
            <table>
            <%
                ListaDeAdmin resultado = (ListaDeAdmin) request.getAttribute("listaadmin");
            for (int i=0; i<resultado.getSize();i++){
                Administrador aux= resultado.getAdministrador(i);
            
            %>
            <tr>
            <td> <%=aux.getLogin()%></td>
            <td><%=aux.getSenha()%> </td>
            </tr>
            
            <%
                }
           %>
            </table>
            
                <br><br>
        <a href="areaRestritaMenu1.jsp"> Menu Área Restrita </a> <br><br>
        <a href="index.jsp"> Página inicial </a>
    </body>
</html>
