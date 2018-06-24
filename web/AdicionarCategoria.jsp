<%-- 
    Document   : AdicionarCategoria
    Created on : 16/11/2017, 02:31:56
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" onsubmit="testaForm()">
        <title>Adicionar Categoria</title>
    </head>
    <body>
        <h1>Entre com nome da categoria:</h1>
        
        <h1><form action="AdicionaCategoria" method="POST">
        Nome categoria: <input type="text" name="descricao"> <br>
        <input type="submit" value="Submeter">
        <input type="reset">
<input type="reset"></form></h1>
        
        <!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("descricao")[0].value == "" || document.getElementsByName("descricao")[0].value.length < 4){
	alert("Entre com descricao corretamente!");
	return false;
	
	}  
	return true;
}
</script>
<!-- Fim JavaScript-->


    </body>
</html>
