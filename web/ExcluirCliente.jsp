<%-- 
    Document   : ExcluirCliente
    Created on : 16/11/2017, 04:13:33
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Excluir Cliente</title>
    </head>
    <body>
        <h1>Entre com cpf do cliente a ser excluído:</h1>
        <form action="ExcluiCliente" method="POST" onsubmit="testaForm()">
        Cpf: <input type="text" name="cpf"><br>       
        <input type="submit" value="Submeter"> <input type="reset"></form>
  <!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("cpf")[0].value == "" || document.getElementsByName("nome")[0].value.length < 11){
	alert("Entre com cpf corretamente!");
	return false;
	}
	return true;
}
</script>

    </body>
</html>
