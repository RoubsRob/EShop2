<%-- 
    Document   : areaRestritaMenu1
    Created on : 15/11/2017, 04:38:04
    Author     : Roberta
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Área Restrita - Menu</title>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        

    </head>
    <body>
        <h1>SEJA BEM VINDO, ${sessionScope.NomeUsuarioLogado} <br>
            ESCOLHA UMA OPCAO PARA CONTINUAR</h1>
        
        <%--  
            PrintWriter out = response.getWriter();
            session = request.getSession();
            session.getAttribute("NomeUsuarioLogado"); 
            out.println("Ola" + session.getAttribute("NomeUsuarioLogado").toString());
        --%>
        <h1>Menu Login: </h1>
        <a href="CriaLogin.jsp">Criar Login </a><br><br>
        <a href ="atualizaLogin.jsp">Atualizar Senha </a><br><br>
        <a href ="deletarAdm.jsp">Excluir Login </a><br><br>
        <form action="ConsultaLogin" method="POST">
        <input type="submit" value="Consultar Logins"></form>
        <br> 
        <h1>Menu Produtos: </h1>
        <br>
        <a href="AdicionarProduto2.jsp">Adicionar Produtos </a><br><br>
        <a href="AtualizarProduto.jsp">Atualizar Produto </a><br><br>
        <a href="ExcluirProduto.jsp">Excluir Produto </a><br><br>
        <form action="ExibirProdutos" method="POST">
        <input type="submit" value="Exibir Produtos"></form>
        
        <h1>Menu Categoria</h1>
        <br>
        <a href="AdicionarCategoria.jsp">Adicionar Categoria </a><br><br>
        <a href="AtualizarCategoria.jsp">Atualizar Categoria </a><br><br>
        <a href="ExcluirCategoria.jsp">Excluir Categoria </a><br><br>
        <form action="ExibirCategoria" method="POST">
        <input type="submit" value="Exibir Categorias"></form>
        
        <h1>Menu Clientes</h1>
        <br>
        <a href="AdicionarCliente.jsp">Adicionar Cliente </a><br><br>
        <a href="AtualizarCliente.jsp">Atualizar Cliente </a><br><br>
        <a href="ExcluirCliente.jsp">Excluir Cliente </a><br><br>
        <form action="ExibirClientes" method="POST">
        <input type="submit" value="Exibir Clientes"></form>       
        <br>
        <h1>Menu Compras</h1>
        <br>
        <a href="AdicionarCompras.jsp">Adicionar Compras </a><br><br>
        <a href="AtualizarCompras.jsp">Atualizar Compras </a><br><br>
        <a href="ExcluirCompras.jsp">Excluir Compras</a><br><br>
        <form action="ExibirCompras" method="POST">
        <input type="submit" value="Consultar Compras"></form>
    </body>
</html>
