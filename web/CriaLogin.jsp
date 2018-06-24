<%-- 
    Document   : CriaLogin
    Created on : 15/11/2017, 04:50:18
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crie Seu login</title>
    </head>
    <body>
        <h2>Login<form action="CriaLoginServ" method="POST" onsubmit="testaForm()">
        Nome <input type="text" name="addLogin"> <br>
        Senha <input type="password" name="senha"><br>
        <input type="submit" value="Submeter" onclick="return testaForm()">
<input type="reset"></form></h2>

          <!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("addLogin")[0].value == "" || document.getElementsByName("nome")[0].value.length < 2){
	alert("Entre com login corretamente!");
	return false;
	}
	if (document.getElementsByName("senha")[0].value == ""){
	alert("Entre com senha!");
	return false;
	}
        return true;
}
</script>
        
    </body>
</html>
