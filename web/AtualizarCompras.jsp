<%-- 
    Document   : AtualizarCompras
    Created on : 16/11/2017, 04:31:10
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Compras</title>
    </head>
    <body>
        <h1>Entre com id da Compra para atualizar sua compra:</h1>
        
        <h2><form action="AtualizaCompra" method="POST" onsubmit="testaForm()">
        Id Compra <input type="text" name="id"> <br>
        Id Cliente:<input type="text" name="idcliente"><br>
        Id Produto<input type="text" name="idproduto"><br>
        
        <input type="submit" value="Submeter"><input type="reset"></form>

        <!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("id")[0].value == "" ){
	alert("Entre com id corretamente!");
	return false;
	
	}  
	if (document.getElementsByName("idcliente")[0].value == "" ){
	alert("Entre com id cliente corretamente!");
	return false;
	
	}  
	if (document.getElementsByName("idproduto")[0].value == "" ){
	alert("Entre com id produto corretamente!");
	return false;
	
	}  

        return true;
}
</script>
<!-- Fim JavaScript-->
   

    </body>
</html>
