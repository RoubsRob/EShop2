<%-- 
    Document   : ExibeCompras
    Created on : 16/11/2017, 21:22:24
    Author     : Roberta
--%>

<%@page import="br.com.roberta.DAO.Compras"%>
<%@page import="br.com.roberta.DAO.ListaDeCompras"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
    </head>
    <body>
<body>

                <h1>Lista de comprass do sistema:</h1>
    
                <table>
            <%
                ListaDeCompras resultado = (ListaDeCompras) request.getAttribute("listacompras");
            for (int i=0; i<resultado.getSize();i++){
                Compras aux= resultado.getCompras(i);
                   
             
           %>
            <tr>
            <td> <%=aux.getId()%></td>
            <td><%=aux.getIdcliente()%> </td>
            <td><%=aux.getIdproduto()%> </td>
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
