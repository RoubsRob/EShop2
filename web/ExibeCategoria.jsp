<%-- 
    Document   : ExibeCategoria
    Created on : 16/11/2017, 20:24:00
    Author     : Roberta
--%>

<%@page import="br.com.roberta.DAO.ListaDeCategoria"%>
<%@page import="br.com.roberta.DAO.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
            <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exibe Categoria</title>
    </head>
    <body>

                <h1>Lista de categorias do sistema:</h1>
    
                <table>
            <%
                ListaDeCategoria resultado = (ListaDeCategoria) request.getAttribute("listacategoria");
            for (int i=0; i<resultado.getSize();i++){
                Categoria aux= resultado.getCategoria(i);
            
            %>
            <tr>
            <td> <%=aux.getId()%></td>
            <td><%=aux.getDescricao()%> </td>
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
