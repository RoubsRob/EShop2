<%-- 
    Document   : index
    Created on : 09/11/2017, 05:53:17
    Author     : Roberta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Loja DW</title>

        <link rel="stylesheet" type="text/css" href="estilo.css" />
        
    </head>
    <body>
    <h2>  <a href="areaRestrita.jsp"> Área Restrita</a></h2>
    <h1>Loja DW</h1><br><br>
       
       <div id="todoSite">
           <div id='conteudo'>
               <h1>
        <a href="eletrodomesticos.jsp">Eletrodomesticos</a>
        <a href="informatica.jsp">Informatica</a>
        <a href="Eletroportateis.jsp">Eletroportateis</a>
        <a href="Smartphones.jsp">Smartphones</a><br>
                <form action="BuscaProduto" method="POST">
        <input type="text" name="campoBusca">
        <input type="submit" value="PESQUISAR">
                    </form>
                    
           </div><h1>
       </div> 
        </div>
    </body>
</html>
