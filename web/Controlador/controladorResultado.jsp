<%-- 
    Document   : controladorResultado
    Created on : 04-nov-2019, 8:59:45
    Author     : daw209
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    if (request.getParameter("bt") != null) {
        response.sendRedirect("../index.html");
    }
%>
