<%-- 
    Document   : resultado
    Created on : 08-nov-2019, 10:17:57
    Author     : daw209
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>

    <body>

        <%
            out.print(session.getAttribute("frase"));
        %>
        
        <form name="form" action="controladorResultado.jsp" method="POST">
            <br><br><input type="submit" name="bt" value="Volver">
        </form>
    </body>
</html>
