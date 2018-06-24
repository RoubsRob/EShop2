<%-- 
    Document   : adicionarProduto
    Created on : 15/11/2017, 07:33:56
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> <form action="AdicionarProduto" method="POST" onsubmit="testaForm()">
        Adicionar produto no banco de dados:
        Nome: <input type="text" name="nome"> <br>
        Descricao: <input type="text" name="descricao"> <br>
        Valor: <input type="text" name="descricao"> <br>
        Categoria //combobox
        idCategoria //trazer uma combobox
        <input type="submit" value="Submeter">
        <input type="reset">
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("nome")[0].value == "" || document.getElementsByName("nome")[0].value.length < 2){
	alert("Entre com nome corretamente!");
	return false;
	}
	if (document.getElementsByName("descricao")[0].value == "" || document.getElementsByName("descricao")[0].value.length < 3){
	alert("Entre com descricao corretamente!");
	return false;
	}
	return true;
}
</script>
    </body>
</html>
