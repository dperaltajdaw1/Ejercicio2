package ende.main;

import ende.jugador.Juego;
import ende.jugador.Jugador;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Main {
    public static void main(String args[])
    {
    	Juego juego1 = new Juego();
    	Jugador jugador1 = new Jugador("Carlos");
    	Jugador jugador2 = new Jugador("Carla");
    	
    	juego1.jugar(jugador1, jugador2);
    	
    	
    }
}
/**
 *
 */
