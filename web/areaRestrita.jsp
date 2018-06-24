<%-- 
    Document   : areaRestrita
    Created on : 09/11/2017, 05:59:03
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Área Restrita</title>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
    </head>
    <body>
        <h1>Area restrita! 
        <h2>Login autorizado somente para administradores do site
            <form action="VerificarLogin" method="POST" onsubmit="testaForm()">
        Nome <input type="text" name="nome"> <br>
        Senha <input type="password" name="senha"><br>
        <input type="submit" value="Login"></h1>
            </form>
            
            
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("nome")[0].value == "" || document.getElementsByName("nome")[0].value.length < 2){
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
