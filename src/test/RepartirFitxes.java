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
private static boolean ESQUERRA=false;
private static boolean DRETA=true;
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
        int[] aux = {6, 5};
        Fitxa test = new Fitxa(aux);
        int jugadorInicial = (partida.buscarFitxa(test));
        System.out.println("Comença el jugador " + jugadorInicial);
        partida.tirarFitxa(jugadorInicial, test, DRETA);
         int[] aux2 = {6, 5};
        Fitxa test2 = new Fitxa(aux2);
        System.out.println(partida.getTablero());
        partida.tirarFitxa(jugadorInicial, test2, ESQUERRA);
        System.out.println(partida.getTablero());
        
        partida.tirarFitxa(jugadorInicial, test, DRETA);
        for (Jugador j : partida.getJugadors()) {
            System.out.println(j);
        }
        System.out.println(partida.getTablero());
         int[] aux3 = {8, 6};
        Fitxa test5 = new Fitxa(aux3);
        partida.tirarFitxa(jugadorInicial, test5, DRETA);
         System.out.println(partida.getTablero());
    }

}
