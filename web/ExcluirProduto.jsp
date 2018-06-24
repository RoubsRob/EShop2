<%-- 
    Document   : ExcluirProduto
    Created on : 16/11/2017, 01:55:11
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Produto</title>
    </head>
    <body>
        <h1>Excluir Produto</h1><br>
        <h1>Entre com produto a ser excluído:</h1>
        <form action="ExcluiProduto" method="POST" onsubmit="testForm()">
        Nome<input type="text" name="nome"><br>       
        <input type="submit" value="Submeter"> 
        <input type="reset"></form>
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("nome")[0].value == "" || document.getElementsByName("nome")[0].value.length < 2){
	alert("Entre com nome corretamente!");
	return false;
	}
	return true;
}
</script>
    </body>
</html>
