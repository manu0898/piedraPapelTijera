<%-- 
    Document   : controlador
    Created on : 08-nov-2019, 10:17:32
    Author     : daw209
--%>
<%@page import="Clases.Juego"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Juego j = new Juego();
    
    
    String jugador = "";
    String fraseFinal = "";

    //apuesta del jugador
    if (request.getParameter("spock") != null) {
        jugador = "spock";
    } else {
        if (request.getParameter("tijeras") != null) {
            jugador = "tijera";
        } else {
            if (request.getParameter("piedra") != null) {
                jugador = "piedra";
            } else {
                if (request.getParameter("papel") != null) {
                    jugador = "papel";
                } else {
                    if (request.getParameter("lagarto") != null) {
                        jugador = "lagarto";
                    }
                }
            }
        }
    }

    //apuesta maquina
    String maquina = j.apuesta();

    //juego
    String resultado = j.jugada(jugador,maquina);
    

    fraseFinal = resultado + " Tú has elegido " + jugador + " y la máquina eligió " + maquina;
    //out.print(resultado + " Tú has elegido " + jugador + " y la máquina eligió " + maquina);
    session.setAttribute("frase", fraseFinal);
    
    response.sendRedirect("../Vistas/resultado.jsp");

%>