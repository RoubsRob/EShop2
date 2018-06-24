<%-- 
    Document   : deletarAdm
    Created on : 15/11/2017, 07:00:19
    Author     : Roberta

DeletarAdms
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deletar Adm</title>
    </head>
    <body>
<body>
    <h2>Login<form action="DeletarAdms" method="POST" onsubmit="testaForm()">
        Login a ser deletado: <input type="text" name="delLogin"> <br>
        <input type="submit" value="Submeter">
        <input type="reset">
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("delLogin")[0].value == "" ){
	alert("Entre com valor corretamente!");
	return false;
	}
	return true;
}
</script>

    </body>
</html>
