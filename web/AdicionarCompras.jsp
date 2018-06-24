<%-- 
    Document   : AdicionarCompras
    Created on : 16/11/2017, 04:18:57
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Compras</title>
    </head>
    <body>
        
        <h1>Adicionar compras manualmente:
            <form action="AdicionaCompras" method="POST" onsubmit="testaForm()">
        Id Cliente: <input type="text" name="idcliente"> <br>
        Id Produto: <input type="text" name="idproduto"> <br>
        <input type="submit" value="Submeter">
        <input type="reset"></form>
            

</form>
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("idcliente")[0].value == "" ){
	alert("Entre com idcliente corretamente!");
	return false;
	}
	if (document.getElementsByName("idproduto")[0].value == ""){
	alert("Entre com idproduto corretamente!");
	return false;
	}  
	return true;
}
</script>
<!-- Fim JavaScript-->            
    </body>
</html>
