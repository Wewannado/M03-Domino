/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Partida;
import domino1.Jugador;

/**
 *
 * @author MarcosPortatil
 */
public class RepartirFitxes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Partida partida = new Partida(4);
        partida.crearFitxes();
        
        System.out.println(partida.getFitxes());
       
        Jugador jugador = new Jugador(1, "Roger");
        
        Jugador jugador2 = new Jugador(2, "Ivan");
        Jugador jugador3 = new Jugador(3, "Alex");
        Jugador jugador4 = new Jugador(4, "Marcos");
        partida.repartirFitxes();
        System.out.println(jugador.getNombre());
        System.out.println(jugador2.getNombre());
        System.out.println(jugador3.getNombre());
        System.out.println(jugador4.getNombre());
        
    }
    
}
