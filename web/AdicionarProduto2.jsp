<%-- 
    Document   : AdicionarProduto2
    Created on : 16/11/2017, 00:12:02
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Produto</title>
        <link rel="stylesheet" type="text/css" href="estilo.css" />

    </head>
    <body>
        <h1>Entre com dados do produto:</h1>
        <form action="AdicionaProduto" method="POST" onsubmit="testaForm()">
        Categoria:  <select name="categoria">
                    <option value="1"> Eletrodomesticos </option>
                    <option value="2"> Informatica</option>
                    <option value="3"> Eletroportateis </option>
                    <option value="1"> Smartphones </option>
                    </select>
        <br>
        Nome        <input type="text" name="nome"><br>
        Descricao   <input type="text" name="descricao"><br>
        Valor       <input type="int" name="valor"><br>
                    <input type="submit" value="Submeter" onclick="testaForm()">
                    <input type="reset">

                 </form>
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
	if (document.getElementsByName("valor")[0].value == "" || document.getElementsByName("valor")[0].value.length < 3){
	alert("Entre com valor corretamente!");
	return false;
	}
	return true;
}
</script>
    </body>
</html>
