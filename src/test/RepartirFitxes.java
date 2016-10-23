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
        
       
        String [] noms = {"Roger","Marcos","Gerard","Abel"};
        partida.crearJugadors(noms);
        
        partida.repartirFitxes();
        for (Jugador j: partida.getJugadors()) {
            System.out.println(j);
        }
        int[] aux = {6, 6};
        Fitxa test= new Fitxa(aux);
       System.out.println(partida.buscarFitxa(test));
        
        
    }
    
}
