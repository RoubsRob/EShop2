<%-- 
    Document   : ExcluirCompras
    Created on : 16/11/2017, 04:44:44
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Compra</title>
    </head>
    <body>

        <h1>Entre com id da compra a ser excluída:</h1>
        <form action="ExcluiCompra" method="POST" onsubmit="testForm()">
        IdCompra: <input type="text" name="idcompra"><br>
        <input type="submit" value="Submeter"> <input type="reset"></form>

<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("idcompra")[0].value == "" ){
	alert("Entre com ID corretamente!");
	return false;
	}
	return true;
}
</script>        
        
    </body>
</html>
