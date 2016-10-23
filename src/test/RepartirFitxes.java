/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domino1.Partida;
import domino1.Jugador;
import domino1.Fitxa;

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

        String[] noms = {"Roger", "Marcos", "Gerard", "Abel"};
        partida.crearJugadors(noms);

        partida.repartirFitxes();
        for (Jugador j : partida.getJugadors()) {
            System.out.println(j);
        }
        int[] aux = {6, 6};
        Fitxa test = new Fitxa(aux);
        int jugadorInicial = (partida.buscarFitxa(test));
        System.out.println("Comença el jugador " + jugadorInicial);
        partida.tirarFitxa(jugadorInicial, test, true);
         int[] aux2 = {6, 5};
        Fitxa test2 = new Fitxa(aux2);
        partida.tirarFitxa(jugadorInicial, test2, false);
        partida.tirarFitxa(jugadorInicial, test, true);
        for (Jugador j : partida.getJugadors()) {
            System.out.println(j);
        }
        System.out.println(partida.getTablero());
        
    }

}
