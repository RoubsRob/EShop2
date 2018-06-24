<%-- 
    Document   : AtualizarCategoria
    Created on : 16/11/2017, 02:48:46
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Categoria</title>
    </head>
    <body>
        <h1>Entre com id da categoria para atualizar seu nome:</h1>
        
        <h2><form action="AtualizaCategoria" method="POST" onsubmit="testaForm()">
        Id <input type="text" name="id"> <br>
        Novo nome categoria:<input type="text" name="categoria"><br>
        <input type="submit" value="Submeter">
    <input type="reset"></form>
     
        <!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("categoria")[0].value == "" || document.getElementsByName("categoria")[0].value.length < 4){
	alert("Entre com categoria corretamente!");
	return false;
	
	}  
	return true;
}
</script>
<!-- Fim JavaScript-->
   
    </body>
</html>
