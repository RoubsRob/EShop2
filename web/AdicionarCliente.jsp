<%-- 
    Document   : AdicionarCliente
    Created on : 16/11/2017, 03:14:23
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estilo.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Cliente</title>
    </head>
    <body>
        <h1>Entre com dados do cliente:</h1>
        

        <form action="AdicionaCliente" method="POST" onsubmit="testaForm()">
        <br>

        Nome        <input type="text" name="nome"><br>
        Endereco    <input type="text" name="endereco"><br>
        Bairro      <input type="text" name="bairro"><br>
        CEP         <input type="int" name="cep"><br>
        Estado 
	<select name="estado"> 
		<option value="estado">Selecione o Estado</option> 
		<option value="ac">Acre</option> 
		<option value="al">Alagoas</option> 
		<option value="am">Amazonas</option> 
		<option value="ap">Amapá</option> 
		<option value="ba">Bahia</option> 
		<option value="ce">Ceará</option> 
		<option value="df">Distrito Federal</option> 
		<option value="es">Espírito Santo</option> 
		<option value="go">Goiás</option> 
		<option value="ma">Maranhão</option> 
		<option value="mt">Mato Grosso</option> 
		<option value="ms">Mato Grosso do Sul</option> 
		<option value="mg">Minas Gerais</option> 
		<option value="pa">Pará</option> 
		<option value="pb">Paraíba</option> 
		<option value="pr">Paraná</option> 
		<option value="pe">Pernambuco</option> 
		<option value="pi">Piauí</option> 
		<option value="rj">Rio de Janeiro</option> 
		<option value="rn">Rio Grande do Norte</option> 
		<option value="ro">Rondônia</option> 
		<option value="rs">Rio Grande do Sul</option> 
		<option value="rr">Roraima</option> 
		<option value="sc">Santa Catarina</option> 
		<option value="se">Sergipe</option> 
		<option value="sp">São Paulo</option> 
		<option value="to">Tocantins</option> 
	</select>
        
        Referencia  <input type="text" name="referencia"><br>
        CPF         <input type="text" name="cpf"><br>
        Identidade  <input type="text" name="identidade"><br>
        Tel         <input type="text" name="tel"><br>
        Cel         <input type="text" name="cel"><br>
        Numero do Cartao de Credito
            <input type="text" name="ncartao"><br>
        Bandeira do Cartao de Credito
            <input type="text" name="bcartao"><br>
                            
            <input type="submit" value="Submeter">
<input type="reset"></form>
        
        
</form>
<!-- Início JavaScript-->
<script type= "text/javascript">
function testaForm(){
	if (document.getElementsByName("nome")[0].value == "" || document.getElementsByName("nome")[0].value.length < 4){
	alert("Entre com nome corretamente!");
	return false;
	}
	if (document.getElementsByName("endereco")[0].value == "" || document.getElementsByName("endereco")[0].value.length < 6){
	alert("Entre com endereço corretamente!");
	return false;
	}
	if (document.getElementsByName("bairro")[0].value == "" || document.getElementsByName("bairro")[0].value.length < 3){
	alert("Entre com bairro corretamente!");
	return false;
	}
	if (document.getElementsByName("cidade")[0].value == "" || document.getElementsByName("cidade")[0].value.length < 3){
	alert("Entre com cidade corretamente!");
	return false;
	}	
	if (document.getElementsByName("cep")[0].value == "" || document.getElementsByName("cep")[0].value.length < 8){
	alert("Entre com cep corretamente!");
	return false;
	}	
	if (document.getElementsByName("referencia")[0].value == "" || document.getElementsByName("referencia")[0].value.length < 3){
	alert("Entre com referencia corretamente!");
	return false;
	}
	if (document.getElementsByName("cpf")[0].value == "" || document.getElementsByName("cpf")[0].value.length < 11){
	alert("Entre com cpf corretamente!");
	return false;
	}
	if (document.getElementsByName("identidade")[0].value == "" || document.getElementsByName("identidade")[0].value.length < 5){
	alert("Entre com identidade corretamente!");
	return false;
	}	
	if (document.getElementsByName("fixo")[0].value == "" || document.getElementsByName("fixo")[0].value.length < 10){
	alert("Entre com telefone fixo corretamente!");
	return false;
	}
	if (document.getElementsByName("celular")[0].value == "" || document.getElementsByName("celular")[0].value.length < 11){
	alert("Entre com telefone celular corretamente!");
	return false;
	}
	if (document.getElementsByName("ncartao")[0].value == "" || document.getElementsByName("numCartao")[0].value.length < 16){
	alert("Entre com numeração de cartão corretamente!");
	return false;
	}  
	return true;
}
</script>
<!-- Fim JavaScript-->
        
    </body>
</html>
