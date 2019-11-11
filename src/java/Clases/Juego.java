package Clases;

/**
 *
 * @author daw209
 */
public class Juego {

    /**
     * Constructor de la clase
     */
    public Juego() {
    }

    /**
     * Método para elegir aleatoriamente la apuesta que realiza la máquina
     * @return apuesta de la máquina
     */
    public String apuesta() {
        String maquina = "";
        int aux = (int) (Math.random() * 5 + 1);
        
        switch (aux) {
            case 1:
                maquina = "piedra";
                break;
            case 2:
                maquina = "papel";
                break;
            case 3:
                maquina = "tijera";
                break;
            case 4:
                maquina = "lagarto";
                break;
            case 5:
                maquina = "spock";
                break;
        }
        return maquina;
    }

    /**
     * Método para determinar el ganador en función de la elección del jugador
     * y la de la máquina.
     * @param jugador elección del jugador
     * @param maquina elección de la máquina
     * @return resultado del enfrentamiento entre jugador y máquina
     */
    public String jugada(String jugador, String maquina) {
        String resultado = "";
        
        //jugador elige tijera: Si la máquina elige lagarto o papel, gana; si elige spock o piedra, pierde; si elige tijera, empatan
        if (jugador.equals("tijera") && maquina.equals("lagarto") || jugador.equals("tijera") && maquina.equals("papel")) {
            resultado = "Has ganado!";
        } else {
            if (jugador.equals("tijera") && maquina.equals("tijera")) {
                resultado = "Habéis empatado";
            } else {
                if (jugador.equals("tijera") && maquina.equals("spock") || jugador.equals("tijera") && maquina.equals("piedra")) {
                    resultado = "Has perdido...";
                }
            }
        }

        //jugador elige papel: Si la máquina elige piedra o spock, gana; si elige lagarto o tijera, pierde; si elige papel, empatan
        if (jugador.equals("papel") && maquina.equals("piedra") || jugador.equals("papel") && maquina.equals("spock")) {
            resultado = "Has ganado!";
        } else {
            if (jugador.equals("papel") && maquina.equals("papel")) {
                resultado = "Habéis empatado";
            } else {
                if (jugador.equals("papel") && maquina.equals("lagarto") || jugador.equals("papel") && maquina.equals("tijera")) {
                    resultado = "Has perdido...";
                }
            }
        }

        //jugador elige piedra: Si la máquina elige lagarto o tijera, gana; si elige spock o papel, pierde; si elige piedra, empatan
        if (jugador.equals("piedra") && maquina.equals("lagarto") || jugador.equals("piedra") && maquina.equals("tijera")) {
            resultado = "Has ganado!";
        } else {
            if (jugador.equals("piedra") && maquina.equals("piedra")) {
                resultado = "Habéis empatado";
            } else {
                if (jugador.equals("piedra") && maquina.equals("papel") || jugador.equals("piedra") && maquina.equals("spock")) {
                    resultado = "Has perdido...";
                }
            }
        }

        //jugador elige lagarto: Si la máquina elige spock o papel, gana; si elige tijera o piedra, pierde; si elige lagarto, empatan
        if (jugador.equals("lagarto") && maquina.equals("papel") || jugador.equals("lagarto") && maquina.equals("spock")) {
            resultado = "Has ganado!";
        } else {
            if (jugador.equals("lagarto") && maquina.equals("lagarto")) {
                resultado = "Habéis empatado";
            } else {
                if (jugador.equals("lagarto") && maquina.equals("piedra") || jugador.equals("lagarto") && maquina.equals("tijera")) {
                    resultado = "Has perdido...";
                }
            }
        }

        //jugador elige spock: Si la máquina elige tijera o piedra, gana; si elige papel o lagarto, pierde; si elige spock, empatan
        if (jugador.equals("spock") && maquina.equals("tijera") || jugador.equals("spock") && maquina.equals("piedra")) {
            resultado = "Has ganado!";
        } else {
            if (jugador.equals("spock") && maquina.equals("spock")) {
                resultado = "Habéis empatado";
            } else {
                if (jugador.equals("spock") && maquina.equals("papel") || jugador.equals("spock") && maquina.equals("lagarto")) {
                    resultado = "Has perdido...";
                }
            }
        }
        return resultado;
    }
}
