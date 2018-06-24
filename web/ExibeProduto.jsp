<%-- 
    Document   : ExibeProduto
    Created on : 16/11/2017, 20:38:46
    Author     : Roberta
--%>

<%@page import="br.com.roberta.DAO.Produto"%>
<%@page import="br.com.roberta.DAO.ListaDeProduto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos no Banco</title>
    </head>
    <body>
                <h1>Lista de produtos do sistema: </h1>

                <table>
            <%
                ListaDeProduto resultado = (ListaDeProduto) request.getAttribute("listaproduto");
            for (int i=0; i<resultado.getSize();i++){
                Produto aux= resultado.getProduto(i);
            
             
           %>
            <tr>
            <td> <%=aux.getId()%></td>
            <td><%=aux.getIdcategoria()%> </td>
            <td><%=aux.getNome()%> </td>
            <td><%=aux.getDescricao()%> </td>
            <td><%=aux.getValor()%> </td>
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
