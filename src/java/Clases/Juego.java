package Clases;

/**
 *
 * @author daw209
 */
public class Juego {

    public Juego() {
    }

    public String apuesta() {
        String maquina = "";
        int aux = (int) (Math.random() * 5 + 1);
        //apuesta de la maquina
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

    public String jugada(String jugador, String maquina) {
        String resultado = "";
        //jugador elige tijera
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

        //jugador elige papel
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

        //jugador elige piedra
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

        //jugador elige lagarto
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

        //jugador elige spock
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
